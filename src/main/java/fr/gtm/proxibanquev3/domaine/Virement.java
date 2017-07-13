package fr.gtm.proxibanquev3.domaine;

public class Virement {

	// PROPRIETES
	private int numCompteCred;
	private  int numCompteDeb;
	private float somme;

	// CONSTRUCTEURS
	public Virement() {
		super();
	}

	public Virement(int numCompteCred, int numCompteDeb, float somme) {
		super();
		this.numCompteCred = numCompteCred;
		this.numCompteDeb = numCompteDeb;
		this.somme = somme;
	}

	// ACCESSEURS ET MUTATEURS
	
	public float getSomme() {
		return somme;
	}

	

	public int getNumCompteCred() {
		return numCompteCred;
	}

	public void setNumCompteCred(int numCompteCred) {
		this.numCompteCred = numCompteCred;
	}

	public int getNumCompteDeb() {
		return numCompteDeb;
	}

	public void setNumCompteDeb(int numCompteDeb) {
		this.numCompteDeb = numCompteDeb;
	}

	public void setSomme(float somme) {
		this.somme = somme;
	}
}
