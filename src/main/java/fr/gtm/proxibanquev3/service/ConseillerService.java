package fr.gtm.proxibanquev3.service;

import java.util.List;

import javax.inject.Inject;

import fr.gtm.proxibanquev3.dao.interfaces.IConseillerDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.service.interfaces.IConseillerService;

public class ConseillerService extends GenericService<Conseiller> implements IConseillerService {

	@Inject
	IConseillerDao dao;
	
	@Override
	public Conseiller getConseillerByLogin(String login, String password) {
		Conseiller conseiller = dao.getConseillerByLogin(login);
		
		if(conseiller != null)
		{
			if(!conseiller.getMdp().equals(password))
				conseiller = null;
		}
		
		return conseiller;
	}

	@Override
	public IGenericDao<Conseiller> getDao() {
		return dao;
	}

}
