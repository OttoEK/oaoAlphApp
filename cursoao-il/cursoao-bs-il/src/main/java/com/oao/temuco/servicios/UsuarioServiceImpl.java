package com.oao.temuco.servicios;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.domain.Usuario;
import com.oao.temuco.dto.UsuarioDTO;

@Service
@Transactional
public class UsuarioServiceImpl  implements UsuarioService {
	
	@Autowired
	SessionFactory sessionFactory;

	public UsuarioDTO obtenerPorNombre(String nombreUsuario) {
		UsuarioDTO usuario = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteriaTest = session.createCriteria(Usuario.class);
		criteriaTest.setMaxResults(1);
		criteriaTest.add(Restrictions.eq("sNombreUsuario", nombreUsuario));
		@SuppressWarnings("unchecked")
		List<Usuario> list= criteriaTest.list();
		
		Mapper mapper = new DozerBeanMapper();
		if(!list.isEmpty()){
			Usuario u = list.get(0);
			usuario = mapper.map(u, UsuarioDTO.class);
		}
		return usuario;
	
	}

}
