package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientDao extends IGenericDao<Client> {

	Client getClientLyon();
}
