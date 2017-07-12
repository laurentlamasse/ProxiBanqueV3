package fr.gtm.proxibanquev3.exception;

public class VirementException extends Exception{

	public VirementException(){
		super("Le montant vire est superieur au solde du compte debiteur. \n Veuillez reessayer avec un autre montant.");
	}
}
