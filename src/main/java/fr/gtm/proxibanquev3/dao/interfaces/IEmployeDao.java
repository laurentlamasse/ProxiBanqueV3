package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.Employe;

public interface IEmployeDao extends IGenericDao<Employe> {

	Employe findByLoginAndPassword(String login, String password);
}
