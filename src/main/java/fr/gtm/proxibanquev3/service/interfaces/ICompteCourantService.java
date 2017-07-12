package fr.gtm.proxibanquev3.service.interfaces;

import java.util.List;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

public interface ICompteCourantService {

	void ajouterCompte(CompteCourant compteC);
	void supprimerCompte(CompteCourant compteC);
	CompteCourant obtenirCompte(CompteCourant compteC);
	List<Compte> obtenirListeCompte(Client client);
}
