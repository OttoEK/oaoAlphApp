package com.oao.temuco.persistance;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;



/**
 * 
 * Class to use when there are repository classes that uses
 * a different datasource than configured for main repositories.
 * 
 * This class uses a deprecated repository but this is
 * used for custom repositories and will be adapted in later versions.
 * 
 * @author
 * 
 */
@Transactional(value="transactionManager")
public class HibernateBaseRepositoryDataSource<T extends Serializable, ID extends Serializable>
		extends GenericHibernatePKDao<T, ID> {

	@Override
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	// these method should be overridden because parent methods
	// are annotated as @Transactional, and this annotation on method
	// has precedence over Class annotated @Transactional(value="transactionManagerBackup")

	@Override
	@Transactional(value="transactionManager", readOnly = true)
	public List<T> findAll() {
		return super.findAll();
	}
	
	@Transactional(value="transactionManager", readOnly = true)
	public List<T> findAll(int first, int pageSize) {
		return super.findAll(first, pageSize);
	}
	
	@Override
	public T get(ID id) {
		return super.get(id);
	}

	@Override
	public int countAll() {
		return super.countAll();
	}

	@Override
	public List<T> find(String queryString, Object... values) {
		return super.find(queryString, values);
	}

	@Override
	public List<T> find(String queryString) {
		return find(queryString, (Object[]) null);
	}

	@Override
	public List<T> findByNamedParams(String queryString,
			Map<String, ?> params) {
		return super.findByNamedParams(queryString, params);
	}

	@Override
	public List<T> findByNamedQuery(String queryName) {
		return findByNamedQuery(queryName, (Object[]) null);
	}

	@Override
	public List<T> findByNamedQuery(String queryName, Object... values) {
		return super.findByNamedQuery(queryName, values);
	}

	@Override
	public List<T> findByNamedQueryAndNamedParams(String queryName,
			Map<String, ?> params) {
		return super.findByNamedQueryAndNamedParams(queryName, params);
	}
	
	@Override
	public T save(final T entity) {
		return super.save(entity);
	}

	@Override
	public void update(final T entity) {
		super.update(entity);
	}

	@Override
	public void delete(final T entity) {
		super.delete(entity);
	}

	@Override
	public void delete(final List<T> entities) {
		super.delete(entities);
	}

	@Override
	public void deleteAll() {
		super.deleteAll();
	}

	@Override
	public void flush() {
		super.flush();
	}

	
	
}