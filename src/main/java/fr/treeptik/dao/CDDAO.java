package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;
import fr.treeptik.model.CD;


public interface CDDAO extends GenericDAO<CD, Integer>{

	public List<CD> recherche(String pattern) throws DAOException;
	
	public List<CD> rechercheTrie(String pattern) throws DAOException;
	

}
