package com.oao.temuco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AplicacionDao;
import com.oao.temuco.domain.Aplicacion;
import com.oao.temuco.domain.Modulo;
import com.oao.temuco.domain.Permiso;
import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.dto.ModuloDTO;
import com.oao.temuco.dto.PermisoDTO;


@Service
@Transactional
public class AplicacionServiceImpl implements AplicacionService {
	
	@Autowired
	AplicacionDao applicacionDao;
	@Autowired
	Mapper mapper;
	
	public List<AplicacionDTO> listar() {
		List<AplicacionDTO> list = new ArrayList<AplicacionDTO>();
		for(Aplicacion aplicacion : applicacionDao.findAll()){		    
	        list.add(mapper.map(aplicacion, AplicacionDTO.class));
		}
        return list;		
	}

	public AplicacionDTO obtener(Integer id) {
		Aplicacion aplicacion = applicacionDao.get(id.longValue());
		return	mapper.map(aplicacion, AplicacionDTO.class);
	}

	
	public List<ModuloDTO> obtenerModulos(Integer id) {
		List<ModuloDTO> list = new ArrayList<ModuloDTO>();
		Aplicacion aplicacion = applicacionDao.get(id.longValue());
		for (Modulo modulo :aplicacion.getModulos()){
			 list.add(mapper.map(modulo, ModuloDTO.class));
		}			
		return list;
	}
	
	public List<PermisoDTO> obtenerPermisos(Integer id) {
		List<PermisoDTO> list = new ArrayList<PermisoDTO>();
		Aplicacion aplicacion = applicacionDao.get(id.longValue());
		for (Permiso permiso :aplicacion.getPermisos()){
			 list.add(mapper.map(permiso, PermisoDTO.class));
		}			
		return list;
	}


}
