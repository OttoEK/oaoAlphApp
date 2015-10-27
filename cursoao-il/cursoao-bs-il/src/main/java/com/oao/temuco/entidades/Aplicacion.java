package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

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
	@SequenceGenerator(name="APLICACION_IDAPLICACION_GENERATOR", sequenceName="APLICACION_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="APLICACION_IDAPLICACION_GENERATOR")
	@Column(name="N_ID_APLICACION")
	private Integer idAplicacion;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Column(name="S_NOMBRE_APLICACION")
	private String nombreAplicacion;

	@Column(name="S_TITULO_VENTANA")
	private String yituloVentana;

	@Column(name="S_URL_INICIO")
	private String urlInicio;

	@Column(name="S_VERSION_APLICACION")
	private String versionAplicacion;

	//bi-directional many-to-one association to Modulo
	@OneToMany(mappedBy="aplicacion")
	private List<Modulo> modulos;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="aplicacion")
	private List<Permiso> permisos;

	public Aplicacion() {
	}

	public Integer getIdAplicacion() {
		return this.idAplicacion;
	}

	public void setIdAplicacion(Integer idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getNombreAplicacion() {
		return this.nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	public String getYituloVentana() {
		return this.yituloVentana;
	}

	public void setYituloVentana(String yituloVentana) {
		this.yituloVentana = yituloVentana;
	}

	public String getUrlInicio() {
		return this.urlInicio;
	}

	public void setUrlInicio(String urlInicio) {
		this.urlInicio = urlInicio;
	}

	public String getVersionAplicacion() {
		return this.versionAplicacion;
	}

	public void setVersionAplicacion(String versionAplicacion) {
		this.versionAplicacion = versionAplicacion;
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