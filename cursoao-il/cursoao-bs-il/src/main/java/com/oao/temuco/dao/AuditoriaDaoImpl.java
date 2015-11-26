package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AuditoriaDao;
import com.oao.temuco.domain.Auditoria;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("AuditoriaDao")
@Transactional(value = "transactionManager")
public class AuditoriaDaoImpl extends HibernateBaseRepositoryDataSource<Auditoria, Long>implements AuditoriaDao {

}
