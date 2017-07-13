package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Gerant;

public interface IGerantService extends IGenericService<Gerant> {

	public Gerant getGerantByLogin(String login, String password);
}
