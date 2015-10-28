package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ComponenteDTO {
	
	private long nIdComponente;
	private BigDecimal bActivo;
	private Date dFechaCreacion;
	private BigDecimal nIdMensajeSistemaFk;
	private String sNombreOpcion;
	private String sTile;
	private String sVersionOpcion;
	private OpcionDTO opcion;
	private List<MensajeSistemaDTO> mensajeSistemas;
	public long getnIdComponente() {
		return nIdComponente;
	}
	public void setnIdComponente(long nIdComponente) {
		this.nIdComponente = nIdComponente;
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
	public BigDecimal getnIdMensajeSistemaFk() {
		return nIdMensajeSistemaFk;
	}
	public void setnIdMensajeSistemaFk(BigDecimal nIdMensajeSistemaFk) {
		this.nIdMensajeSistemaFk = nIdMensajeSistemaFk;
	}
	public String getsNombreOpcion() {
		return sNombreOpcion;
	}
	public void setsNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
	}
	public String getsTile() {
		return sTile;
	}
	public void setsTile(String sTile) {
		this.sTile = sTile;
	}
	public String getsVersionOpcion() {
		return sVersionOpcion;
	}
	public void setsVersionOpcion(String sVersionOpcion) {
		this.sVersionOpcion = sVersionOpcion;
	}
	public OpcionDTO getOpcion() {
		return opcion;
	}
	public void setOpcion(OpcionDTO opcion) {
		this.opcion = opcion;
	}
	public List<MensajeSistemaDTO> getMensajeSistemas() {
		return mensajeSistemas;
	}
	public void setMensajeSistemas(List<MensajeSistemaDTO> mensajeSistemas) {
		this.mensajeSistemas = mensajeSistemas;
	}

}
