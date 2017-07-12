package fr.gtm.proxibanquev3.dao.interfaces;

import java.util.List;
import fr.gtm.proxibanquev3.domaine.Conseiller;

public interface IConseillerDao{

	void createConseiller(Conseiller conseiller);
	void deleteConseiller(Conseiller conseiller);
	List<Conseiller> getListConseiller();
	Conseiller selectConseiller(String login);
}
