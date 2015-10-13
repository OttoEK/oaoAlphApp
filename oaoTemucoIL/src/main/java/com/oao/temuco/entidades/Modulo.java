package com.oao.temuco.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Modulo.
 *
 * @author everis
 */
@Entity
@NamedQueries({
@NamedQuery(name = "BuscarModuloId", query = "FROM MODULO t WHERE t.N_ID_MODULO = ?")
})
@Table(name = "MODULO")
public class Modulo {
	
	/** The id modulo. */
	@Id
	@Column(name = "N_ID_MODULO")
	private int idModulo;

	/** The id application. */
	@Column(name = "N_ID_APLICACION_FK")
	@JoinColumn(name = "N_ID_APLICACION")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idApplication;

	/** The nombre modulo. */
	@Column(name = "S_NOMBRE_MODULO")
	private int nombreModulo;

	/** The version modulo. */
	@Column(name = "S_VERSION_MODULO")
	private int versionModulo;

	/** The titulo ventana. */
	@Column(name = "S_TITULO_VENTANA")
	private int tituloVentana;

	/** The fecha creacion. */
	@Column(name = "D_FECHA_CREACION")
	private int fechaCreacion;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private int activo;

	/**
	 * Instantiates a new modulo.
	 */
	public Modulo() {
		super();
	}

	/**
	 * Instantiates a new modulo.
	 *
	 * @param idModulo the id modulo
	 * @param idApplication the id application
	 * @param nombreModulo the nombre modulo
	 * @param versionModulo the version modulo
	 * @param tituloVentana the titulo ventana
	 * @param fechaCreacion the fecha creacion
	 * @param activo the activo
	 */
	public Modulo(int idModulo, int idApplication, int nombreModulo, int versionModulo, int tituloVentana, int fechaCreacion, int activo) {
		super();
		this.idModulo = idModulo;
		this.idApplication = idApplication;
		this.nombreModulo = nombreModulo;
		this.versionModulo = versionModulo;
		this.tituloVentana = tituloVentana;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
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
	 * @param idModulo            the idModulo to set
	 */
	public final void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	/**
	 * Gets the id application.
	 *
	 * @return the idApplication
	 */
	public final int getIdApplication() {
		return idApplication;
	}

	/**
	 * Sets the id application.
	 *
	 * @param idApplication            the idApplication to set
	 */
	public final void setIdApplication(int idApplication) {
		this.idApplication = idApplication;
	}

	/**
	 * Gets the nombre modulo.
	 *
	 * @return the nombreModulo
	 */
	public final int getNombreModulo() {
		return nombreModulo;
	}

	/**
	 * Sets the nombre modulo.
	 *
	 * @param nombreModulo            the nombreModulo to set
	 */
	public final void setNombreModulo(int nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	/**
	 * Gets the version modulo.
	 *
	 * @return the versionModulo
	 */
	public final int getVersionModulo() {
		return versionModulo;
	}

	/**
	 * Sets the version modulo.
	 *
	 * @param versionModulo            the versionModulo to set
	 */
	public final void setVersionModulo(int versionModulo) {
		this.versionModulo = versionModulo;
	}

	/**
	 * Gets the titulo ventana.
	 *
	 * @return the tituloVentana
	 */
	public final int getTituloVentana() {
		return tituloVentana;
	}

	/**
	 * Sets the titulo ventana.
	 *
	 * @param tituloVentana            the tituloVentana to set
	 */
	public final void setTituloVentana(int tituloVentana) {
		this.tituloVentana = tituloVentana;
	}

	/**
	 * Gets the fecha creacion.
	 *
	 * @return the fechaCreacion
	 */
	public final int getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Sets the fecha creacion.
	 *
	 * @param fechaCreacion            the fechaCreacion to set
	 */
	public final void setFechaCreacion(int fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Gets the activo.
	 *
	 * @return the activo
	 */
	public final int getActivo() {
		return activo;
	}

	/**
	 * Sets the activo.
	 *
	 * @param activo            the activo to set
	 */
	public final void setActivo(int activo) {
		this.activo = activo;
	}

}
