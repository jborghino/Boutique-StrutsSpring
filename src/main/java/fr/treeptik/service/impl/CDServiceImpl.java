package fr.treeptik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.CDDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.CD;
import fr.treeptik.model.CD;
import fr.treeptik.service.CDService;

@Service
public class CDServiceImpl implements CDService {

	@Autowired
	private CDDAO cdDAO;

	@Override
	public List<CD> recherche(String pattern) throws ServiceException {
		try {
			return cdDAO.recherche(pattern);
		} catch (DAOException e) {
			throw new ServiceException("Erreur recherche cd", e);
		}
	}

	@Override
	public List<CD> rechercheTrie(String pattern) throws ServiceException {
		try {
			return cdDAO.rechercheTrie(pattern);
		} catch (DAOException e) {
			throw new ServiceException("Erreur recherche triée cd", e);
		}
	}

	@Override
	@Transactional
	public CD save(CD cd) throws ServiceException {
		try {
			return cdDAO.save(cd);
		} catch (DAOException e) {
			throw new ServiceException("Erreur save cd", e);
		}
	}

	@Override
	@Transactional
	public CD update(CD cd) throws ServiceException {
		try {
			return cdDAO.update(cd);
		} catch (DAOException e) {
			throw new ServiceException("Erreur update cd", e);
		}
	}

	@Override
	@Transactional
	public void remove(CD cd) throws ServiceException {
		try {
			cd = this.findById(cd.getId());
			cdDAO.remove(cd);
		} catch (DAOException e) {
			throw new ServiceException("Erreur remove cd", e);
		}
	}

	@Override
	public CD findById(Integer id) throws ServiceException {
		try {
			return cdDAO.findById(id);
		} catch (DAOException e) {
			throw new ServiceException("Erreur findById cd", e);
		}
	}

	@Override
	public List<CD> findAll() throws ServiceException {
		try {
			return (List<CD>) cdDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll cd", e);
		}
	}

}
