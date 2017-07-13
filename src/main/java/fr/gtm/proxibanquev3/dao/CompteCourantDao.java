package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.util.HashMap;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

@Named
@SessionScoped
public class CompteCourantDao extends GenericDao<CompteCourant> implements ICompteCourantDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Class<CompteCourant> getClazz() {
		return CompteCourant.class;
	}

	@Override
	public CompteCourant getCompteCourantFromNumClient(Client client) {
		HashMap<String, Object> parametres = new HashMap<String, Object>();
		parametres.put("numeroClient", client.getNumeroClient());
		return this.findOneResult("CompteCourant.findByNumClient", parametres);
	}

}
