package fr.gtm.proxibanquev3.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;
import fr.gtm.proxibanquev3.service.interfaces.ICompteCourantService;

@Named
public class CompteCourantBean {

	@Inject
	private ICompteCourantService service;
	private List<CompteCourant> listeCompteCourant;

	@PostConstruct
	public void init() {
		service.save(new CompteCourant(54000, 1500, 8));
		service.save(new CompteCourant(582000, 2500, 4));
		service.save(new CompteCourant(1000, 1000, 2));
		service.save(new CompteCourant(4500, 3000, 7));
		
		listeCompteCourant = service.findAll();
	}
	
	//ACCESSEURS ET MUTATEURS
	public List<CompteCourant> getListeCompteCourant() {
		return listeCompteCourant;
	}

	public void setListeCompteCourant(List<CompteCourant> listeCompteCourant) {
		this.listeCompteCourant = listeCompteCourant;
	}		
}
