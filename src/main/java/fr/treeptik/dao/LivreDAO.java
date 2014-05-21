package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;
import fr.treeptik.model.Livre;

public interface LivreDAO extends GenericDAO<Livre, Integer> {

	public List<Livre> recherche(String pattern) throws DAOException;

	public List<Livre> rechercheTrie(String pattern) throws DAOException;

}
