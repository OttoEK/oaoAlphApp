package com.oao.temuco.dto;

import java.util.Date;
import java.util.List;

public class MensajeSistemaDTO {

	private long nIdMensajeSistema;
	private String bActivo;
	private String bAdvertencia;
	private String bError;
	private String bMensajeUsuario;
	private Date dFechaCreacion;
	private String sIdioma;
	private String sMensaje;
	private List<AuditoriaDTO> auditorias;
	private ComponenteDTO componente;
	public long getnIdMensajeSistema() {
		return nIdMensajeSistema;
	}
	public void setnIdMensajeSistema(long nIdMensajeSistema) {
		this.nIdMensajeSistema = nIdMensajeSistema;
	}
	public String getbActivo() {
		return bActivo;
	}
	public void setbActivo(String bActivo) {
		this.bActivo = bActivo;
	}
	public String getbAdvertencia() {
		return bAdvertencia;
	}
	public void setbAdvertencia(String bAdvertencia) {
		this.bAdvertencia = bAdvertencia;
	}
	public String getbError() {
		return bError;
	}
	public void setbError(String bError) {
		this.bError = bError;
	}
	public String getbMensajeUsuario() {
		return bMensajeUsuario;
	}
	public void setbMensajeUsuario(String bMensajeUsuario) {
		this.bMensajeUsuario = bMensajeUsuario;
	}
	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}
	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}
	public String getsIdioma() {
		return sIdioma;
	}
	public void setsIdioma(String sIdioma) {
		this.sIdioma = sIdioma;
	}
	public String getsMensaje() {
		return sMensaje;
	}
	public void setsMensaje(String sMensaje) {
		this.sMensaje = sMensaje;
	}
	public List<AuditoriaDTO> getAuditorias() {
		return auditorias;
	}
	public void setAuditorias(List<AuditoriaDTO> auditorias) {
		this.auditorias = auditorias;
	}
	public ComponenteDTO getComponente() {
		return componente;
	}
	public void setComponente(ComponenteDTO componente) {
		this.componente = componente;
	}

}
