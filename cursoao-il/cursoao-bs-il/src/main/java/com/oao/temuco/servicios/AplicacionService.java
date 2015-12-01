package com.oao.temuco.servicios;

import java.util.List;

import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.dto.ModuloDTO;
import com.oao.temuco.dto.PermisoDTO;

public interface AplicacionService {
	
List<AplicacionDTO> listar();

AplicacionDTO obtener(Integer id);

AplicacionDTO nueva(AplicacionDTO aplicacionDTO);

AplicacionDTO actualizar(AplicacionDTO aplicacionDTO);

List<ModuloDTO> obtenerModulos(Integer id);

List<PermisoDTO> obtenerPermisos(Integer id);

boolean borrar(AplicacionDTO aplicacionDTO);

}
