package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OpcionDTO {
	

	private long nIdOpcion;
	private BigDecimal bActivo;
	private Date dFechaCreacion;
	private String sNombreOpcion;
	private String sTextoOpcion;
	private String sTile;
	private String sVersionOpcion;
	private List<ComponenteDTO> componentes;
	private ModuloDTO modulo;
	private List<PermisoDTO> permisos;
	public long getnIdOpcion() {
		return nIdOpcion;
	}
	public void setnIdOpcion(long nIdOpcion) {
		this.nIdOpcion = nIdOpcion;
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
	public String getsNombreOpcion() {
		return sNombreOpcion;
	}
	public void setsNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
	}
	public String getsTextoOpcion() {
		return sTextoOpcion;
	}
	public void setsTextoOpcion(String sTextoOpcion) {
		this.sTextoOpcion = sTextoOpcion;
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
	public List<ComponenteDTO> getComponentes() {
		return componentes;
	}
	public void setComponentes(List<ComponenteDTO> componentes) {
		this.componentes = componentes;
	}
	public ModuloDTO getModulo() {
		return modulo;
	}
	public void setModulo(ModuloDTO modulo) {
		this.modulo = modulo;
	}
	public List<PermisoDTO> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<PermisoDTO> permisos) {
		this.permisos = permisos;
	}

}
