package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.DVD;

public interface DVDService {

	public List<DVD> recherche(String pattern) throws ServiceException;

	public List<DVD> rechercheTrie(String pattern) throws ServiceException;

}
