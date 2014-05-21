package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Article;

public interface ArticleService {

	Article save(Article article) throws ServiceException;

	Article update(Article article) throws ServiceException;

	void remove(Article article) throws ServiceException;

	Article findById(Integer id) throws ServiceException;

	List<Article> findAll() throws ServiceException;

	public List<Article> recherche(String pattern) throws ServiceException;

	public List<Article> rechercheTrie(String pattern) throws ServiceException;

}
