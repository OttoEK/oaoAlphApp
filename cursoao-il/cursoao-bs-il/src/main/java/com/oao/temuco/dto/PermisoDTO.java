package com.oao.temuco.dto;

import java.math.BigDecimal;

public class PermisoDTO {
	
    private long nIdPermiso;
	private BigDecimal bActivo;
	private BigDecimal bEscritura;
	private BigDecimal bLectura;
	private String dDesde;
	private String dHasta;
//	private List<AuditoriaDTO> auditorias;
//	private AplicacionDTO aplicacion;
//	private ModuloDTO modulo;
//	private OpcionDTO opcion;
//	private UsuarioDTO usuario;
	
	public long getnIdPermiso() {
		return nIdPermiso;
	}
	public void setnIdPermiso(long nIdPermiso) {
		this.nIdPermiso = nIdPermiso;
	}
	public BigDecimal getbActivo() {
		return bActivo;
	}
	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}
	public BigDecimal getbEscritura() {
		return bEscritura;
	}
	public void setbEscritura(BigDecimal bEscritura) {
		this.bEscritura = bEscritura;
	}
	public BigDecimal getbLectura() {
		return bLectura;
	}
	public void setbLectura(BigDecimal bLectura) {
		this.bLectura = bLectura;
	}
	public String getdDesde() {
		return dDesde;
	}
	public void setdDesde(String dDesde) {
		this.dDesde = dDesde;
	}
	public String getdHasta() {
		return dHasta;
	}
	public void setdHasta(String dHasta) {
		this.dHasta = dHasta;
	}
//	public List<AuditoriaDTO> getAuditorias() {
//		return auditorias;
//	}
//	public void setAuditorias(List<AuditoriaDTO> auditorias) {
//		this.auditorias = auditorias;
//	}
//	public AplicacionDTO getAplicacion() {
//		return aplicacion;
//	}
//	public void setAplicacion(AplicacionDTO aplicacion) {
//		this.aplicacion = aplicacion;
//	}
//	public ModuloDTO getModulo() {
//		return modulo;
//	}
//	public void setModulo(ModuloDTO modulo) {
//		this.modulo = modulo;
//	}
//	public OpcionDTO getOpcion() {
//		return opcion;
//	}
//	public void setOpcion(OpcionDTO opcion) {
//		this.opcion = opcion;
//	}
//	public UsuarioDTO getUsuario() {
//		return usuario;
//	}
//	public void setUsuario(UsuarioDTO usuario) {
//		this.usuario = usuario;
//	}

}
