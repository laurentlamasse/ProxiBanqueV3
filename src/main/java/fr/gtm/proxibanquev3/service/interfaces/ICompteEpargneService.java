package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.CompteEpargne;

public interface ICompteEpargneService {

	void ajouterCompte(CompteEpargne compteC);
	void supprimerCompte(CompteEpargne compteC);
	CompteEpargne obtenirCompte(CompteEpargne compteC);
}
