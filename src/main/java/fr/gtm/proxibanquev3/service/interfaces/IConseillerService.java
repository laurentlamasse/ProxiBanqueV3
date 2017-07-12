package fr.gtm.proxibanquev3.service.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Conseiller;

public interface IConseillerService {

	void creerConseiller(Conseiller conseiller);
	List <Conseiller> getListeConseiller();
	void supprimerConseiller(Conseiller conseiller);
	
}
