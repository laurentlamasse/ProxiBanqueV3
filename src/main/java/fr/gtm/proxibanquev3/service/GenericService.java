package fr.gtm.proxibanquev3.service;

import java.util.List;

import fr.gtm.proxibanquev3.dao.GenericDao;
import fr.gtm.proxibanquev3.dao.interfaces.IGenericDao;
import fr.gtm.proxibanquev3.service.interfaces.IGenericService;

public abstract class GenericService<T> implements IGenericService<T> {

	// METHODES
	public abstract IGenericDao<T> getDao();

	@Override
	public T save(T input) {
		return getDao().save(input);
	}

	@Override
	public void delete(int id) {
		getDao().delete(id);
	}

	@Override
	public T update(T input) {
		return getDao().update(input);
	}

	@Override
	public T find(int id) {
		return getDao().find(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}

}
