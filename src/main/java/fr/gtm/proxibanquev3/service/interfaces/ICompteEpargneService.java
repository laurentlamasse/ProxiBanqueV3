package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;

public interface ICompteEpargneService extends IGenericService<CompteEpargne> {

	CompteEpargne compteNumClient(Client client);
}
