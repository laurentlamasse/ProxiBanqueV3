package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;

@Entity
public class Conseiller extends Employe {

	// CONSTRUCTEURS
	public Conseiller() {

	}

	public Conseiller(Integer id, String nom, String prenom, String login, String mdp) {
		super(nom, prenom, id, login, mdp);
	}

	// METHODE
	@Override
	public String toString() {
		return "Conseiller [id=" + getId() + ", getLogin()=" + getLogin() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + "]";
	}

}
