package fr.gtm.proxibanquev3.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteEpargneDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;
import fr.gtm.proxibanquev3.service.interfaces.ICompteEpargneService;
/**
 * 
 * @author Stagiaire
 *
 *Cette classe est un bean qui herite de la classe generique GenericService et implemente les interfaces ICompteEpargneService et Serializable
 * 
 */
@Named
@SessionScoped
public class CompteEpargneService extends GenericService<CompteEpargne> implements ICompteEpargneService, Serializable {

	@Inject
	protected ICompteEpargneDao dao;
	@Override
	public CompteEpargne compteNumClient(Client client) {
		return dao.getCompteEpargneFromNumClient(client);
	}
	
	/**
	 * 
	 */

	@Override
	public IGenericDao<CompteEpargne> getDao() {
		return dao;
	}

		
}
