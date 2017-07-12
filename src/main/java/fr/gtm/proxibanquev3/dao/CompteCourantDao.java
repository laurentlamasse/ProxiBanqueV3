package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.gtm.proxibanquev3.dao.CompteCourantDao;
import fr.gtm.proxibanquev3.dao.interfaces.ICompteCourantDao;
import fr.gtm.proxibanquev3.domaine.Compte;
import fr.gtm.proxibanquev3.domaine.CompteCourant;

@Named
@SessionScoped
public class CompteCourantDao  implements ICompteCourantDao, Serializable {
	List<Compte> liste;
	CompteCourant compteC;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
	EntityManager em = emf.createEntityManager();
	
	public List<Compte> getListCompte(int id){
		
		Query query = em.createQuery("from CompteCourant c where c.numeroClient=?1");
		query.setParameter(1, id );
		liste = query.getResultList();	
		em.close();
		emf.close();		
		return liste;
	}

	public CompteCourant getCompte(CompteCourant compteC){

		Query query = em.createQuery("from CompteCourant c where c.numeroCompte=?1");
		compteC = (CompteCourant) query.getSingleResult();
		em.close();
		emf.close();		
		return compteC;
	}
	
	public void updateCompte(CompteCourant compteC){
		
		Query query = em.createQuery("UPDATE c from CompteCourant c where c.numeroCompte=?1"
				+ "VALUES c.solde=?2");
		
		/*.....*/

		em.close();
		emf.close();		

	}
	
	public void createCompte(CompteCourant compteC){
		
		Query query = em.createQuery("INSERT INTO CompteCourant c "
				+ "VALUES ('c.solde=?1','c.decouvert=?2','c.numeroClient=?3' ");
		em.persist(compteC);
		em.close();
		emf.close();		

	}

	@Override
	public void deleteCompte(CompteCourant compteC) {
		
		Query query = em.createQuery("DELETE c from CompteCourant c where c.numeroCompte=?1");
		query.setParameter(1, compteC.getNumeroCompte());
	}


	
}
