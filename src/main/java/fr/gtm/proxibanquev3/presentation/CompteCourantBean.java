package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.service.CompteCourantService;

@Named
public class CompteCourantBean implements Serializable{
	
	@Inject
	private CompteCourantService service;
	CompteCourant compteCourant;
	
	@PostConstruct
	public void init(){
		compteCourant= new CompteCourant();
	}
	
	public void creer(){
		service.ajouterCompte(compteCourant);
	}
	
	public void supprimer(){
		service.supprimerCompte(compteCourant);
	}

	public void modifier() {
		service.modifierCompte(compteCourant);
	}
	
	public void lire() {
		service.obtenirCompte(compteCourant);
	}

	//getters setters
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	
}
