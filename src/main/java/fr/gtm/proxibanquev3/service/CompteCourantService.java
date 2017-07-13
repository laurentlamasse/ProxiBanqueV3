package fr.gtm.proxibanquev3.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.service.interfaces.ICompteCourantService;

/**
 * 
 * @author Stagiaire
 *
 *Cette classe est un bean qui herite de la classe generique GenericService et implemente les interfaces ICompteCourantService et Serializable
 * 
 */
@Named
@SessionScoped
public class CompteCourantService extends GenericService<CompteCourant> implements ICompteCourantService, Serializable {

	// PROPRIETE
	@Inject
	protected ICompteCourantDao dao;

	// METHODES
	@Override
	public IGenericDao<CompteCourant> getDao() {
		return dao;
	}
	
	public CompteCourant compteNumClient(Client client){
		return dao.getCompteCourantFromNumClient(client);
	}
	
}
