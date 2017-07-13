package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Classe de la couche domaine qui permet de decrire un client du systeme
 * d'information proxibanque. Le client est identifie par son numero. Il s'agit
 * de sa cle primaire lorsqu'il est enregistre en base.
 * 
 * Le client est caracterise par un nom, un prenom, une adresse (chemin, code
 * postal, ville), un numero de telephone et une adresse email.
 * 
 * Chaque client est affecte a un conseiller.
 * 
 * Il existe 2 types de clients : les clients particuliers et les entreprises
 * 
 * @author Bilal HALABI et Laurent LAMASSE
 */
@Entity
@NamedQuery(name = "Client.byConseillerId", query = "select c from Client c where c.numeroconseiller = :numeroconseiller")
public class Client {

//	public enum typeClient {
//		particulier, entreprise
//	};

	// PROPRIETES
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numeroClient;
	private String nom, prenom, adresse, codepostal, ville, telephone, email;
	private int numeroconseiller;

	//private typeClient type;

	// CONSTRUCTEURS
	public Client() {

	}
	
	public Client(String nom, String prenom, String adresse, String codepostal, String email, String ville,
			String telephone, int numeroconseiller) {
		this.nom = nom;
		this.prenom = prenom;
		this.codepostal = codepostal;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.email = email;
		this.telephone = telephone;
		this.numeroconseiller = numeroconseiller;
		//this.type = typeClient.particulier;
	}

	public Client(String nom, String prenom, String adresse, String codepostal, String email, String ville,
			String telephone, int numeroconseiller, int numeroClient) {
		this.nom = nom;
		this.prenom = prenom;
		this.codepostal = codepostal;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.email = email;
		this.telephone = telephone;
		this.numeroClient = numeroClient;
		this.numeroconseiller = numeroconseiller;
		//this.type = typeClient.particulier;

	}

	// ACCESSEURS ET MUTATEURS
	public int getNumeroconseiller() {
		return numeroconseiller;
	}

	public void setNumeroconseiller(int numeroconseiller) {
		this.numeroconseiller = numeroconseiller;
	}

	// Getters setters
	public String getEmail() {
		return email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

//	public typeClient getType() {
//		return type;
//	}
//
//	public void setType(typeClient type) {
//		this.type = type;
//	}

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

	public void setEmail(String email) {
		this.email = email;
	}

	// METHODE STRING
	@Override
	public String toString() {
		return "Client [nom=" + getNom() + ", prenom=" + getPrenom() + ", adresse=" + adresse + ", codepostal="
				+ codepostal + ", ville=" + ville + ", telephone=" + telephone + ", email=" + email + ", numeroClient="
				+ numeroClient + ", numeroconseiller=" + numeroconseiller;
						//+ ", type=" + type + "]";
	}

}
