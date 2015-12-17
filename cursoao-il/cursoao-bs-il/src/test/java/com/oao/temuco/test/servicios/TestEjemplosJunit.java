package com.oao.temuco.test.servicios;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.servicios.AplicacionService;
import com.oao.temuco.test.contexto.TestContext;

public class TestEjemplosJunit extends TestContext{
	
	@Autowired
	AplicacionService aplicacionService;
	
	@Test
	public void TestAplicacionObtener(){
		try {
			/* Parametros salida */
			AplicacionDTO appResponse = new AplicacionDTO();
			
			/* Parametros entrada */
			Integer appInput = new Integer(1);
			
		
			/* Probar servicio */
			appResponse = aplicacionService.obtener(appInput);
			
			Assert.assertNotNull(appResponse);
			Assert.assertNull(appResponse);
			
		} catch (Exception e){
			LOGGER.info("EXCEPTION: " + e.getMessage());			
		}
		
		
		
	}

}
