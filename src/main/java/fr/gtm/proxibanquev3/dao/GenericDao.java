package fr.gtm.proxibanquev3.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;

public abstract class GenericDao<T> implements IGenericDao<T> {

	// ACCESSEUR
	public abstract Class<T> getClazz();

	// METHODES
	protected List<T> findListResult(String namedQuery, Map<String, Object> parameters) {
		List<T> result = null;

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();

			Query query = em.createNamedQuery(namedQuery);

			// Method that will populate parameters if they are passed not null
			// and empty
			if (parameters != null && !parameters.isEmpty()) {
				populateQueryParameters(query, parameters);
			}
			
			result = (List<T>) query.getResultList();

			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}

		return result;
	}
	
	protected T findOneResult(String namedQuery, Map<String, Object> parameters) {
		T result = null;

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();

			Query query = em.createNamedQuery(namedQuery);

			// Method that will populate parameters if they are passed not null
			// and empty
			if (parameters != null && !parameters.isEmpty()) {
				populateQueryParameters(query, parameters);
			}

			result = (T) query.getSingleResult();

			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}

		return result;
	}

	private void populateQueryParameters(Query query, Map<String, Object> parameters) {

		for (Entry<String, Object> entry : parameters.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public T save(T input) {
		try {
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			em.persist(input);
			tx.commit();

			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}

		return input;
	}

	@Override
	public void delete(int id) {
		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();

			EntityTransaction tx=em.getTransaction();
			tx.begin();
			em.remove(em.merge(find(id)));
			tx.commit();
			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public T update(T input) {
		T output = null;
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();

			EntityTransaction tx=em.getTransaction();
			tx.begin();
			output = em.merge(input);
			tx.commit();
			
			em.close();
			emf.close();

		
		return output;

	}

	@Override
	public T find(int id) {
		T element = null;
		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();

			element = em.find(getClazz(), id);
			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}

		return element;
	}

	@Override
	public List<T> findAll() {
		
		List<T> liste = null;
		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
			EntityManager em = emf.createEntityManager();
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(getClazz()));

			liste = em.createQuery(cq).getResultList();

			em.close();
			emf.close();

		} catch (Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}
		
		return liste;
	}
}
