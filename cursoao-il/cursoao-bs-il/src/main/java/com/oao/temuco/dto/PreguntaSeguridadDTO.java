package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.oao.temuco.domain.Usuario;

public class PreguntaSeguridadDTO {
	

	private long nIdPregunta;
	private BigDecimal bActivo;
	private Date dFechaCreacion;
	private String sPregunta;
	private String sRespuesta;
	private Usuario usuarioDTO;
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
	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}
	public void setdFechaCreacion(Date dFechaCreacion) {
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
	public Usuario getUsuarioDTO() {
		return usuarioDTO;
	}
	public void setUsuarioDTO(Usuario usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
