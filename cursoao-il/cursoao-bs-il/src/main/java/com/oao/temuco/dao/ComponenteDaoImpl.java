package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.ComponenteDao;
import com.oao.temuco.domain.Componente;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("ComponenteDao")
@Transactional(value = "transactionManager")
public class ComponenteDaoImpl extends HibernateBaseRepositoryDataSource<Componente, Long> implements ComponenteDao {

}
