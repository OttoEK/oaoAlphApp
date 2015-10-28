package com.oao.temuco.servicios;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AplicacionDao;
import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.entidades.Aplicacion;


@Service
@Transactional
public class AplicacionServiceImpl implements AplicacionService {
	
	@Autowired
	AplicacionDao applicacionDao;

	public List<AplicacionDTO> listar() {
		Mapper mapper = new DozerBeanMapper();
		
		List<AplicacionDTO> list = new ArrayList<AplicacionDTO>();
		for(Aplicacion aplicacion : applicacionDao.findAll()){
			AplicacionDTO aplicacionDTO = mapper.map(aplicacion, AplicacionDTO.class);		    
	        list.add(aplicacionDTO);
		}
        return list;
		
	}
    
	


}
