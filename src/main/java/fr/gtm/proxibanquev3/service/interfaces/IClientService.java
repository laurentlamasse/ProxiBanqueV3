package fr.gtm.proxibanquev3.service.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientService extends IGenericService<Client> {
	List<Client> findByIDConseiller(int id);	
}
