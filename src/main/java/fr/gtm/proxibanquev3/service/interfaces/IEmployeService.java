package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Employe;

public interface IEmployeService extends IGenericService<Employe> {

	public boolean login(String login, String password);
}
