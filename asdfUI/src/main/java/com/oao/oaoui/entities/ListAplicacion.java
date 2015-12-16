package com.oao.oaoui.entities;

import java.io.Serializable;
import java.util.List;

public class ListAplicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<Aplicacion2> aplicaciones;

	public List<Aplicacion2> getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(List<Aplicacion2> aplicaciones) {
		this.aplicaciones = aplicaciones;
	}
	
	
}
