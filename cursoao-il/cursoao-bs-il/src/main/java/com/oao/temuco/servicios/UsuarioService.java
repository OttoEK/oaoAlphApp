package com.oao.temuco.servicios;

import com.oao.temuco.dto.UsuarioDTO;

public interface UsuarioService {
	
	public UsuarioDTO obtenerPorNombre(String nombreUsuario);

}
