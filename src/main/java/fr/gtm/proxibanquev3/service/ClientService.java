package fr.gtm.proxibanquev3.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.IClientDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;

@Named
@SessionScoped
public class ClientService extends GenericService<Client> implements IClientService, Serializable {

	// PROPRIETE
	@Inject
	protected IClientDao dao;

	// METHODES
	@Override
	public IGenericDao<Client> getDao() {
		return dao;
	}
	
	@Override
	public Client findLyon()
	{
		return dao.getClientLyon();
	}
}
