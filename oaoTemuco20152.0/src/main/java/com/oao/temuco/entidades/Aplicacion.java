package com.oao.temuco.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The Class Aplicacion.
 * 
 * @author everis
 */
@Entity
@NamedQueries({
@NamedQuery(name = "BuscaAplicacionPorId", query = "FROM Aplicacion t WHERE t.aplicacionNumer != NULL"),
})
@Table(name = "APLICACION")
public class Aplicacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The aplicacion numer. */
	@Id
	@Column(name = "N_ID_LIBRO", unique = true, nullable = false)
	private int aplicacionNumero;

	/** The nombre aplicacion. */
	@Column(name = "S_NOMBRE_APLICACION")
	private String nombreAplicacion;

	/** The s_version aplicacion. */
	@Column(name = "S_VERSION_APLICACION")
	private String s_versionAplicacion;

	/** The s url inicio. */
	@Column(name = "S_URL_INICIO")
	private String sUrlInicio;

	/** The titulo ventana. */
	@Column(name = "S_TITULO_VENTANA")
	private String tituloVentana;

	/** The Activo. */
	@Column(name = "B_ACTIVO")
	private Boolean Activo;

	/**
	 * Instantiates a new aplicacion.
	 */
	public Aplicacion() {
		super();
	}

	/**
	 * Instantiates a new aplicacion.
	 * 
	 * @param aplicacionNumer
	 *            the aplicacion numer
	 * @param nombreAplicacion
	 *            the nombre aplicacion
	 * @param s_versionAplicacion
	 *            the s_version aplicacion
	 * @param sUrlInicio
	 *            the s url inicio
	 * @param tituloVentana
	 *            the titulo ventana
	 * @param activo
	 *            the activo
	 */
	public Aplicacion(int aplicacionNumer, String nombreAplicacion, String s_versionAplicacion, String sUrlInicio, String tituloVentana, Boolean activo) {
		super();
		this.aplicacionNumero = aplicacionNumer;
		this.nombreAplicacion = nombreAplicacion;
		this.s_versionAplicacion = s_versionAplicacion;
		this.sUrlInicio = sUrlInicio;
		this.tituloVentana = tituloVentana;
		Activo = activo;
	}

	/**
	 * Gets the aplicacion numer.
	 * 
	 * @return the aplicacionNumer
	 */
	public final int getAplicacionNumero() {
		return aplicacionNumero;
	}

	/**
	 * Sets the aplicacion numer.
	 * 
	 * @param aplicacionNumer
	 *            the aplicacionNumer to set
	 */
	public final void setAplicacionNumero(int aplicacionNumero) {
		this.aplicacionNumero = aplicacionNumero;
	}

	/**
	 * Gets the nombre aplicacion.
	 * 
	 * @return the nombreAplicacion
	 */
	public final String getNombreAplicacion() {
		return nombreAplicacion;
	}

	/**
	 * Sets the nombre aplicacion.
	 * 
	 * @param nombreAplicacion
	 *            the nombreAplicacion to set
	 */
	public final void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	/**
	 * Gets the s_version aplicacion.
	 * 
	 * @return the s_versionAplicacion
	 */
	public final String getS_versionAplicacion() {
		return s_versionAplicacion;
	}

	/**
	 * Sets the s_version aplicacion.
	 * 
	 * @param s_versionAplicacion
	 *            the s_versionAplicacion to set
	 */
	public final void setS_versionAplicacion(String s_versionAplicacion) {
		this.s_versionAplicacion = s_versionAplicacion;
	}

	/**
	 * Gets the s url inicio.
	 * 
	 * @return the sUrlInicio
	 */
	public final String getsUrlInicio() {
		return sUrlInicio;
	}

	/**
	 * Sets the s url inicio.
	 * 
	 * @param sUrlInicio
	 *            the sUrlInicio to set
	 */
	public final void setsUrlInicio(String sUrlInicio) {
		this.sUrlInicio = sUrlInicio;
	}

	/**
	 * Gets the titulo ventana.
	 * 
	 * @return the tituloVentana
	 */
	public final String getTituloVentana() {
		return tituloVentana;
	}

	/**
	 * Sets the titulo ventana.
	 * 
	 * @param tituloVentana
	 *            the tituloVentana to set
	 */
	public final void setTituloVentana(String tituloVentana) {
		this.tituloVentana = tituloVentana;
	}

	/**
	 * Gets the activo.
	 * 
	 * @return the activo
	 */
	public final Boolean getActivo() {
		return Activo;
	}

	/**
	 * Sets the activo.
	 * 
	 * @param activo
	 *            the activo to set
	 */
	public final void setActivo(Boolean activo) {
		Activo = activo;
	}

}