package com.oao.oaoui.entities;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the APLICACION database table.
 * 
 */
public class Aplicacion2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 506069705594745824L;

	private Integer nIdAplicacion;

	private BigDecimal bActivo;

	private String sNombreAplicacion;

	private String sTituloVentana;

	private String sUrlInicio;

	private String sVersionAplicacion;

	public Integer getnIdAplicacion() {
		return nIdAplicacion;
	}

	public void setnIdAplicacion(Integer nIdAplicacion) {
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

	

}