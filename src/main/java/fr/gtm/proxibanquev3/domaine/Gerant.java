package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;

/**
 * Cette classe herite de la classe Employe, qui est heritee par une autre classe:
 * la classe Conseiller.
 * 
 * @author Stagiaire
 *@param
 *prenom - un String
 *nom - un String
 *id - un int
 *login - un String
 *mdp - un String
 */

@Entity
public class Gerant extends Employe{

	//CONSTRUCTEURS
	public Gerant()
	{
		
	}
	
	public Gerant(String prenom, String nom, int id, String login, String mdp) {
		super(prenom, nom, id, login, mdp);
	}

	//METHODE
	@Override
	public String toString() {
		return "Gerant [getLogin()=" + getLogin() + ", getMdp()=" + getMdp() + ", getId()=" + getId() + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

	
	
	
	
	
}
