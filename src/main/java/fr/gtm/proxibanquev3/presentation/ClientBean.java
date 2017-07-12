package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import fr.gtm.proxibanquev3.service.interfaces.IClientService;
import fr.gtm.proxibanquev3.domaine.Client;

@Named
public class ClientBean implements Serializable{
	
	@Inject
	private IClientService service;

	Client client;
	List<Client> liste;
	
	@PostConstruct
	public void init() {
		client=new Client();
	}
	
	public void rechercher() {
		service.obtenirClient(client);
	}
	
	public void modifier() {
		service.modifierClient(client);
	}

	public void supprimer() {
		service.supprimerClient(client);
	}

	
	//getters setters
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getListe() {
		return liste;
	}

	public void setListe(List<Client> liste) {
		this.liste = liste;
	}
	
	
}
