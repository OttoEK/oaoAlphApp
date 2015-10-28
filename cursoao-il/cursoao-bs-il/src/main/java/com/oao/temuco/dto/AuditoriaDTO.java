package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AuditoriaDTO {
	
	
	private long nIdAuditoria;
	private BigDecimal bSesionExpirada;
	private Date dFechaAccion;
	private MensajeSistemaDTO mensajeSistema;
	private PermisoDTO permiso;
	
	public long getnIdAuditoria() {
		return nIdAuditoria;
	}
	public void setnIdAuditoria(long nIdAuditoria) {
		this.nIdAuditoria = nIdAuditoria;
	}
	public BigDecimal getbSesionExpirada() {
		return bSesionExpirada;
	}
	public void setbSesionExpirada(BigDecimal bSesionExpirada) {
		this.bSesionExpirada = bSesionExpirada;
	}
	public Date getdFechaAccion() {
		return dFechaAccion;
	}
	public void setdFechaAccion(Date dFechaAccion) {
		this.dFechaAccion = dFechaAccion;
	}
	public MensajeSistemaDTO getMensajeSistema() {
		return mensajeSistema;
	}
	public void setMensajeSistema(MensajeSistemaDTO mensajeSistema) {
		this.mensajeSistema = mensajeSistema;
	}
	public PermisoDTO getPermiso() {
		return permiso;
	}
	public void setPermiso(PermisoDTO permiso) {
		this.permiso = permiso;
	}
	

}
