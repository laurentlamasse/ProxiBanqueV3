package fr.gtm.proxibanquev3.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.service.interfaces.ILoginService;
import fr.gtm.proxibanquev3.dao.interfaces.IConseillerDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGerantDao;
import fr.gtm.proxibanquev3.domaine.Conseiller;
import fr.gtm.proxibanquev3.domaine.Gerant;


@Named 
@SessionScoped
public class LoginService implements ILoginService, Serializable {
	
	@Inject 
	IConseillerDao conseillerDao;
	@Inject
	IGerantDao dao;
	/**
	 * @author LAB
	 * Cette methode effectue la verification du login et du mot de passe entrer par 
	 * un conseiller dans la page de login.
	 * Si un des champs ne correspond pas aux informations presentes en base de donnees,
	 * la methode renvoie un booleen de valeur 'false'. Dans le cas contraire, elle renverra un
	 * booleen de valeur 'true'
	 * @param conseiller
	 * @return boolean
	 */
	
	public boolean loginConseiller(Conseiller conseiller) {

		Conseiller conseildao=null;
		conseildao = conseillerDao.selectConseiller(conseiller.getLogin());

		if(conseildao == null)
			return false;
		
		if (conseiller.getLogin().equals(conseildao.getLogin()) && conseiller.getMdp().equals(conseildao.getMdp()))
			return true;
		else
			return false;

	}
	
	public boolean loginGerant(Gerant gerant) {

		Gerant gerantDao;
		gerantDao = dao.getGerant(gerant.getLogin());

		if(gerantDao == null)
			return false;
		
		if (gerant.getLogin().equals(gerantDao.getLogin()) && gerant.getMdp().equals(gerantDao.getMdp()))
			return true;
		else
			return false;

	}
}
