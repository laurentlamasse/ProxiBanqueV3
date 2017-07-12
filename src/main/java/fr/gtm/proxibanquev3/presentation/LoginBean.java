package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.domaine.Gerant;
import fr.gtm.proxibanquev3.domaine.Login;
import fr.gtm.proxibanquev3.service.LoginService;

@Named
@SessionScoped
public class LoginBean implements Serializable{

	//PROPRIETES
	Login login;
	Conseiller conseiller;
	Gerant gerant;
	@Inject 
	LoginService service;
	
	@PostConstruct
	public void init() {
		Login login = new Login();
	}
	
	public void connecter() {
		if (login.isConseiller()==true)
		{
			service.loginConseiller(conseiller);
		}
		else {
			service.loginGerant(gerant);
		}
	}

	//getters setters
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	
	
}
