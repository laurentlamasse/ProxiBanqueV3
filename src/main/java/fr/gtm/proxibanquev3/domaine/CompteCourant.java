package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * La classe CompteCourant herite de la classe abstraite Compte. Elle est
 * composee d'un constructeur, de getters/setters, de la methode toString().
 * Elle possede un attribut, 'decouvert', que ne possede pas la classe Compte.
 * L'autre classe qui herite de la classe Compte est CompteEpargne
 * 
 * @author LAB
 * @param numeroCompte
 *            - un int solde - un float decouvert - un int numeroClient - un int
 */

@Entity
@PrimaryKeyJoinColumn(name = "numeroCompte")
public class CompteCourant extends Compte {

	// PROPRIETES
	private int decouvert;

	// CONSTRUCTEURS
	public CompteCourant() {

	}
	
	public CompteCourant(float solde, int decouvert, int numeroClient) {
		super(solde, numeroClient);
		this.decouvert = decouvert;
	}

	public CompteCourant(int numeroCompte, float solde, int decouvert, int numeroClient) {
		super(numeroCompte, solde, numeroClient);
		this.decouvert = decouvert;
	}

	// ACCESSEURS ET MUTATEURS
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	//METHODE
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", getNumeroCompte()=" + getNumeroCompte() + ", getSolde()="
				+ getSolde() + "]";
	}

}
