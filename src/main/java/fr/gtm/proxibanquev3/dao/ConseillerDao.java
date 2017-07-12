package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.gtm.proxibanquev3.dao.ConseillerDao;
import fr.gtm.proxibanquev3.dao.interfaces.IConseillerDao;
import fr.gtm.proxibanquev3.domaine.Conseiller;

@Named
@SessionScoped
public class ConseillerDao implements IConseillerDao , Serializable{
	Conseiller conseiller;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
	EntityManager em = emf.createEntityManager();
	
	public List<Conseiller> getListConseiller(){
		
		List<Conseiller> liste = new ArrayList<Conseiller>();
		Query query = em.createQuery("from Conseiller c ");
		/*.....*/
		liste = query.getResultList();	
		em.close();
		emf.close();		
		return liste;
	}
	
	public void createConseiller(Conseiller conseiller){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(conseiller);
		
		tx.commit();
		
		em.close();
		emf.close();
	}
	
	public void deleteConseiller(Conseiller conseiller){
		
		Query query = em.createQuery("delete c from Conseiller c where c.login=?1");
		/*.....*/
		em.close();
		emf.close();
	}
	
	public Conseiller selectConseiller(String login) {
		
		Query query = em.createQuery("select c from Conseiller c where c.login=?1");
		conseiller=(Conseiller) query.getSingleResult();
		em.close();
		emf.close();
		return conseiller;
	}

}