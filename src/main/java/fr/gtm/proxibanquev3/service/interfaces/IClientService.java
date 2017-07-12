package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientService extends IGenericService<Client> {

	Client findLyon();
	
}
