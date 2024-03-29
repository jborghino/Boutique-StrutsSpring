package fr.treeptik.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@Size(min = 2, max = 10, message = "Le champ nom doit avoir entre 2 et 10 caractères")
//	@NotNull(message = "Le champ nom ne doit pas être nul")
	private String nom;
	
	private String prenom;

//	@Email(message = "Adresse mail non valide")
	private String email;

//	@DateTimeFormat(pattern = "dd/MM/yyy", style = "format incorrect")
//	@Future(message = "La date est incorrecte")
	private Date dateInscription;

	// @Range(message="Le champ age ne doit pas être vide")
	private Integer age;

	private String password;
	
	private String adresse;

	@ManyToOne
	private Role role;
	
	@OneToMany(cascade=CascadeType.REMOVE)
	private List<Commande> listCommande;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", email=" + email
				+ ", dateInscription=" + dateInscription + ", age=" + age
				+ ", password=" + password + "]";
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Commande> getListCommande() {
		return listCommande;
	}

	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}

}
