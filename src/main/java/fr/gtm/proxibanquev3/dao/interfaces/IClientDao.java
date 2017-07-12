package fr.gtm.proxibanquev3.dao.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientDao {

	List<Client> getListClient(int id);
	void createClient(Client client);
	List<Client> getAllClient();
	Client readClient(Client client);
}
