package fr.gtm.proxibanquev3.service;

import javax.inject.Inject;

import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGerantDao;
import fr.gtm.proxibanquev3.domaine.Gerant;
import fr.gtm.proxibanquev3.service.interfaces.IGerantService;

public class GerantService extends GenericService<Gerant> implements IGerantService {

	@Inject
	IGerantDao dao;

	@Override
	public Gerant getGerantByLogin(String login, String password) {
		Gerant gerant = dao.getGerantByLogin(login);

		if (gerant != null) {
			if (!gerant.getMdp().equals(password))
				gerant = null;
		}

		return gerant;
	}

	@Override
	public IGenericDao<Gerant> getDao() {
		return dao;
	}

}
