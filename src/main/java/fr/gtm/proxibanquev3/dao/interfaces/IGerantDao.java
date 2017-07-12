package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.Gerant;

public interface IGerantDao {

	Gerant getGerant(String login);

}
