package com.oao.temuco.test.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.oao.temuco.dao.AplicacionDao;
import com.oao.temuco.entidades.Aplicacion;
import com.oao.temuco.servicios.AplicacionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/app-config.xml" })
@Transactional(value = "transactionManager")
public class TestAplicacion {
	
	@Autowired
	AplicacionDao aplicacionDao;
	
	@Autowired
	AplicacionService aplicacionService;
	
	
	@Test
	public void Test(){
		
		List<Aplicacion> x = aplicacionDao.findAll();
		for (Aplicacion a : x){
	    System.out.println(a.getNombreAplicacion());
		 System.out.println(a.getNombreAplicacion());
		}
	}
	
	
	@Test
	public void Test2(){
		
		List<Aplicacion> x =aplicacionService.listaTodo();
		for (Aplicacion a : x){
	    System.out.println(a.getNombreAplicacion());
		 System.out.println(a.getNombreAplicacion());
		}
	}

}
