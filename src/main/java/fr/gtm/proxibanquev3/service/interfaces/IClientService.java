package fr.gtm.proxibanquev3.service.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientService {

	List<Client> tousClient();
	void ajouterClient(Client client);
	void supprimerClient(Client client);
	void modifierClient(Client client);
	Client obtenirClient(Client client);
	List<Client> listeClient(int numConseiller);
	
}
