package com.oao.temuco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AplicacionDao;
import com.oao.temuco.dao.UsuarioDao;
import com.oao.temuco.domain.Permiso;
import com.oao.temuco.domain.Usuario;
import com.oao.temuco.dto.PermisoDTO;
import com.oao.temuco.dto.UsuarioDTO;

@Service
@Transactional
public class UsuarioServiceImpl  implements UsuarioService {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@Autowired
	Mapper mapper;

	public UsuarioDTO obtenerPorNombre(String nombreUsuario) {
		UsuarioDTO usuario = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteriaTest = session.createCriteria(Usuario.class);
		criteriaTest.setMaxResults(1);
		criteriaTest.add(Restrictions.eq("sNombreUsuario", nombreUsuario));
		@SuppressWarnings("unchecked")
		List<Usuario> list= criteriaTest.list();
		if(!list.isEmpty()){
			Usuario u = list.get(0);
			usuario = mapper.map(u, UsuarioDTO.class);
		}
		return usuario;
	
	}

	public List<PermisoDTO> obtenerPermisos(Integer idUsuario) {
		Usuario u = usuarioDao.get(idUsuario.longValue());
		List<PermisoDTO>  lPermiso = new ArrayList<PermisoDTO>();
		for(Permiso p : u.getPermisos()){
			lPermiso.add(mapper.map(p, PermisoDTO.class));
		}
		return lPermiso;
	}

}
