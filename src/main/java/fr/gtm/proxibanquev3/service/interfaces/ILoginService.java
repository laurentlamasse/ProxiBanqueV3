package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.domaine.Gerant;

public interface ILoginService {

	boolean loginConseiller(Conseiller conseiller);
	boolean loginGerant(Gerant gerant);
}
