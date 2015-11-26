package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.OpcionDao;
import com.oao.temuco.domain.Opcion;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("OpcionDao")
@Transactional(value = "transactionManager")
public class OpcionDaoImpl extends HibernateBaseRepositoryDataSource<Opcion, Long> implements OpcionDao {

}
