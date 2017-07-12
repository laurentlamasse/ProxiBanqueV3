package fr.gtm.proxibanquev3.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.ClientDao;
import fr.gtm.proxibanquev3.dao.interfaces.IClientDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;

@Named
@SessionScoped
public class ClientService implements IClientService, Serializable {

	@Inject
	IClientDao clientDao;
	/**
	 * Cette methode permet d'ajouter un client en base de donnees a partir d'un
	 * formulaire rempli dans une page web.
	 * 
	 * @param client
	 * @return void
	 */
	public void ajouterClient(Client client) {
		ClientDao clientDao = new ClientDao();
		clientDao.createClient(client);
	}

	/**
	 * Cette methode permet de supprimer un client present en base de donnees
	 * 
	 * @param client
	 * @return void
	 */
	public void supprimerClient(Client client) {
		ClientDao clientDao = new ClientDao();
		clientDao.deleteClient(client);
	}

	/**
	 * Cette methode permet de modifier les informations d'un client enregistre
	 * en base de donnees
	 * 
	 * @param client
	 * @return void
	 */
	public void modifierClient(Client client) {
		ClientDao clientDao = new ClientDao();
		clientDao.updateClient(client);
	}

	/**
	 * Cette methode permet d'obtenir la liste des clients presents en base de
	 * donnees
	 * 
	 * @return List la liste des clients
	 */
	
  
    public List<Client> tousClient() {
    	List<Client> liste;
    	liste=clientDao.getAllClient();
       
        return liste;
    }
	
	/**
	 * Cette methode permet d'obtenir les informations d'un client à partir de
	 * son identifiant
	 * 
	 * @param id du client
	 * @return client l'objet client retourn� par le DAO
	 */
    public Client obtenirClient( Client client) {
		return clientDao.readClient(client);
	}
	
	/**
	 * 
	 * @param conseiller le conseiller sevant � filtrer les clients
	 * @return la liste de clients appartenants � un conseiller
	 */
	public List<Client> listeClient(int numConseiller) {
		List<Client> listeClients;
		ClientDao clientDao = new ClientDao();
		listeClients = clientDao.getListClient(numConseiller);
		return listeClients;
	}

	
}
