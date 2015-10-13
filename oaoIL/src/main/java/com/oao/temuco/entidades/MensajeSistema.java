package com.oao.temuco.entidades;


import java.sql.Date;

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
 * The Class MensajeSistema.
 * 
 * @author everis
 */
@Entity
@NamedQueries({
@NamedQuery(name = "buscarPorIdMensaje", query = "FROM MENSAJE_SISTEMA t WHERE t.N_ID_MENSAJE_SISTEMA = ?")
})
@Table(name = "MENSAJE_SISTEMA")
public class MensajeSistema {

	/** The id mensaje sistema. */
	@Id
	@Column(name = "N_ID_MENSAJE_SISTEMA")
	private int idMensajeSistema;

	/** The id componente. */
	@Column(name = "N_ID_COMPONENTE_FK")
	@JoinColumn(name = "N_ID_COMPONENTE")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idComponente;

	/** The mensaje. */
	@Column(name = "S_MENSAJE")
	private String mensaje;

	/** The error. */
	@Column(name = "B_ERROR")
	private Boolean error;

	/** The advertencia. */
	@Column(name = "B_ADVERTENCIA")
	private Boolean advertencia;

	/** The mensaje usuario. */
	@Column(name = "B_MENSAJE_USUARIO")
	private String mensajeUsuario;

	/** The idioma. */
	@Column(name = "S_IDIOMA")
	private String idioma;

	/** The fecha creacion. */
	@Column(name = "D_FECHA_CREACION")
	private Date fechaCreacion;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private Boolean activo;

	/**
	 * Instantiates a new mensaje sistema.
	 */
	public MensajeSistema() {
		super();
	}

	/**
	 * Instantiates a new mensaje sistema.
	 * 
	 * @param idMensajeSistema
	 *            the id mensaje sistema
	 * @param idComponente
	 *            the id componente
	 * @param mensaje
	 *            the mensaje
	 * @param error
	 *            the error
	 * @param advertencia
	 *            the advertencia
	 * @param mensajeUsuario
	 *            the mensaje usuario
	 * @param idioma
	 *            the idioma
	 * @param fechaCreacion
	 *            the fecha creacion
	 * @param activo
	 *            the activo
	 */
	public MensajeSistema(int idMensajeSistema, int idComponente, String mensaje, Boolean error, Boolean advertencia, String mensajeUsuario, String idioma, Date fechaCreacion,
			Boolean activo) {
		super();
		this.idMensajeSistema = idMensajeSistema;
		this.idComponente = idComponente;
		this.mensaje = mensaje;
		this.error = error;
		this.advertencia = advertencia;
		this.mensajeUsuario = mensajeUsuario;
		this.idioma = idioma;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
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
	 * Gets the mensaje.
	 * 
	 * @return the mensaje
	 */
	public final String getMensaje() {
		return mensaje;
	}

	/**
	 * Sets the mensaje.
	 * 
	 * @param mensaje
	 *            the mensaje to set
	 */
	public final void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Gets the error.
	 * 
	 * @return the error
	 */
	public final Boolean getError() {
		return error;
	}

	/**
	 * Sets the error.
	 * 
	 * @param error
	 *            the error to set
	 */
	public final void setError(Boolean error) {
		this.error = error;
	}

	/**
	 * Gets the advertencia.
	 * 
	 * @return the advertencia
	 */
	public final Boolean getAdvertencia() {
		return advertencia;
	}

	/**
	 * Sets the advertencia.
	 * 
	 * @param advertencia
	 *            the advertencia to set
	 */
	public final void setAdvertencia(Boolean advertencia) {
		this.advertencia = advertencia;
	}

	/**
	 * Gets the mensaje usuario.
	 * 
	 * @return the mensajeUsuario
	 */
	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}

	/**
	 * Sets the mensaje usuario.
	 * 
	 * @param mensajeUsuario
	 *            the mensajeUsuario to set
	 */
	public final void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}

	/**
	 * Gets the idioma.
	 * 
	 * @return the idioma
	 */
	public final String getIdioma() {
		return idioma;
	}

	/**
	 * Sets the idioma.
	 * 
	 * @param idioma
	 *            the idioma to set
	 */
	public final void setIdioma(String idioma) {
		this.idioma = idioma;
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
