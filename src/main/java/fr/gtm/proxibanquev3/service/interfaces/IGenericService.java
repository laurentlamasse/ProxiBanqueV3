package fr.gtm.proxibanquev3.service.interfaces;

import java.util.List;

public interface IGenericService<T> {
	T save(T input);

	void delete(int id);

	T update(T input);

	T find(int id);

	List<T> findAll();
}
