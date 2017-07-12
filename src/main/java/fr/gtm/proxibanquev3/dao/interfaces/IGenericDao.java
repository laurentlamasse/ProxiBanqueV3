package fr.gtm.proxibanquev3.dao.interfaces;

import java.util.List;

public interface IGenericDao<T> {
	T save(T input);
	void delete(int id);
	T update(T input);
	T find(int id);
	List<T> findAll();
}
