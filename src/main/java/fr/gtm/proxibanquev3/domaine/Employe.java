package fr.gtm.proxibanquev3.domaine;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

/**
 * La classe Employe herite de la classe Humain. Elle possede, en plus des
 * attributs de cette derniere, les attributs login, mdp, et id.
 * 
 * @author LAB
 * @param nom
 *            - un String prenom - un String id - un int login - un String mdp -
 *            un String
 */

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="poste", discriminatorType=DiscriminatorType.STRING)
@Entity
public abstract class Employe {

	// PROPRIETES
	private String login, mdp, nom, prenom;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// CONSTRUCTEURS
	public Employe() {

	}

	public Employe(String nom, String prenom, String login, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}

	// ACCESSEURS ET MUTATEURS
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getId() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
