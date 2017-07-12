package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * @author LAB La classe Compte est une classe abstraite. Elle est implementee
 *         par les classes CompteCourant et CompteEpargne. Elle possede son
 *         constructeur, des getters setters, une methode toString() afin
 *         d'afficher la valeur des parametres.
 *
 * @param numeroCompte
 *            - un int solde - un float numeroClient - un int
 */

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Compte {

	// PROPRIETES
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numeroCompte;
	private float solde;
	private int numeroClient;

	// CONSTRUCTEURS
	public Compte() {

	}

	public Compte(int numeroCompte, float solde, int numeroClient) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.numeroClient = numeroClient;
	}

	// ACCESSEURS ET MUTATEURS
	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

}
