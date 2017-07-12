package fr.gtm.proxibanquev3.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.service.interfaces.ICompteCourantService;

@Named
@SessionScoped
public class CompteCourantService extends GenericService<CompteCourant> implements ICompteCourantService, Serializable {

	// PROPRIETE
	@Inject
	protected ICompteCourantDao dao;

	// METHODES
	@Override
	public IGenericDao<CompteCourant> getDao() {
		return dao;
	}
}
