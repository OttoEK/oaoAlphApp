package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPCION database table.
 * 
 */
@Entity
@NamedQuery(name="Opcion.findAll", query="SELECT o FROM Opcion o")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPCION_IDOPCION_GENERATOR", sequenceName="OPCION_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPCION_IDOPCION_GENERATOR")
	@Column(name="N_ID_OPCION")
	private Integer idOpcion;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="S_NOMBRE_OPCION")
	private String nombreOpcion;

	@Column(name="S_TEXTO_OPCION")
	private String textoOpcion;

	@Column(name="S_TILE")
	private String tile;

	@Column(name="S_VERSION_OPCION")
	private String versionOpcion;

	//bi-directional many-to-one association to Modulo
	@ManyToOne
	@JoinColumn(name="N_ID_MODULO_FK")
	private Modulo modulo;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="opcion")
	private List<Permiso> permisos;

	public Opcion() {
	}

	public Integer getIdOpcion() {
		return this.idOpcion;
	}

	public void setIdOpcion(Integer idOpcion) {
		this.idOpcion = idOpcion;
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

	public String getNombreOpcion() {
		return this.nombreOpcion;
	}

	public void setNombreOpcion(String nombreOpcion) {
		this.nombreOpcion = nombreOpcion;
	}

	public String getTextoOpcion() {
		return this.textoOpcion;
	}

	public void setTextoOpcion(String textoOpcion) {
		this.textoOpcion = textoOpcion;
	}

	public String getTile() {
		return this.tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public String getVersionOpcion() {
		return this.versionOpcion;
	}

	public void setVersionOpcion(String versionOpcion) {
		this.versionOpcion = versionOpcion;
	}

	public Modulo getModulo() {
		return this.modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setOpcion(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setOpcion(null);

		return permiso;
	}

}