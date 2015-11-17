package com.oao.temuco.servicios;

import java.util.List;

import com.oao.temuco.dto.PermisoDTO;
import com.oao.temuco.dto.UsuarioDTO;

public interface UsuarioService {
	
	public UsuarioDTO obtenerPorNombre(String nombreUsuario);
	public List<PermisoDTO> obtenerPermisos(Integer idUsuario);

}
