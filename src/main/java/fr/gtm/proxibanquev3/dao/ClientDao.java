package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.util.HashMap;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.IClientDao;
import fr.gtm.proxibanquev3.domaine.Client;

@Named
@SessionScoped
public class ClientDao extends GenericDao<Client> implements IClientDao, Serializable {

	@Override
	public Class<Client> getClazz() {
		return Client.class;
	}
	
	@Override
	public Client getClientLyon()
	{
		HashMap<String, Object> parametres = new HashMap<String, Object>();
		parametres.put("nom", "CARPY");
		return this.findOneResult("Client.findLyon", parametres);
	}
}
