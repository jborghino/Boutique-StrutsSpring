package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.CD;
import fr.treeptik.model.CD;

public interface CDService {

	public List<CD> recherche(String pattern) throws ServiceException;

	public List<CD> rechercheTrie(String pattern) throws ServiceException;
	
	CD save(CD cd) throws ServiceException;

	CD update(CD cd) throws ServiceException;

	void remove(CD cd) throws ServiceException;

	CD findById(Integer id) throws ServiceException;

	List<CD> findAll() throws ServiceException;
	

}
