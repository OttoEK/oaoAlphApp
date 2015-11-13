package com.oao.temuco.rest.aplicacion;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oao.temuco.dto.UsuarioDTO;
import com.oao.temuco.servicios.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/obtenerPorNombre", method = RequestMethod.POST)
	@ResponseBody
	public UsuarioDTO aplicacionObtener(@RequestBody final String nombreUsuario, final HttpServletRequest request)  {
		return  usuarioService.obtenerPorNombre(nombreUsuario);
		
	}

}
