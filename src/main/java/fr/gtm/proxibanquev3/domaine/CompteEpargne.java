package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "numeroCompte")
public class CompteEpargne extends Compte {

	// PROPRIETE
	private float remuneration;

	// CONSTRUCTEURS
	public CompteEpargne() {

	}

	public CompteEpargne(int numeroCompte, float solde, float remuneration, int numeroClient) {
		super(numeroCompte, solde, numeroClient);
		this.remuneration = remuneration;
	}

	//ACCESSEURS ET MUTATEURS
	public float getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(float remuneration) {
		this.remuneration = remuneration;
	}

	//METHODE
	@Override
	public String toString() {
		return "CompteEpargne [remuneration=" + remuneration + ", getNumeroCompte()=" + getNumeroCompte()
				+ ", getSolde()=" + getSolde() + ", getClass()=" + getClass() + "]";
	}

}
