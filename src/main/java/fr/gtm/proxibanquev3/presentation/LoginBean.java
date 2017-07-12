package fr.gtm.proxibanquev3.presentation;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanquev3.domaine.Client;
import fr.gtm.proxibanquev3.service.interfaces.IClientService;

/**
 * Bean manage qui sera instancie par la page home.jsf. Cette classe permet de
 * faire le binding entre les elements du formulaire de login sur la page JSF et
 * le login enregistre en base dans la table Employe. C'est dans ce bean que
 * l'on va creer la session de l'utilisateur.
 * 
 * @author Bilal HALABI et Laurent LAMASSE
 */
@Named
public class LoginBean implements Serializable {

	/**
	 * Objet de type IClientService dont le cycle de vie sera gere par le conteneur CDI.
	 * Cet objet permet d'effectuer tous les traitements necessaires sur les clients.
	 * C'est par l'intermediaire de cet objet que nous accederons a la couche DAO de l'application.
	 */
	@Inject
	private IClientService service;
	private Client client;
	
	
}
