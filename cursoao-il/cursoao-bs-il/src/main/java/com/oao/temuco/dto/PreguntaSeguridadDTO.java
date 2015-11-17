package com.oao.temuco.dto;

import java.math.BigDecimal;

public class PreguntaSeguridadDTO {
	

	private long nIdPregunta;
	private BigDecimal bActivo;
	private String dFechaCreacion;
	private String sPregunta;
	private String sRespuesta;
//	private UsuarioDTO usuario;
	
	public long getnIdPregunta() {
		return nIdPregunta;
	}
	public void setnIdPregunta(long nIdPregunta) {
		this.nIdPregunta = nIdPregunta;
	}
	public BigDecimal getbActivo() {
		return bActivo;
	}
	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}
	public String getdFechaCreacion() {
		return dFechaCreacion;
	}
	public void setdFechaCreacion(String dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}
	public String getsPregunta() {
		return sPregunta;
	}
	public void setsPregunta(String sPregunta) {
		this.sPregunta = sPregunta;
	}
	public String getsRespuesta() {
		return sRespuesta;
	}
	public void setsRespuesta(String sRespuesta) {
		this.sRespuesta = sRespuesta;
	}
//	public UsuarioDTO getUsuario() {
//		return usuario;
//	}
//	public void setUsuario(UsuarioDTO usuario) {
//		this.usuario = usuario;
//	}


}
