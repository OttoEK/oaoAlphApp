package com.oao.temuco.persistance;

import java.io.Serializable;

/**
 * @param <T>
 *            Type of entities to work with
 * @param <ID>
 *            Type of the pk attribute for the entity
 * 
 * 
 * @author  
 * 
 */
public interface GenericPKDao<T extends Serializable, ID extends Serializable> extends GenericDao<T> {
	
	/**
	 * <p>
	 * Get the entity with the specified type and id from the datastore.
	 * 
	 * <p>
	 * If none is found, return null.
	 * @param id id.
	 * @return T.
	 */
	T get(ID id);

}