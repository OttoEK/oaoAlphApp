package com.oao.temuco.entidades;

/**
 * The Class Salida.
 * 
 * @author everis
 */
public class Salida {

	/** The finalizado. */
	private Boolean finalizado;

	/** The descripcion. */
	private String descripcion;

	/**
	 * Instantiates a new salida.
	 */
	public Salida() {
		super();
	}

	/**
	 * Instantiates a new salida.
	 * 
	 * @param finalizado
	 *            the finalizado
	 * @param descripcion
	 *            the descripcion
	 */
	public Salida(Boolean finalizado, String descripcion) {
		super();
		this.finalizado = finalizado;
		this.descripcion = descripcion;
	}

	/**
	 * Gets the finalizado.
	 * 
	 * @return the finalizado
	 */
	public final Boolean getFinalizado() {
		return finalizado;
	}

	/**
	 * Sets the finalizado.
	 * 
	 * @param finalizado
	 *            the finalizado to set
	 */
	public final void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	/**
	 * Gets the descripcion.
	 * 
	 * @return the descripcion
	 */
	public final String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 * 
	 * @param descripcion
	 *            the descripcion to set
	 */
	public final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
