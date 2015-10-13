package com.oao.temuco.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class PreguntaSeguridad.
 * 
 * @author everis
 */
@Entity
@Table(name = "PREGUNTA_SEGURIDAD")
public class PreguntaSeguridad {

	/** The id pregunta. */
	@Id
	@Column(name = "N_ID_PREGUNTA")
	private int idPregunta;

	/** The Id usuario. */
	@Column(name = "N_ID_USUARIO_FK")
	@JoinColumn(name = "N_ID_USUARIO")
	@ManyToOne(fetch = FetchType.EAGER)
	private int IdUsuario;

	/** The pregunta. */
	@Column(name = "S_PREGUNTA")
	private String pregunta;

	/** The respuesta. */
	@Column(name = "S_RESPUESTA")
	private String respuesta;

	/** The fecha creacion. */
	@Column(name = "D_FECHA_CREACION")
	private Date fechaCreacion;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private Boolean activo;

	/**
	 * Instantiates a new pregunta seguridad.
	 */
	public PreguntaSeguridad() {
		super();
	}

	/**
	 * Instantiates a new pregunta seguridad.
	 * 
	 * @param idPregunta
	 *            the id pregunta
	 * @param idUsuario
	 *            the id usuario
	 * @param pregunta
	 *            the pregunta
	 * @param respuesta
	 *            the respuesta
	 * @param fechaCreacion
	 *            the fecha creacion
	 * @param activo
	 *            the activo
	 */
	public PreguntaSeguridad(int idPregunta, int idUsuario, String pregunta, String respuesta, Date fechaCreacion, Boolean activo) {
		super();
		this.idPregunta = idPregunta;
		IdUsuario = idUsuario;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.fechaCreacion = fechaCreacion;
		this.activo = activo;
	}

	/**
	 * Gets the id pregunta.
	 * 
	 * @return the idPregunta
	 */
	public final int getIdPregunta() {
		return idPregunta;
	}

	/**
	 * Sets the id pregunta.
	 * 
	 * @param idPregunta
	 *            the idPregunta to set
	 */
	public final void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
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
	 * Gets the pregunta.
	 * 
	 * @return the pregunta
	 */
	public final String getPregunta() {
		return pregunta;
	}

	/**
	 * Sets the pregunta.
	 * 
	 * @param pregunta
	 *            the pregunta to set
	 */
	public final void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * Gets the respuesta.
	 * 
	 * @return the respuesta
	 */
	public final String getRespuesta() {
		return respuesta;
	}

	/**
	 * Sets the respuesta.
	 * 
	 * @param respuesta
	 *            the respuesta to set
	 */
	public final void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
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
