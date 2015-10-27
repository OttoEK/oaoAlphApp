package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the PREGUNTA_SEGURIDAD database table.
 * 
 */
@Entity
@Table(name="PREGUNTA_SEGURIDAD")
@NamedQuery(name="PreguntaSeguridad.findAll", query="SELECT p FROM PreguntaSeguridad p")
public class PreguntaSeguridad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PREGUNTA_SEGURIDAD_IDPREGUNTA_GENERATOR", sequenceName="PREGUNTA_SEGURIDAD_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PREGUNTA_SEGURIDAD_IDPREGUNTA_GENERATOR")
	@Column(name="N_ID_PREGUNTA")
	private Integer idPregunta;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="S_PREGUNTA")
	private String pregunta;

	@Column(name="S_RESPUESTA")
	private String respuesta;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="N_ID_USUARIO_FK")
	private Usuario usuario;

	public PreguntaSeguridad() {
	}

	public Integer getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
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

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}