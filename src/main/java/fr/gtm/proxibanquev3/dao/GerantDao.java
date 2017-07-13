package fr.gtm.proxibanquev3.dao;

import java.util.List;

import fr.gtm.proxibanquev3.dao.interfaces.IGerantDao;
import fr.gtm.proxibanquev3.domaine.Gerant;

public class GerantDao extends GenericDao<Gerant> implements IGerantDao {

	@Override
	public Gerant getGerantByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<Gerant> getClazz() {
		return Gerant.class;
	}


}
