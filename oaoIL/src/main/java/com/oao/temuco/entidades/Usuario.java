package com.oao.temuco.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Usuario.
 * 
 * @author everis
 */
@Entity
@Table(name = "USUARIO")
public class Usuario {

	/** The Id usuario. */
	@Id
	@Column(name = "N_ID_USUARIO")
	private int IdUsuario;

	/** The nombre usuario. */
	@Column(name = "S_NOMBRE_USUARIO")
	private String nombreUsuario;

	/** The contrasenia. */
	@Column(name = "S_CONTRASENIA")
	private String contrasenia;

	/** The email. */
	@Column(name = "S_EMAIL")
	private String email;

	/** The fecha creacion. */
	@Column(name = "D_FECHA_CREACION")
	private Date fechaCreacion;

	/** The intentos. */
	@Column(name = "N_INTENTOS")
	private int intentos;

	/** The bloqueado. */
	@Column(name = "B_BLOQUEADO")
	private Boolean bloqueado;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private Boolean activo;

	/**
	 * Instantiates a new usuario.
	 */
	public Usuario() {
		super();
	}

	/**
	 * Instantiates a new usuario.
	 * 
	 * @param idUsuario
	 *            the id usuario
	 * @param nombreUsuario
	 *            the nombre usuario
	 * @param contrasenia
	 *            the contrasenia
	 * @param email
	 *            the email
	 * @param fechaCreacion
	 *            the fecha creacion
	 * @param intentos
	 *            the intentos
	 * @param bloqueado
	 *            the bloqueado
	 * @param activo
	 *            the activo
	 */
	public Usuario(int idUsuario, String nombreUsuario, String contrasenia, String email, Date fechaCreacion, int intentos, Boolean bloqueado, Boolean activo) {
		super();
		IdUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.email = email;
		this.fechaCreacion = fechaCreacion;
		this.intentos = intentos;
		this.bloqueado = bloqueado;
		this.activo = activo;
	}

	/**
	 * Gets the id usuario.
	 * 
	 * @return the idUsuario
	 */
	public final int getIdUsuario() {
		return IdUsuario;
	}

	/**
	 * Sets the id usuario.
	 * 
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public final void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	/**
	 * Gets the nombre usuario.
	 * 
	 * @return the nombreUsuario
	 */
	public final String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Sets the nombre usuario.
	 * 
	 * @param nombreUsuario
	 *            the nombreUsuario to set
	 */
	public final void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Gets the contrasenia.
	 * 
	 * @return the contrasenia
	 */
	public final String getContrasenia() {
		return contrasenia;
	}

	/**
	 * Sets the contrasenia.
	 * 
	 * @param contrasenia
	 *            the contrasenia to set
	 */
	public final void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 * 
	 * @param email
	 *            the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
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
	 * Gets the intentos.
	 * 
	 * @return the intentos
	 */
	public final int getIntentos() {
		return intentos;
	}

	/**
	 * Sets the intentos.
	 * 
	 * @param intentos
	 *            the intentos to set
	 */
	public final void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	/**
	 * Gets the bloqueado.
	 * 
	 * @return the bloqueado
	 */
	public final Boolean getBloqueado() {
		return bloqueado;
	}

	/**
	 * Sets the bloqueado.
	 * 
	 * @param bloqueado
	 *            the bloqueado to set
	 */
	public final void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
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
