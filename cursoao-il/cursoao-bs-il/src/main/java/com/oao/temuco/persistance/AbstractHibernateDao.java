package com.oao.temuco.persistance;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class AbstractHibernateDao.
 *
 * @param <T> the generic type
 */
public abstract class AbstractHibernateDao<T extends Serializable> implements GenericDao<T> {
	
	private static final String UNCHECKED_LITERAL = "unchecked";

	/** The clazz. */
	private Class<T> clazz;
	
	/** The session factory. */
	private SessionFactory sessionFactory;
	
	/**
	 * Instantiates a new abstract hibernate dao.
	 */
	@SuppressWarnings(UNCHECKED_LITERAL)
	public AbstractHibernateDao() {
		super();
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	/**
	 * Sets the clazz.
	 *
	 * @param clazzToSet the new clazz
	 */
	public final void setClazz( final Class<T> clazzToSet ) {
		this.clazz = clazzToSet;
	}
	
	/**
	 * Gets the entity class.
	 *
	 * @return the entity class
	 */
	public final Class<T> getEntityClass() {
		return clazz;
	}
	
	/**
	 * Gets elements count.
	 * 
	 * @return count of elements
	 */

	public int countAll() {
		Long count = (Long) getCurrentSession().createCriteria(getEntityClass())
				.setProjection(Projections.rowCount()).uniqueResult();
		return (count != null ? count.intValue() : 0);
	}
	
	/**
	 * <p>
	 * Get the entities with the specified type from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 *
	 * @return the list
	 */
	
	@Transactional( readOnly = true )
	@SuppressWarnings(UNCHECKED_LITERAL)
	public List<T> findAll() {
		return getCurrentSession().createCriteria(getEntityClass()).list();
	}
	
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
	@Transactional( readOnly = true )
	@SuppressWarnings(UNCHECKED_LITERAL)
	public List<T> findAll(int first, int pageSize){
		return getCurrentSession().createCriteria(this.clazz)
				.setFirstResult(first).setMaxResults(pageSize).list();
	}
	

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
	@SuppressWarnings(UNCHECKED_LITERAL)
	
	public List<T> find(String queryString, Object... values) {

		Query queryObject = getCurrentSession().createQuery(queryString);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				queryObject.setParameter(i, values[i]);
			}
		}
		return queryObject.list();
	}


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

	public List<T> find(String queryString) {
		return find(queryString, (Object[]) null);
	}


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
	@SuppressWarnings(UNCHECKED_LITERAL)

	public List<T> findByNamedParams(String queryString, Map<String, ?> params) {
		Query queryObject = getCurrentSession().createQuery(queryString);
		if (params != null) {
			for (Map.Entry<String, ?> entry : params.entrySet()) {
				queryObject.setParameter(entry.getKey(), entry.getValue());
			}
		}
		return queryObject.list();
	}


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
	
	public List<T> findByNamedQuery(String queryName) {
		return findByNamedQuery(queryName, (Object[]) null);
	}


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
	@SuppressWarnings(UNCHECKED_LITERAL)
	
	public List<T> findByNamedQuery(String queryName, Object... values) {
		Query queryObject = getCurrentSession().getNamedQuery(queryName);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				queryObject.setParameter(i, values[i]);
			}
		}
		return queryObject.list();
	}


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
	@SuppressWarnings(UNCHECKED_LITERAL)
	
	public List<T> findByNamedQueryAndNamedParams(String queryName,
			Map<String, ?> params) {
		Query queryObject = getCurrentSession().getNamedQuery(queryName);
		if (params != null) {
			for (Map.Entry<String, ?> entry : params.entrySet()) {
				applyNamedParameterToQuery(queryObject, entry.getKey(),
						entry.getValue());
			}
		}
		return queryObject.list();
	}

	/**
	 * Apply the given name parameter to the given Query object.
	 *
	 * @param queryObject the Query object
	 * @param paramName the name of the parameter
	 * @param value the value of the parameter
	 */
	@SuppressWarnings("rawtypes")
	private void applyNamedParameterToQuery(Query queryObject,
			String paramName, Object value) {
		if (value instanceof Collection) {
			queryObject.setParameterList(paramName, (Collection) value);
		} else if (value instanceof Object[]) {
			queryObject.setParameterList(paramName, (Object[]) value);
		} else {
			queryObject.setParameter(paramName, value);
		}
	}	
	
	// create/persist
	
	/**
	 * Save.
	 *
	 * @param entity the entity
	 * @return the t
	 */

	public T save( final T entity ){
		this.getCurrentSession().persist( entity );
		return entity;
	}
	
	// update
	
	/**
	 * Update.
	 *
	 * @param entity the entity
	 */

	public T update( final T entity ){
		this.getCurrentSession().merge( entity );
		return entity;
	}
	
	// delete
	
	/**
	 * Delete.
	 *
	 * @param entity the entity
	 */
	
	public void delete( final T entity ){
		this.getCurrentSession().delete( entity );
	}
	
	/**
	 * Delete.
	 *
	 * @param entities the entities
	 */
	
	public void delete( final List<T> entities ) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Delete all.
	 */
	
	public void deleteAll(){
		throw new UnsupportedOperationException();
	}

	// util
	
	/**
	 * Flush the current session.
	 *
	 */	 
	
	public void flush() {
		getCurrentSession().flush();
	}

	/**
	 * Gets the current session.
	 *
	 * @return the current session
	 */

	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	/**
	 * Sets the Hibernate session factory.
	 * 
	 * @param sessionFactory
	 *            the new session factory
	 */
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
}
