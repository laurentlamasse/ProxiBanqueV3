package fr.gtm.proxibanquev3.dao;

import java.util.HashMap;
import java.util.List;

import fr.gtm.proxibanquev3.dao.interfaces.IEmployeDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Employe;

public class EmployeDao extends GenericDao<Employe> implements IEmployeDao {

	@Override
	public Class<Employe> getClazz() {
		return Employe.class;
	}
	
	@Override
	public Employe findByLoginAndPassword(String login, String password) {
		HashMap<String, Object> parametres = new HashMap<String, Object>();
		parametres.put("login", login);
		parametres.put("mdp", password);
		return this.findOneResult("Employe.login", parametres);
	}
}
