package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import fr.gtm.proxibanquev3.service.interfaces.IClientService;
import fr.gtm.proxibanquev3.domaine.Client;

/**
 * Bean manage qui sera instancie par la page clients.jsf. Cette classe permet
 * de faire le binding entre les elements du tableau sur la page JSF et la liste
 * des clients 'listeClient'.
 * 
 * @author Bilal HALABI et Laurent LAMASSE
 */
@Named
public class ClientBean implements Serializable {

	/**
	 * Objet de type IClientService dont le cycle de vie sera gere par le conteneur CDI.
	 * Cet objet permet d'effectuer tous les traitements necessaires sur les clients.
	 * C'est par l'intermediaire de cet objet que nous accederons a la couche DAO de l'application.
	 */
	@Inject
	private IClientService service;
	private Client client;
	/**
	 * Liste des clients a afficher sur la page JSF
	 */
	private List<Client> listeClient;

	/**
	 * Methode d'initialisation appeler apres l'appel du constructeur par defaut et l'injection de l'objet de type IClientService.
	 */
	@PostConstruct
	public void init() {
		int id = 25;
		listeClient = service.findByIDConseiller(id);
	}
	
	public void delete(int id)
	{
		service.delete(id);
	}

	//ACCESSEURS ET MUTATEURS
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

}
