package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.PermisoDao;
import com.oao.temuco.domain.Permiso;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("PermisoDao")
@Transactional(value = "transactionManager")
public class PermisoDaoImpl extends HibernateBaseRepositoryDataSource<Permiso, Long> implements PermisoDao {

}
