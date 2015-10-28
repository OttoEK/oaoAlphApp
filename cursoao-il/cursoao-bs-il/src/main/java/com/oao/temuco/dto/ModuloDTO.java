package com.oao.temuco.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.oao.temuco.domain.Aplicacion;

public class ModuloDTO {

	private long nIdModulo;
	private BigDecimal bActivo;
	private Date dFechaCreacion;
	private String sNombreModulo;
	private String sTile;
	private String sTituloVentana;
	private String sVersionModulo;
	private Aplicacion aplicacion;
	private List<OpcionDTO> opcions;
	private List<PermisoDTO> permisos;
	public long getnIdModulo() {
		return nIdModulo;
	}
	public void setnIdModulo(long nIdModulo) {
		this.nIdModulo = nIdModulo;
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
	public String getsNombreModulo() {
		return sNombreModulo;
	}
	public void setsNombreModulo(String sNombreModulo) {
		this.sNombreModulo = sNombreModulo;
	}
	public String getsTile() {
		return sTile;
	}
	public void setsTile(String sTile) {
		this.sTile = sTile;
	}
	public String getsTituloVentana() {
		return sTituloVentana;
	}
	public void setsTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}
	public String getsVersionModulo() {
		return sVersionModulo;
	}
	public void setsVersionModulo(String sVersionModulo) {
		this.sVersionModulo = sVersionModulo;
	}
	public Aplicacion getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
	public List<OpcionDTO> getOpcions() {
		return opcions;
	}
	public void setOpcions(List<OpcionDTO> opcions) {
		this.opcions = opcions;
	}
	public List<PermisoDTO> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<PermisoDTO> permisos) {
		this.permisos = permisos;
	}

}
