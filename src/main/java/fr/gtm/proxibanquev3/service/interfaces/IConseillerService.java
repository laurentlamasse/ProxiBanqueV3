package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Conseiller;

public interface IConseillerService extends IGenericService<Conseiller> {
	public Conseiller getConseillerByLogin(String login, String password);
}
