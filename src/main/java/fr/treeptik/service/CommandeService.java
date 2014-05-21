package fr.treeptik.service;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Commande;

public interface CommandeService {

	Commande save(Commande commande) throws ServiceException;

	Commande update(Commande commande) throws ServiceException;

	void remove(Commande commande) throws ServiceException;

	Commande findById(Integer id) throws ServiceException;

	Commande findAll() throws ServiceException;
	
}
