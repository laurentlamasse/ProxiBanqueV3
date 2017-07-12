package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.gtm.proxibanquev3.dao.interfaces.ICompteEpargneDao;
import fr.gtm.proxibanquev3.domaine.CompteEpargne;

@Named
@SessionScoped
public class CompteEpargneDao implements ICompteEpargneDao, Serializable {
	CompteEpargne compteE;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
	EntityManager em = emf.createEntityManager();
	

	public CompteEpargne getCompte(CompteEpargne compteE){

		Query query = em.createQuery("from CompteEpargne c where c.numeroCompte=?1");
		em.persist(compteE);
		em.close();
		emf.close();		
		return compteE;
	}
	
	public void updateCompte(CompteEpargne compteE){
		
		Query query = em.createQuery("UPDATE c from CompteEpargne c where c.numeroCompte=?1"
				+ "VALUES c.solde=?2");
		em.persist(compteE);
		em.close();
		emf.close();		

	}
	
	public void createCompte(CompteEpargne compteE){
		
		Query query = em.createQuery("INSERT INTO CompteEpargne c "
				+ "VALUES ('c.numeroCompte=?1', 'c.solde=?2', 'c.remuneration=?3','c.numeroClient=?4' ");
		em.persist(compteE);
		em.close();
		emf.close();		

	}
	
	public void deleteCompte(CompteEpargne compteE) {
		Query query=em.createQuery("DELETE c from CompteEpargne c WHERE c.numeroCompte=?1");
		query.setParameter(1, compteE.getNumeroCompte());
		em.close();
		emf.close();		

	}
}
