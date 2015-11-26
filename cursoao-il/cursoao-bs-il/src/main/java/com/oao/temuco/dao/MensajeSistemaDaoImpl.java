package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.MensajeSistemaDao;
import com.oao.temuco.domain.MensajeSistema;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("MensajeSistemaDao")
@Transactional(value = "transactionManager")
public class MensajeSistemaDaoImpl extends HibernateBaseRepositoryDataSource<MensajeSistema, Long> implements MensajeSistemaDao {

}
