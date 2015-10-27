package com.oao.temuco.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AplicacionDao;
import com.oao.temuco.entidades.Aplicacion;


@Service
@Transactional
public class AplicacionServiceImpl implements AplicacionService {
	
	@Autowired
	AplicacionDao applicacionDao;

	public List<Aplicacion> listaTodo() {
		return applicacionDao.findAll();
		
	}
    
	


}
