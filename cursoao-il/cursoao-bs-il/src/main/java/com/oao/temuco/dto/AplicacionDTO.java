package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.List;



public class AplicacionDTO {
	

	private long nIdAplicacion;
	private BigDecimal bActivo;
	private String sNombreAplicacion;
	private String sTituloVentana;
	private String sUrlInicio;
	private String sVersionAplicacion;
//	private List<ModuloDTO> modulos;
//	private List<PermisoDTO> permisos;
	
	
	public AplicacionDTO() {
	}


	public long getnIdAplicacion() {
		return nIdAplicacion;
	}


	public void setnIdAplicacion(long nIdAplicacion) {
		this.nIdAplicacion = nIdAplicacion;
	}


	public BigDecimal getbActivo() {
		return bActivo;
	}


	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}


	public String getsNombreAplicacion() {
		return sNombreAplicacion;
	}


	public void setsNombreAplicacion(String sNombreAplicacion) {
		this.sNombreAplicacion = sNombreAplicacion;
	}


	public String getsTituloVentana() {
		return sTituloVentana;
	}


	public void setsTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}


	public String getsUrlInicio() {
		return sUrlInicio;
	}


	public void setsUrlInicio(String sUrlInicio) {
		this.sUrlInicio = sUrlInicio;
	}


	public String getsVersionAplicacion() {
		return sVersionAplicacion;
	}


	public void setsVersionAplicacion(String sVersionAplicacion) {
		this.sVersionAplicacion = sVersionAplicacion;
	}


//	public List<ModuloDTO> getModulos() {
//		return modulos;
//	}
//
//
//	public void setModulos(List<ModuloDTO> modulos) {
//		this.modulos = modulos;
//	}
//
//
//	public List<PermisoDTO> getPermisos() {
//		return permisos;
//	}
//
//
//	public void setPermisos(List<PermisoDTO> permisos) {
//		this.permisos = permisos;
//	}


}
