package com.oao.temuco.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.domain.Usuario;
import com.oao.temuco.persistance.HibernateBaseRepositoryDataSource;

@Component
@Repository("UsuarioDao")
@Transactional(value = "transactionManager")
public class UsuarioDaoImpl extends HibernateBaseRepositoryDataSource<Usuario, Long> implements UsuarioDao {

}
