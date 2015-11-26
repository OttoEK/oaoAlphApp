package com.oao.temuco.servicios;

import java.util.List;

import com.oao.temuco.dto.AplicacionDTO;
import com.oao.temuco.dto.ModuloDTO;
import com.oao.temuco.dto.PermisoDTO;

public interface AplicacionService {
	
List<AplicacionDTO> listar();

AplicacionDTO obtener(Integer id);

List<ModuloDTO> obtenerModulos(Integer id);

List<PermisoDTO> obtenerPermisos(Integer id);

}
