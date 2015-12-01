package com.oao.temuco.rest.aplicacion;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.dto.ModuloDTO;
import com.oao.temuco.dto.PermisoDTO;
import com.oao.temuco.servicios.AplicacionService;


@RestController
@RequestMapping(value = "/aplicacion")
public class AplicacionController {
	
@Autowired
AplicacionService aplicacionService;

	
	@RequestMapping(value = "/listar", method = RequestMethod.POST)
	public List<AplicacionDTO> aplicacionListar()  {
		return aplicacionService.listar();
		
	}
	
	@RequestMapping(value = "/obtener", method = RequestMethod.POST)
	@ResponseBody
	public AplicacionDTO aplicacionObtener(@RequestBody final Integer id, final HttpServletRequest request)  {
		return aplicacionService.obtener(id);
		
	}
	
	@RequestMapping(value = "/obtenerModulos", method = RequestMethod.POST)
	@ResponseBody
	public List <ModuloDTO> aplicacionObtenerModulos(@RequestBody final Integer id, final HttpServletRequest request)  {
		return aplicacionService.obtenerModulos(id);
		
	}
	
	@RequestMapping(value = "/obtenerPermisos", method = RequestMethod.POST)
	@ResponseBody
	public List <PermisoDTO> aplicacionObtenerPermisos(@RequestBody final Integer id, final HttpServletRequest request)  {
		return aplicacionService.obtenerPermisos(id);
		
	}
	
	@RequestMapping(value = "/nueva", method = RequestMethod.POST)
	@ResponseBody
	public AplicacionDTO aplicacionNueva(@RequestBody final AplicacionDTO aplicacion, final HttpServletRequest request)  {
		return aplicacionService.nueva(aplicacion);
		
	}
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST)
	@ResponseBody
	public AplicacionDTO aplicacionActualizar(@RequestBody final AplicacionDTO aplicacion, final HttpServletRequest request)  {
		return aplicacionService.actualizar(aplicacion);
		
	}
	@RequestMapping(value = "/borrar", method = RequestMethod.POST)
	@ResponseBody
	public boolean aplicacionBorrar(@RequestBody final AplicacionDTO aplicacion, final HttpServletRequest request)  {
		return aplicacionService.borrar(aplicacion);
		
	}
}
