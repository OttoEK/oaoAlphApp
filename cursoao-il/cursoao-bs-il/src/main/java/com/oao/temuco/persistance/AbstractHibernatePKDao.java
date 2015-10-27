package com.oao.temuco.persistance;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;
/**
 * 
 * @author 
 *
 * @param <T>
 * @param <ID>
 */
@Transactional
public abstract class AbstractHibernatePKDao<T extends Serializable, ID extends Serializable> extends AbstractHibernateDao<T> implements GenericPKDao<T, ID> {

	/**
	 * 
	 * @see GenericPKDao#get(Serializable)
	 * @param id id.
	 * @return T.
	 */
	
	public T get(ID id) {
		T entity = null;

		entity = getEntityClass().cast(getCurrentSession().get(getEntityClass(), id));

		return entity;
	}
	
}
