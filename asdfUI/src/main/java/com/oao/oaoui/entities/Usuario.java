package com.oao.oaoui.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the USUARIO database table.
 * 
 */
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3859897607085333753L;

	private long nIdUsuario;

	private BigDecimal bActivo;

	private BigDecimal bBloqueado;

	private Date dFechaCreacion;

	private BigDecimal nIntentos;

	private String sContrasenia;

	private String sEmail;

	private String sNombreUsuario;

	// //bi-directional many-to-one association to Permiso
	// private List<Permiso> permisos;
	//
	// //bi-directional many-to-one association to PreguntaSeguridad
	// private List<PreguntaSeguridad> preguntaSeguridads;

	public long getnIdUsuario() {
		return nIdUsuario;
	}

	public void setnIdUsuario(long nIdUsuario) {
		this.nIdUsuario = nIdUsuario;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getbBloqueado() {
		return bBloqueado;
	}

	public void setbBloqueado(BigDecimal bBloqueado) {
		this.bBloqueado = bBloqueado;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public BigDecimal getnIntentos() {
		return nIntentos;
	}

	public void setnIntentos(BigDecimal nIntentos) {
		this.nIntentos = nIntentos;
	}

	public String getsContrasenia() {
		return sContrasenia;
	}

	public void setsContrasenia(String sContrasenia) {
		this.sContrasenia = sContrasenia;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsNombreUsuario() {
		return sNombreUsuario;
	}

	public void setsNombreUsuario(String sNombreUsuario) {
		this.sNombreUsuario = sNombreUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nIdUsuario=" + nIdUsuario + ", bActivo=" + bActivo + ", bBloqueado=" + bBloqueado
				+ ", dFechaCreacion=" + dFechaCreacion + ", nIntentos=" + nIntentos + ", sContrasenia=" + sContrasenia
				+ ", sEmail=" + sEmail + ", sNombreUsuario=" + sNombreUsuario + "]";
	}
	
	
}