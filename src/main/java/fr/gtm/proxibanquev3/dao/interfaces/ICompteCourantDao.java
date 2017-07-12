package fr.gtm.proxibanquev3.dao.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

public interface ICompteCourantDao{

	List<Compte> getListCompte(int id);
	CompteCourant getCompte(CompteCourant compteC);
	void updateCompte(CompteCourant compteC);
	void createCompte(CompteCourant compteC);
	void deleteCompte(CompteCourant compteC);
}
