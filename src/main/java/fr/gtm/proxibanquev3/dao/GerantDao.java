package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.gtm.proxibanquev3.dao.interfaces.IGerantDao;
import fr.gtm.proxibanquev3.domaine.Gerant;

@Named
@SessionScoped
public class GerantDao implements IGerantDao, Serializable {
	Gerant gerant;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Gerant getGerant(String login) {
		Query query = em.createQuery("select c from Conseiller c where c.login=?1");
		query.setParameter(1, login);
		gerant= (Gerant) query.getSingleResult();
		em.close();
		emf.close();
		return gerant;
	}
}


