package fr.gtm.proxibanquev3.dao.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Client;

public interface IClientDao extends IGenericDao<Client> {

	public List<Client> findByIDConseiller(int id);
}
