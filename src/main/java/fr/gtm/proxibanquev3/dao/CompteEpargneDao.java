package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.util.HashMap;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteEpargneDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;

public class CompteEpargneDao extends GenericDao<CompteEpargne> implements ICompteEpargneDao, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Class<CompteEpargne> getClazz() {
		return CompteEpargne.class;
	}

	@Override
	public CompteEpargne getCompteEpargneFromNumClient(Client client) {
		HashMap<String, Object> parametres = new HashMap<String, Object>();
		parametres.put("numeroClient", client.getNumeroClient());
		return this.findOneResult("CompteEpargne.findByNumClient", parametres);
	}

}
