package fr.gtm.proxibanquev3.service;

import java.util.List;

import javax.inject.Inject;

import fr.gtm.proxibanquev3.dao.interfaces.IEmployeDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.Employe;
import fr.gtm.proxibanquev3.service.interfaces.IEmployeService;

public class EmployeService extends GenericService<Employe> implements IEmployeService {

	// PROPRIETE
	@Inject
	protected IEmployeDao dao;

	@Override
	public IGenericDao<Employe> getDao() {

		return dao;
	}

	@Override
	public boolean login(String login, String password) {
		
		return false;
	}

}
