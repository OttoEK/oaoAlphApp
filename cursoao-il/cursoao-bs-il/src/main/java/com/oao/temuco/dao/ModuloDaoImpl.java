package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.ModuloDao;
import com.oao.temuco.domain.Modulo;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("ModuloDao")
@Transactional(value = "transactionManager")
public class ModuloDaoImpl extends HibernateBaseRepositoryDataSource<Modulo, Long> implements ModuloDao {

}
