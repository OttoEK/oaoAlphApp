package com.oao.temuco.entidades;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Componente.
 * 
 * @author everis
 */
@Entity
@Table(name = "COMPONENTE")
public class Componente {
	
//
//	@JoinColumn(name = "N_ID_COMPONENTE")
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

	/** The id componente. */
	@Id
	@Column(name = "N_ID_COMPONENTE")
	private int idComponente;

	/** The id opcion. */
	@Column(name = "N_ID_OPCION_FK")
	@JoinColumn(name = "N_ID_OPCION")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idOpcion;

	/** The id mensaje sistema. */
	@Column(name = "N_ID_MENSAJE_SISTEMA_FK")
	@JoinColumn(name = "N_ID_MENSAJE_SISTEMA")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idMensajeSistema;

	/** The nombre opcion. */
	@Column(name = "S_NOMBRE_OPCION")
	private String nombreOpcion;

	/** The version opcion. */
	@Column(name = "S_VERSION_OPCION")
	private String versionOpcion;

	/** The tile. */
	@Column(name = "S_TILE")
	private String tile;

	/** The fecha creacion. */
	@Column(name = "D_FECHA_CREACION")
	private Date fechaCreacion;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private Boolean activo;

	/**
	 * Instantiates a new componente.
	 */
	public Componente() {
		super();
	}

	/**
	 * Instantiates a new componente.
	 * 
	 * @param idComponente
	 *            the id componente
	 * @param idOpcion
	 *            the id opcion
	 * @param idMensajeSistema
	 *            the id mensaje sistema
	 * @param nombreOpcion
	 *            the nombre opcion
	 * @param versionOpcion
	 *            the version opcion
	 * @param tile
	 *            the tile
	 * @param fechaCreacion
	 *            the fecha creacion
	 * @param activo
	 *            the activo
	 */
	public Componente(int idComponente, int idOpcion, int idMensajeSistema, String nombreOpcion, String versionOpcion, String tile, Date fechaCreacion, Boolean activo) {
		super();
		this.idComponente = idComponente;
		this.idOpcion = idOpcion;
		this.idMensajeSistema = idMensajeSistema;
		this.nombreOpcion = nombreOpcion;
		this.versionOpcion = versionOpcion;
		this.tile = tile;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
	}

	/**
	 * Gets the id componente.
	 * 
	 * @return the idComponente
	 */
	public final int getIdComponente() {
		return idComponente;
	}

	/**
	 * Sets the id componente.
	 * 
	 * @param idComponente
	 *            the idComponente to set
	 */
	public final void setIdComponente(int idComponente) {
		this.idComponente = idComponente;
	}

	/**
	 * Gets the id opcion.
	 * 
	 * @return the idOpcion
	 */
	public final int getIdOpcion() {
		return idOpcion;
	}

	/**
	 * Sets the id opcion.
	 * 
	 * @param idOpcion
	 *            the idOpcion to set
	 */
	public final void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}

	/**
	 * Gets the id mensaje sistema.
	 * 
	 * @return the idMensajeSistema
	 */
	public final int getIdMensajeSistema() {
		return idMensajeSistema;
	}

	/**
	 * Sets the id mensaje sistema.
	 * 
	 * @param idMensajeSistema
	 *            the idMensajeSistema to set
	 */
	public final void setIdMensajeSistema(int idMensajeSistema) {
		this.idMensajeSistema = idMensajeSistema;
	}

	/**
	 * Gets the nombre opcion.
	 * 
	 * @return the nombreOpcion
	 */
	public final String getNombreOpcion() {
		return nombreOpcion;
	}

	/**
	 * Sets the nombre opcion.
	 * 
	 * @param nombreOpcion
	 *            the nombreOpcion to set
	 */
	public final void setNombreOpcion(String nombreOpcion) {
		this.nombreOpcion = nombreOpcion;
	}

	/**
	 * Gets the version opcion.
	 * 
	 * @return the versionOpcion
	 */
	public final String getVersionOpcion() {
		return versionOpcion;
	}

	/**
	 * Sets the version opcion.
	 * 
	 * @param versionOpcion
	 *            the versionOpcion to set
	 */
	public final void setVersionOpcion(String versionOpcion) {
		this.versionOpcion = versionOpcion;
	}

	/**
	 * Gets the tile.
	 * 
	 * @return the tile
	 */
	public final String getTile() {
		return tile;
	}

	/**
	 * Sets the tile.
	 * 
	 * @param tile
	 *            the tile to set
	 */
	public final void setTile(String tile) {
		this.tile = tile;
	}

	/**
	 * Gets the fecha creacion.
	 * 
	 * @return the fechaCreacion
	 */
	public final Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Sets the fecha creacion.
	 * 
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public final void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Gets the activo.
	 * 
	 * @return the activo
	 */
	public final Boolean getActivo() {
		return activo;
	}

	/**
	 * Sets the activo.
	 * 
	 * @param activo
	 *            the activo to set
	 */
	public final void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
