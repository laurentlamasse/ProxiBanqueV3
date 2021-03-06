package fr.gtm.proxibanquev3.service.interfaces;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

public interface ICompteCourantService extends IGenericService<CompteCourant>{

	CompteCourant compteNumClient(Client client);
}
