package fr.gtm.proxibanquev3.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue(value="Conseiller")
@NamedQuery(name = "Conseiller.login", query = "select e, c from Employe e, Conseiller c where e.login LIKE :login AND e.id = c.id")
public class Conseiller extends Employe {

	// CONSTRUCTEURS
	public Conseiller() {
	}

	public Conseiller(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
	}

	// METHODE
	@Override
	public String toString() {
		return "Conseiller [id=" + getId() + ", getLogin()=" + getLogin() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + "]";
	}

}
