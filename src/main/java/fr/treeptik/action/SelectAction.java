package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.model.Role;

public class SelectAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<Role> roles;
	private String yourRole;

	public SelectAction(){
		Role user = new Role();
		user.setId(1);
		user.setRole("ROLE_USER");
		Role admin = new Role();
		admin.setId(1);
		admin.setRole("ROLE_ADMIN");
		roles = new ArrayList<>();
		roles.add(user);
		roles.add(admin);
	}
	
	public Role getDefaultRole(){
		return new Role(1, "ROLE_USER");
	}
	
	public String execute() {
		return SUCCESS;
	}
 
	public String display() {
		return NONE;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getYourRole() {
		return yourRole;
	}

	public void setYourRole(String yourRole) {
		this.yourRole = yourRole;
	}
}
