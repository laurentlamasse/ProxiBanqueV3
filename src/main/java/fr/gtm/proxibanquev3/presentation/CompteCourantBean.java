package fr.gtm.proxibanquev3.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;
import fr.gtm.proxibanquev3.service.interfaces.ICompteCourantService;
import fr.gtm.proxibanquev3.service.interfaces.ICompteEpargneService;

@Named
public class CompteCourantBean {

	@Inject
	private ICompteCourantService service;
	
	
	private ICompteEpargneService serviceEp;
	private List<CompteCourant> listeCompteCourant;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private List<Compte> listeComptes;
	private Client client;

	@PostConstruct
	public void init() {
		compteCourant=new CompteCourant();
	}
	
	public void lire(){
		service.compteNumClient(client);
	}

	
	public void supprimer(){
		service.delete(compteCourant.getNumeroCompte());
	}
	
	public void modifier(){
		service.update(compteCourant);
	}
	
	public void ajouter(){
		service.save(compteCourant);
	}
	
	public void lireComptes() {
		compteCourant=service.compteNumClient(client)	;
		compteEpargne=serviceEp.compteNumClient(client);
		listeComptes.add(compteCourant);
		listeComptes.add(compteEpargne);
	}
	//ACCESSEURS ET MUTATEURS
	public List<CompteCourant> getListeCompteCourant() {
		return listeCompteCourant;
	}

	public void setListeCompteCourant(List<CompteCourant> listeCompteCourant) {
		this.listeCompteCourant = listeCompteCourant;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}		
	
	
}
