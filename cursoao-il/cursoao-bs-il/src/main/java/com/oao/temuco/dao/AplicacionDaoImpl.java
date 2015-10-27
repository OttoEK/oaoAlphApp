package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.entidades.Aplicacion;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

/**
 * The Class IdDaoImpl.
 *
 * @author Everis
 */
@Component
@Repository("AplicacionDao")
@Transactional(value = "transactionManager")
public class AplicacionDaoImpl extends HibernateBaseRepositoryDataSource<Aplicacion, Integer> implements AplicacionDao {

}
