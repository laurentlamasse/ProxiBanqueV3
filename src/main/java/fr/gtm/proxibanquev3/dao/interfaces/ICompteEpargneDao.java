package fr.gtm.proxibanquev3.dao.interfaces;

import fr.gtm.proxibanquev3.domaine.CompteEpargne;

public interface ICompteEpargneDao {

	CompteEpargne getCompte(CompteEpargne compteC);
	void updateCompte(CompteEpargne compteC);
	void createCompte(CompteEpargne compteC);
	void deleteCompte(CompteEpargne compteC);
}
