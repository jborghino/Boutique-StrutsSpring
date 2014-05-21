package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Client;
import fr.treeptik.model.Role;
import fr.treeptik.service.ClientService;


@Namespace("/client")
@Component
@InterceptorRefs({ 
		@InterceptorRef(value = "defaultStack"),
		@InterceptorRef(value = "logger"), 
		@InterceptorRef(value = "customInterceptor"), 
		@InterceptorRef(value = "timer") })
public class ClientAction extends ActionSupport implements ModelDriven<Client>{

	private static final long serialVersionUID = 1L;

	@Valid
	private Client client = new Client();

	
	@Autowired
	private ClientService clientService;
	private List<Client> clients = new ArrayList<>(); 
	
	@Override
	public Client getModel() {
		return client;
	}
	
	@Action(value = "add", results = {
			@Result(name = SUCCESS, type = "redirectAction", location = "list.action"),
			@Result(name = INPUT, location = "/client/add.jsp") })
	public String saveClient() throws ServiceException{
		clientService.update(client);
		return SUCCESS;
	}

	@Action(value = "list", results = { @Result(name = SUCCESS, location = "/client/list.jsp") })
	@SkipValidation
	public String listClient() throws ServiceException {
		clients = clientService.findAll();
		return SUCCESS;
	}
	
	@Action(value = "delete", results = { @Result(name = SUCCESS, type = "redirectAction", location = "list.action") })
	@SkipValidation
	public String deleteClient() throws ServiceException {
		clientService.remove(client);
		return SUCCESS;
	}
	
	@Action(value = "update", results = { @Result(name = SUCCESS, location = "/client/add.jsp") })
	@SkipValidation
	public String updateClient() throws ServiceException {
		client = clientService.findById(client.getId());
		return SUCCESS;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


}
