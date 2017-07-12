package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import fr.gtm.proxibanquev3.dao.interfaces.ILoginDao;

@Named
@SessionScoped
public class LoginDao implements ILoginDao, Serializable {
	

}
