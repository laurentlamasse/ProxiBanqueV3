package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.Conseiller;

public interface IConseillerDao extends IGenericDao<Conseiller>{

	public Conseiller getConseillerByLogin(String login);
}
