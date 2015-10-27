package com.oao.temuco.persistance;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * The Interface GenericDao.
 *
 * @param <T> Type of entities to work with
 * @author 
 */
public interface GenericDao<T extends Serializable> {
	
	/**
	 * <p>
	 * Get the entities with the specified type from the datastore, starting at
	 * first record and return pageSize max records.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param first the first
	 * @param pageSize the page size
	 * @return the list
	 */
	List<T> findAll(int first, int pageSize);
	
	/**
	 * <p>
	 * Get the entities with the specified type from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @return the list
	 */
	List<T> findAll();

	/**
	 * <p>
	 * Get the entities with the specified values from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryString the query string
	 * @param values the values
	 * @return the list
	 */
	List<T> find(final String queryString, final Object... values);

	/**
	 * <p>
	 * Get the entities with the specified values from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryString the query string
	 * @return the list
	 */
	List<T> find(final String queryString);

	/**
	 * <p>
	 * Get the entities with the specified values from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryString the query string
	 * @param params the params
	 * @return the list
	 */
	List<T> findByNamedParams(final String queryString,
			final Map<String, ?> params);

	/**
	 * <p>
	 * Get the entities for named query from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryName the query name
	 * @return the list
	 */
	List<T> findByNamedQuery(String queryName);

	/**
	 * <p>
	 * Get the entities for named query from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryName the query name
	 * @param values the values
	 * @return the list
	 */
	List<T> findByNamedQuery(final String queryName, final Object... values);

	/**
	 * <p>
	 * Get the entities for named query from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @param queryName the query name
	 * @param params the params
	 * @return the list
	 */
	List<T> findByNamedQueryAndNamedParams(final String queryName,
			final Map<String, ?> params);

	/**
	 * Save.
	 *
	 * @param entity the entity
	 * @return the t
	 */
	T save(T entity);

	/**
	 * Update.
	 *
	 * @param entity the entity
	 */
	void update(T entity);

	/**
	 * Delete.
	 *
	 * @param entity the entity
	 */
	void delete(T entity);

	/**
	 * Delete.
	 *
	 * @param entities the entities
	 */
	void delete(List<T> entities);

	/**
	 * Delete all.
	 */
	void deleteAll();

	/**
	 * Flush the current session.
	 *
	 */	 
	void flush();
	
	/**
	 * Gets the current session.
	 *
	 * @return the current session
	 */
	Session getCurrentSession();
	
	/**
	 * Sets the Hibernate session factory.
	 * 
	 * @param sessionFactory
	 *            the new session factory
	 */
	void setSessionFactory(SessionFactory sessionFactory);
	
	
	/**
	 * Gets elements count.
	 * 
	 * @return count of elements
	 */
	int countAll();
	
}