package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

@Named
@SessionScoped
public class CompteCourantDao extends GenericDao<CompteCourant> implements ICompteCourantDao, Serializable {

	@Override
	public Class<CompteCourant> getClazz() {
		return CompteCourant.class;
	}

}
