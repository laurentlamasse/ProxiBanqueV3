package fr.gtm.proxibanquev3.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

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
@DiscriminatorValue(value="Gerant")
@NamedQuery(name = "Gerant.login", query = "select e, g from Employe e, Gerant g where e.login LIKE :login AND e.id = g.id")
public class Gerant extends Employe{

	//CONSTRUCTEURS
	public Gerant()
	{
		
	}
	
	public Gerant(String prenom, String nom, String login, String mdp) {
		super(prenom, nom, login, mdp);
	}

	//METHODE
	@Override
	public String toString() {
		return "Gerant [getLogin()=" + getLogin() + ", getMdp()=" + getMdp() + ", getId()=" + getId() + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

	
	
	
	
	
}
