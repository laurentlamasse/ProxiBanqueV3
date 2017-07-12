package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.CompteEpargne;
import fr.gtm.proxibanquev3.service.CompteEpargneService;


@Named
public class CompteEpargneBean implements Serializable{

	@Inject
	private CompteEpargneService service;
	CompteEpargne compteE;
	
	@PostConstruct
	public void init(){
		compteE= new CompteEpargne();
	}
	
	public void creer(){
		service.ajouterCompte(compteE);
	}
	
	public void supprimer(){
		service.supprimerCompte(compteE);
	}
	
	public void lire() {
		service.obtenirCompte(compteE);
	}

	//getters setters
	public CompteEpargne getCompteE() {
		return compteE;
	}

	public void setCompteE(CompteEpargne compteE) {
		this.compteE = compteE;
	}

	
	
}
