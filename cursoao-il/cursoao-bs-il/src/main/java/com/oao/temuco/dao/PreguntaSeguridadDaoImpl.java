package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.PreguntaSeguridadDao;
import com.oao.temuco.domain.PreguntaSeguridad;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("PreguntaSeguridadDao")
@Transactional(value = "transactionManager")
public class PreguntaSeguridadDaoImpl extends HibernateBaseRepositoryDataSource<PreguntaSeguridad, Long> implements PreguntaSeguridadDao {

}
