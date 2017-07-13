package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.NamedQuery;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.domaine.Gerant;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;
import fr.gtm.proxibanquev3.service.interfaces.IConseillerService;
import fr.gtm.proxibanquev3.service.interfaces.IGerantService;

/**
 * Bean manage qui sera instancie par la page home.jsf. Cette classe permet de
 * faire le binding entre les elements du formulaire de login sur la page JSF et
 * le login enregistre en base dans la table Employe. C'est dans ce bean que
 * l'on va creer la session de l'utilisateur.
 * 
 * @author Bilal HALABI et Laurent LAMASSE
 */
@Named
@NamedQuery(name = "Employe.login", query = "select e from Employe e where e.login LIKE :login AND e.mdp LIKE :mdp")
public class LoginBean implements Serializable {

	/**
	 * Objet de type IClientService dont le cycle de vie sera gere par le
	 * conteneur CDI. Cet objet permet d'effectuer tous les traitements
	 * necessaires sur les clients. C'est par l'intermediaire de cet objet que
	 * nous accederons a la couche DAO de l'application.
	 */
	@Inject
	private IConseillerService serviceConseiller;
	@Inject
	private IGerantService serviceGerant;
	
	private String login;
	private String mdp;
	private boolean admin;
	
	@PostConstruct
	public void init()
	{
	}

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
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String connecter() {
		Conseiller conseiller = serviceConseiller.getConseillerByLogin(login, mdp);
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(conseiller != null)
		{
			this.setAdmin(true);
			context.getExternalContext().getSessionMap().put("id", conseiller.getId());
			context.getExternalContext().getSessionMap().put("prenom", conseiller.getPrenom());
			context.getExternalContext().getSessionMap().put("nom", conseiller.getNom());
			return "userhome?faces-redirect=true";
		}
		
		Gerant gerant = serviceGerant.getGerantByLogin(login, mdp);
		if(gerant != null)
		{
			this.setAdmin(false);
			context.getExternalContext().getSessionMap().put("id", gerant.getId());
			context.getExternalContext().getSessionMap().put("prenom", gerant.getPrenom());
			context.getExternalContext().getSessionMap().put("nom", gerant.getNom());
			return "userhome?faces-redirect=true";
		}
		context.addMessage(null, new FacesMessage("Unknown login, try again"));
		
		return null;
	}
	
	public String deconnecter()
	{
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
	}

}
