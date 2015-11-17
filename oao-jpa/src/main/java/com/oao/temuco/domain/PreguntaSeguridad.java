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

	public long getnIdPregunta() {
		return nIdPregunta;
	}

	public void setnIdPregunta(long nIdPregunta) {
		this.nIdPregunta = nIdPregunta;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getsPregunta() {
		return sPregunta;
	}

	public void setsPregunta(String sPregunta) {
		this.sPregunta = sPregunta;
	}

	public String getsRespuesta() {
		return sRespuesta;
	}

	public void setsRespuesta(String sRespuesta) {
		this.sRespuesta = sRespuesta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



}