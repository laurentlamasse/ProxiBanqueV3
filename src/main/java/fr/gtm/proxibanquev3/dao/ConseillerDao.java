package fr.gtm.proxibanquev3.dao;

import java.util.List;

import fr.gtm.proxibanquev3.dao.interfaces.IConseillerDao;
import fr.gtm.proxibanquev3.domaine.Conseiller;

public class ConseillerDao extends GenericDao<Conseiller> implements IConseillerDao {

	@Override
	public Conseiller getConseillerByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<Conseiller> getClazz() {
		return Conseiller.class;
	}


}
