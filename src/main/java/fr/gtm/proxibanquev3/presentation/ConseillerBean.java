package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.service.ConseillerService;


@Named
public class ConseillerBean implements Serializable{

	@Inject 
	ConseillerService service;

	Conseiller conseiller; 
	List<Conseiller> liste;
	
	@PostConstruct
	public void init() {
		conseiller= new Conseiller();
	}
	
	public void creer() {
		System.out.println("===================================================================================="+conseiller+"====================================================");
		service.save(conseiller);
	}
	
	public void supprimer() {
		service.delete(conseiller.getId());
	}

	//accesseurs et mutateurs
	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public List<Conseiller> getListe() {
		return liste;
	}

	public void setListe(List<Conseiller> liste) {
		this.liste = liste;
	}
	
	
}
