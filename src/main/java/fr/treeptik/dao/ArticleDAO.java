package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;
import fr.treeptik.model.Article;

public interface ArticleDAO extends GenericDAO<Article, Integer> {

	public List<Article> recherche(String pattern) throws DAOException;

	public List<Article> rechercheTrie(String pattern) throws DAOException;

}
