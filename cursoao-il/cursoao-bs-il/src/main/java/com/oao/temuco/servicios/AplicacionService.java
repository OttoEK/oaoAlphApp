package com.oao.temuco.servicios;

import java.util.List;

import com.oao.temuco.dto.AplicacionDTO;

public interface AplicacionService {
	
	
List<AplicacionDTO> listar();

AplicacionDTO obtener(Integer id);

}
