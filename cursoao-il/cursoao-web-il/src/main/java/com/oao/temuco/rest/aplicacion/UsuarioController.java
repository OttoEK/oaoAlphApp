package com.oao.temuco.rest.aplicacion;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oao.temuco.dto.PermisoDTO;
import com.oao.temuco.dto.UsuarioDTO;
import com.oao.temuco.servicios.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/obtenerPorNombre", method = RequestMethod.POST)
	@ResponseBody
	public UsuarioDTO obtenerPorNombre(@RequestBody final String nombreUsuario, final HttpServletRequest request)  {
		return  usuarioService.obtenerPorNombre(nombreUsuario);
		
	}
	@RequestMapping(value = "/obtenerPermisos", method = RequestMethod.POST)
	@ResponseBody
	public List<PermisoDTO> obtenerPermisos(@RequestBody final Integer idUsuario, final HttpServletRequest request)  {
		return  usuarioService.obtenerPermisos(idUsuario);
		
	}

}
