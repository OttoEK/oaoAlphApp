package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.oao.temuco.domain.Permiso;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the APLICACION database table.
 * 
 */
@Entity
@NamedQuery(name="Aplicacion.findAll", query="SELECT a FROM Aplicacion a")
public class Aplicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="APLICACION_NIDAPLICACION_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APLICACION_NIDAPLICACION_GENERATOR")
	@Column(name="N_ID_APLICACION")
	private long nIdAplicacion;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Column(name="S_NOMBRE_APLICACION")
	private String sNombreAplicacion;

	@Column(name="S_TITULO_VENTANA")
	private String sTituloVentana;

	@Column(name="S_URL_INICIO")
	private String sUrlInicio;

	@Column(name="S_VERSION_APLICACION")
	private String sVersionAplicacion;

	//bi-directional many-to-one association to Modulo
	@OneToMany(mappedBy="aplicacion")
	private List<Modulo> modulos;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="aplicacion")
	private List<Permiso> permisos;

	public Aplicacion() {
	}

	public long getnIdAplicacion() {
		return nIdAplicacion;
	}

	public void setnIdAplicacion(long nIdAplicacion) {
		this.nIdAplicacion = nIdAplicacion;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public String getsNombreAplicacion() {
		return sNombreAplicacion;
	}

	public void setsNombreAplicacion(String sNombreAplicacion) {
		this.sNombreAplicacion = sNombreAplicacion;
	}

	public String getsTituloVentana() {
		return sTituloVentana;
	}

	public void setsTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}

	public String getsUrlInicio() {
		return sUrlInicio;
	}

	public void setsUrlInicio(String sUrlInicio) {
		this.sUrlInicio = sUrlInicio;
	}

	public String getsVersionAplicacion() {
		return sVersionAplicacion;
	}

	public void setsVersionAplicacion(String sVersionAplicacion) {
		this.sVersionAplicacion = sVersionAplicacion;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}



}