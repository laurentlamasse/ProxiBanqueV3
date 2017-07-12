package fr.gtm.proxibanquev3.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.service.interfaces.ICompteEpargneService;
import fr.gtm.proxibanquev3.dao.interfaces.ICompteEpargneDao;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;

@Named
@SessionScoped
public class CompteEpargneService implements ICompteEpargneService, Serializable {
	@Inject
	ICompteEpargneDao compteDao;
	List<Compte> liste;

	public void ajouterCompte(CompteEpargne compteE) {
		compteDao.createCompte(compteE);
	}

	public void supprimerCompte(CompteEpargne compteE) {
		compteDao.deleteCompte(compteE);
	}

	public CompteEpargne obtenirCompte(CompteEpargne compteE) {
		return compteDao.getCompte(compteE);
	}

	public void modifierCompte(CompteEpargne compteE) {
		compteDao.updateCompte(compteE);
	}

}
