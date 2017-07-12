package fr.gtm.proxibanquev3.dao;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.gtm.proxibanquev3.dao.interfaces.IClientDao;
import fr.gtm.proxibanquev3.domaine.Client;

@Named
@SessionScoped
public class ClientDao implements IClientDao, Serializable{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanque-pu");
	EntityManager em = emf.createEntityManager();
	
	List<Client> liste;

	public List<Client> getListClient(int id){
		
		Query query = em.createQuery("from Client c where c.numConseiller=?1");
		query.setParameter(1, id);
		liste = query.getResultList();	
		em.close();
		emf.close();		
		return liste;
	}

	public void createClient(Client client){

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(client);
		
		tx.commit();
		
		em.close();
		emf.close();
	}
	
	public void deleteClient(Client client){
		
		Query query = em.createQuery("delete c from Client c where c.numeroClient=?1");
		query.setParameter(1, client.getNumeroClient());
		em.close();
		emf.close();
	}

	public void updateClient(Client client){
		
		Query query = em.createQuery("update c from Client c where c.numeroClient=?1");
		query.setParameter(1, client.getNumeroClient());
		em.close();
		emf.close();
	}

	public List<Client> getAllClient(){
		
		Query query = em.createQuery("from Client c ");
		liste = query.getResultList();	
		em.close();
		emf.close();		
		return liste;
	}
	
	public Client readClient(Client client) {
		Query query=em.createQuery("FROM Client c WHERE c.numeroClient=?1");
		query.setParameter(1, client.getNumeroClient());
		client=(Client) query.getSingleResult();
		em.close();
		emf.close();		
		return client;
	}
	
}
