package fr.gtm.proxibanquev3.service;

import java.sql.SQLException;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.exception.VirementException;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.Virement;


/*@Named
@SessionScoped

public class VirementService {
	
	@Inject
	ICompteDao compteDao;
	
	public void effectuerVirement(Virement virement) 
			throws VirementException
		{
		Compte compteCredite=compteDao.getCompte(virement.getNumCompteCred());
		Compte compteDebite=compteDao.getCompte(virement.getNumCompteDeb());
		
		if (compteDebite.getSolde()>virement.getSomme())
			throw new VirementException();
		
		else {
			compteCredite.setSolde(compteCredite.getSolde()+virement.getSomme());
			compteDebite.setSolde(compteDebite.getSolde()-virement.getSomme());
			
			compteDao.updateCompte(compteCredite);
			compteDao.updateCompte(compteDebite);
		}
	}

}*/
