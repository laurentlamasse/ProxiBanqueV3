package fr.gtm.proxibanquev3.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {

	//PROPRIETES
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String mdp;
	private boolean conseiller;
	
	//CONSTRUCTEURS
	public Login() {
		super();
	}
	
	public Login(String id, String mdp, boolean conseiller) {
		super();
		this.id = id;
		this.mdp = mdp;
		this.conseiller = conseiller;
	}

	//ACCESSEURS ET MUTATEURS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isConseiller() {
		return conseiller;
	}

	public void setConseiller(boolean conseiller) {
		this.conseiller = conseiller;
	}
	
	
}
