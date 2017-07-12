package fr.gtm.proxibanquev3.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.service.interfaces.ICompteCourantService;
import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

@Named
@SessionScoped
public class CompteCourantService implements ICompteCourantService, Serializable {
	@Inject
	ICompteCourantDao compteDao;
	List<Compte> liste;
	
	public void ajouterCompte(CompteCourant compteC) {		
		compteDao.createCompte(compteC);
	}


	public void supprimerCompte(CompteCourant compteC) {
		compteDao.deleteCompte(compteC);
	}

	public CompteCourant obtenirCompte(CompteCourant compteC) {
		return compteDao.getCompte(compteC);
	}

	public List<Compte> obtenirListeCompte(Client client){
		return liste=compteDao.getListCompte(client.getNumeroClient());
	}
	
	public void modifierCompte(CompteCourant compteC) {
		compteDao.updateCompte(compteC);
	}
	
	
}
