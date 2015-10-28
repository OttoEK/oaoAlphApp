package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_PREGUNTA")
	private long nIdPregunta;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="S_PREGUNTA")
	private String sPregunta;

	@Column(name="S_RESPUESTA")
	private String sRespuesta;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_USUARIO_FK")
	private Usuario usuario;

	public PreguntaSeguridad() {
	}

	public long getNIdPregunta() {
		return this.nIdPregunta;
	}

	public void setNIdPregunta(long nIdPregunta) {
		this.nIdPregunta = nIdPregunta;
	}

	public BigDecimal getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getSPregunta() {
		return this.sPregunta;
	}

	public void setSPregunta(String sPregunta) {
		this.sPregunta = sPregunta;
	}

	public String getSRespuesta() {
		return this.sRespuesta;
	}

	public void setSRespuesta(String sRespuesta) {
		this.sRespuesta = sRespuesta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}