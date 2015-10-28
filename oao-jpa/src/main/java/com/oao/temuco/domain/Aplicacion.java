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

	public long getNIdAplicacion() {
		return this.nIdAplicacion;
	}

	public void setNIdAplicacion(long nIdAplicacion) {
		this.nIdAplicacion = nIdAplicacion;
	}

	public BigDecimal getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public String getSNombreAplicacion() {
		return this.sNombreAplicacion;
	}

	public void setSNombreAplicacion(String sNombreAplicacion) {
		this.sNombreAplicacion = sNombreAplicacion;
	}

	public String getSTituloVentana() {
		return this.sTituloVentana;
	}

	public void setSTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}

	public String getSUrlInicio() {
		return this.sUrlInicio;
	}

	public void setSUrlInicio(String sUrlInicio) {
		this.sUrlInicio = sUrlInicio;
	}

	public String getSVersionAplicacion() {
		return this.sVersionAplicacion;
	}

	public void setSVersionAplicacion(String sVersionAplicacion) {
		this.sVersionAplicacion = sVersionAplicacion;
	}

	public List<Modulo> getModulos() {
		return this.modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Modulo addModulo(Modulo modulo) {
		getModulos().add(modulo);
		modulo.setAplicacion(this);

		return modulo;
	}

	public Modulo removeModulo(Modulo modulo) {
		getModulos().remove(modulo);
		modulo.setAplicacion(null);

		return modulo;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setAplicacion(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setAplicacion(null);

		return permiso;
	}

}