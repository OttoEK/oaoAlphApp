package com.oao.oaoui.entities;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the APLICACION database table.
 * 
 */
public class Aplicacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 506069705594745824L;

	private long nIdAplicacion;

	private BigDecimal bActivo;

	private String sNombreAplicacion;

	private String sTituloVentana;

	private String sUrlInicio;

	private String sVersionAplicacion;

	public long getNIdAplicacion() {
		return nIdAplicacion;
	}

	public void setNIdAplicacion(long nIdAplicacion) {
		this.nIdAplicacion = nIdAplicacion;
	}

	public BigDecimal getBActivo() {
		return bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public String getSNombreAplicacion() {
		return sNombreAplicacion;
	}

	public void setSNombreAplicacion(String sNombreAplicacion) {
		this.sNombreAplicacion = sNombreAplicacion;
	}

	public String getSTituloVentana() {
		return sTituloVentana;
	}

	public void setSTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}

	public String getSUrlInicio() {
		return sUrlInicio;
	}

	public void setSUrlInicio(String sUrlInicio) {
		this.sUrlInicio = sUrlInicio;
	}

	public String getSVersionAplicacion() {
		return sVersionAplicacion;
	}

	public void setSVersionAplicacion(String sVersionAplicacion) {
		this.sVersionAplicacion = sVersionAplicacion;
	}

	
	
	
	


}