package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;
import fr.treeptik.model.DVD;

public interface DVDDAO extends GenericDAO<DVD, Integer>{

	public List<DVD> recherche(String pattern) throws DAOException;
	public List<DVD> rechercheTrie(String pattern) throws DAOException;

}
