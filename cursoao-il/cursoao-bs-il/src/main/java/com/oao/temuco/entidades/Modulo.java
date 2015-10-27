package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MODULO database table.
 * 
 */
@Entity
@NamedQuery(name="Modulo.findAll", query="SELECT m FROM Modulo m")
public class Modulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MODULO_IDMODULO_GENERATOR", sequenceName="MODULO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MODULO_IDMODULO_GENERATOR")
	@Column(name="N_ID_MODULO")
	private Integer idModulo;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="S_NOMBRE_MODULO")
	private String nombreModulo;

	@Column(name="S_TILE")
	private String tile;

	@Column(name="S_TITULO_VENTANA")
	private String tituloVentana;

	@Column(name="S_VERSION_MODULO")
	private String versionModulo;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne
	@JoinColumn(name="N_ID_APLICACION_FK")
	private Aplicacion aplicacion;

	//bi-directional many-to-one association to Opcion
	@OneToMany(mappedBy="modulo")
	private List<Opcion> opcions;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="modulo")
	private List<Permiso> permisos;

	public Modulo() {
	}

	public Integer getIdModulo() {
		return this.idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombreModulo() {
		return this.nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public String getTile() {
		return this.tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public String getTituloVentana() {
		return this.tituloVentana;
	}

	public void setTituloVentana(String tituloVentana) {
		this.tituloVentana = tituloVentana;
	}

	public String getVersionModulo() {
		return this.versionModulo;
	}

	public void setVersionModulo(String versionModulo) {
		this.versionModulo = versionModulo;
	}

	public Aplicacion getAplicacion() {
		return this.aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public Opcion addOpcion(Opcion opcion) {
		getOpcions().add(opcion);
		opcion.setModulo(this);

		return opcion;
	}

	public Opcion removeOpcion(Opcion opcion) {
		getOpcions().remove(opcion);
		opcion.setModulo(null);

		return opcion;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setModulo(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setModulo(null);

		return permiso;
	}

}