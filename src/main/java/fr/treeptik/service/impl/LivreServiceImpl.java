package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.LivreDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Livre;
import fr.treeptik.service.LivreService;

@Service
public class LivreServiceImpl implements LivreService{
	
	@Autowired
	private LivreDAO livreDAO;

	@Override
	public List<Livre> recherche(String pattern) throws ServiceException {
		try {
			return livreDAO.recherche(pattern);
		} catch (DAOException e) {
			throw new ServiceException("Erreur recherche livre", e);
		}
	}

	@Override
	public List<Livre> rechercheTrie(String pattern) throws ServiceException {
		try {
			return livreDAO.rechercheTrie(pattern);
		} catch (DAOException e) {
			throw new ServiceException("Erreur recherche triée livre", e);
		}
	}

	

}
