package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MENSAJE_SISTEMA database table.
 * 
 */
@Entity
@Table(name="MENSAJE_SISTEMA")
@NamedQuery(name="MensajeSistema.findAll", query="SELECT m FROM MensajeSistema m")
public class MensajeSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MENSAJE_SISTEMA_IDMENSAJESISTEMA_GENERATOR", sequenceName="MENSAJE_SISTEMA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MENSAJE_SISTEMA_IDMENSAJESISTEMA_GENERATOR")
	@Column(name="N_ID_MENSAJE_SISTEMA")
	private Integer idMensajeSistema;

	@Column(name="B_ACTIVO")
	private String activo;

	@Column(name="B_ADVERTENCIA")
	private String advertencia;

	@Column(name="B_ERROR")
	private String error;

	@Column(name="B_MENSAJE_USUARIO")
	private String mensajeUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="N_ID_COMPONENTE_FK")
	private java.math.BigDecimal nIdComponenteFk;

	@Column(name="S_IDIOMA")
	private String idioma;

	@Column(name="S_MENSAJE")
	private String mensaje;

	//bi-directional many-to-one association to Auditoria
	@OneToMany(mappedBy="mensajeSistema")
	private List<Auditoria> auditorias;

	public MensajeSistema() {
	}

	public Integer getIdMensajeSistema() {
		return this.idMensajeSistema;
	}

	public void setIdMensajeSistema(Integer idMensajeSistema) {
		this.idMensajeSistema = idMensajeSistema;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getAdvertencia() {
		return this.advertencia;
	}

	public void setAdvertencia(String advertencia) {
		this.advertencia = advertencia;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMensajeUsuario() {
		return this.mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public java.math.BigDecimal getNIdComponenteFk() {
		return this.nIdComponenteFk;
	}

	public void setNIdComponenteFk(java.math.BigDecimal nIdComponenteFk) {
		this.nIdComponenteFk = nIdComponenteFk;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<Auditoria> getAuditorias() {
		return this.auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	public Auditoria addAuditoria(Auditoria auditoria) {
		getAuditorias().add(auditoria);
		auditoria.setMensajeSistema(this);

		return auditoria;
	}

	public Auditoria removeAuditoria(Auditoria auditoria) {
		getAuditorias().remove(auditoria);
		auditoria.setMensajeSistema(null);

		return auditoria;
	}

}