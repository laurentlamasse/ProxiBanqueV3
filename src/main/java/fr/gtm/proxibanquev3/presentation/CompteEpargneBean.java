package fr.gtm.proxibanquev3.presentation;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;
import fr.gtm.proxibanquev3.service.interfaces.ICompteEpargneService;

@Named
public class CompteEpargneBean {

	@Inject
	private ICompteEpargneService service;
	private List<CompteEpargne> listeCompteEpargne;
	private CompteEpargne compteEpargne;
	private Client client;
	

	@PostConstruct
	public void init() {
		compteEpargne = new CompteEpargne();
	}
	
	public void lire(){
		service.compteNumClient(client);
	}
	
	public void supprimer(){
		service.delete(compteEpargne.getNumeroCompte());
	}
	
	public void modifier(){
		service.update(compteEpargne);
	}
	
	public void ajouter(){
		service.save(compteEpargne);
	}
	
	//accesseurs et mutateurs

	

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public List<CompteEpargne> getListeCompteEpargne() {
		return listeCompteEpargne;
	}

	public void setListeCompteEpargne(List<CompteEpargne> listeCompteEpargne) {
		this.listeCompteEpargne = listeCompteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
