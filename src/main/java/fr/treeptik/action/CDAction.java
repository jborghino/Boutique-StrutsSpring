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
import fr.treeptik.model.CD;
import fr.treeptik.service.CDService;

//@ParentPackage(value="default")
@Namespace("/cd")
@Component
@InterceptorRefs({ 
		@InterceptorRef(value = "defaultStack"),
		@InterceptorRef(value = "logger"), 
		@InterceptorRef(value = "customInterceptor"), 
		@InterceptorRef(value = "timer") })
public class CDAction extends ActionSupport implements ModelDriven<CD> {

	private static final long serialVersionUID = 1L;

	@Valid
	private CD cd = new CD();

	@Autowired
	private CDService cdService;
	private List<CD> cds = new ArrayList<>();

	@Override
	public CD getModel() {
		return cd;
	}

	@Action(value = "add", results = {
			@Result(name = SUCCESS, type = "redirectAction", location = "list.action"),
			@Result(name = INPUT, location = "/cd/add.jsp") })
	public String saveCD() throws ServiceException {
		cdService.update(cd);
		return SUCCESS;
	}

	@Action(value = "list", results = { @Result(name = SUCCESS, location = "/cd/list.jsp") })
	@SkipValidation
	public String listCD() throws ServiceException {
		cds = cdService.findAll();
		return SUCCESS;
	}

	@Action(value = "delete", results = { @Result(name = SUCCESS, type = "redirectAction", location = "list.action") })
	@SkipValidation
	public String deleteCD() throws ServiceException {
		cdService.remove(cd);
		return SUCCESS;
	}

	@Action(value = "update", results = { @Result(name = SUCCESS, location = "/cd/add.jsp") })
	@SkipValidation
	public String updateCD() throws ServiceException {
		cd = cdService.findById(cd.getId());
		// cdService.update(cd);
		return SUCCESS;
	}

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}

	public List<CD> getCds() {
		return cds;
	}

	public void setCds(List<CD> cds) {
		this.cds = cds;
	}

	@Override
	public void validate() {

		if (cd.getTitre() == null || "".equals(cd.getTitre())) {
			this.addFieldError("titre", "Titre vide");
		}
		
		if (cd.getAuteur() == null || "".equals(cd.getAuteur())) {
			this.addFieldError("auteur", "Auteur vide");
		}
		
		if (cd.getPrix() == null || "".equals(cd.getPrix())) {
			this.addFieldError("prix", "Prix vide");
		}
		
		if (cd.getPrix() < 0.0) {
			this.addFieldError("prix", "Prix negatif");
		}
	}

}
