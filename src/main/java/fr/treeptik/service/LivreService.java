package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Livre;

public interface LivreService {

	public List<Livre> recherche(String pattern) throws ServiceException;

	public List<Livre> rechercheTrie(String pattern) throws ServiceException;

}
