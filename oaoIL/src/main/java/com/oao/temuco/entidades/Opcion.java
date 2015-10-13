package com.oao.temuco.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Class Opcion.
 * 
 * @author everis
 */
@Entity
@Table(name = "OPCION")
public class Opcion {

	/** The id opcion. */
	@Id
	@Column(name = "N_ID_OPCION")
	private int idOpcion;

	/** The id modulo. */
	@Column(name = "N_ID_MODULO_FK")
	@JoinColumn(name = "N_ID_MODULO")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idModulo;

	/** The nombre opcion. */
	@Column(name = "S_NOMBRE_OPCION")
	private String nombreOpcion;

	/** The version opcion. */
	@Column(name = "S_VERSION_OPCION")
	private String versionOpcion;

	/** The texto opcion. */
	@Column(name = "S_TEXTO_OPCION")
	private String textoOpcion;

	/** The tile. */
	@Column(name = "S_TILE")
	private String tile;

	/**
	 * Instantiates a new opcion.
	 */
	public Opcion() {
		super();
	}

	/**
	 * Instantiates a new opcion.
	 * 
	 * @param idOpcion
	 *            the id opcion
	 * @param idModulo
	 *            the id modulo
	 * @param nombreOpcion
	 *            the nombre opcion
	 * @param versionOpcion
	 *            the version opcion
	 * @param textoOpcion
	 *            the texto opcion
	 * @param tile
	 *            the tile
	 */
	public Opcion(int idOpcion, int idModulo, String nombreOpcion, String versionOpcion, String textoOpcion, String tile) {
		super();
		this.idOpcion = idOpcion;
		this.idModulo = idModulo;
		this.nombreOpcion = nombreOpcion;
		this.versionOpcion = versionOpcion;
		this.textoOpcion = textoOpcion;
		this.tile = tile;
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
	 * Gets the id modulo.
	 * 
	 * @return the idModulo
	 */
	public final int getIdModulo() {
		return idModulo;
	}

	/**
	 * Sets the id modulo.
	 * 
	 * @param idModulo
	 *            the idModulo to set
	 */
	public final void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
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
	 * Gets the texto opcion.
	 * 
	 * @return the textoOpcion
	 */
	public final String getTextoOpcion() {
		return textoOpcion;
	}

	/**
	 * Sets the texto opcion.
	 * 
	 * @param textoOpcion
	 *            the textoOpcion to set
	 */
	public final void setTextoOpcion(String textoOpcion) {
		this.textoOpcion = textoOpcion;
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

}
