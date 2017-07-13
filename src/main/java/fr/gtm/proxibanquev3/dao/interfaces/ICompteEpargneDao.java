package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;

public interface ICompteEpargneDao extends IGenericDao<CompteEpargne>{
	
	CompteEpargne getCompteEpargneFromNumClient(Client client);

}
