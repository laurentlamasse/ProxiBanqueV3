package fr.gtm.proxibanquev3.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.service.interfaces.IConseillerService;
import fr.gtm.proxibanquev3.dao.interfaces.IConseillerDao;
import fr.gtm.proxibanquev3.domaine.Conseiller;

@Named
@SessionScoped
public class ConseillerService implements IConseillerService, Serializable {

	@Inject
	IConseillerDao conseillerDao;

	/**
	 * @author LAB Cette methode permet a un gerant de creer un conseiller. Elle
	 *         ne prend aucun parametre et renvoie un conseiller.
	 * @return Conseiller
	 */
	public void creerConseiller(Conseiller conseiller) {

		conseillerDao.createConseiller(conseiller);

	}

	/**
	 * @author LAB Cette methode permet a un gerant d'afficher la liste des
	 *         conseillers presents en base de donnees. Elle ne prend aucun
	 *         parametre, et renvoie une liste de conseillers.
	 * @return List
	 */
	public List<Conseiller> getListeConseiller() {
		List<Conseiller> listeConseiller = null;
		listeConseiller = conseillerDao.getListConseiller();
		return listeConseiller;
	}

	public void supprimerConseiller(Conseiller conseiller) {
		conseillerDao.deleteConseiller(conseiller);
	}
}
