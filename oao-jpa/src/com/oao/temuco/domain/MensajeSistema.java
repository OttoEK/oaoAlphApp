package com.oao.temuco.domain;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_MENSAJE_SISTEMA")
	private long nIdMensajeSistema;

	@Column(name="B_ACTIVO")
	private String bActivo;

	@Column(name="B_ADVERTENCIA")
	private String bAdvertencia;

	@Column(name="B_ERROR")
	private String bError;

	@Column(name="B_MENSAJE_USUARIO")
	private String bMensajeUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="S_IDIOMA")
	private String sIdioma;

	@Column(name="S_MENSAJE")
	private String sMensaje;

	//bi-directional many-to-one association to Auditoria
	@OneToMany(mappedBy="mensajeSistema")
	private List<Auditoria> auditorias;

	//bi-directional many-to-one association to Componente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_COMPONENTE_FK")
	private Componente componente;

	public MensajeSistema() {
	}

	public long getNIdMensajeSistema() {
		return this.nIdMensajeSistema;
	}

	public void setNIdMensajeSistema(long nIdMensajeSistema) {
		this.nIdMensajeSistema = nIdMensajeSistema;
	}

	public String getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(String bActivo) {
		this.bActivo = bActivo;
	}

	public String getBAdvertencia() {
		return this.bAdvertencia;
	}

	public void setBAdvertencia(String bAdvertencia) {
		this.bAdvertencia = bAdvertencia;
	}

	public String getBError() {
		return this.bError;
	}

	public void setBError(String bError) {
		this.bError = bError;
	}

	public String getBMensajeUsuario() {
		return this.bMensajeUsuario;
	}

	public void setBMensajeUsuario(String bMensajeUsuario) {
		this.bMensajeUsuario = bMensajeUsuario;
	}

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getSIdioma() {
		return this.sIdioma;
	}

	public void setSIdioma(String sIdioma) {
		this.sIdioma = sIdioma;
	}

	public String getSMensaje() {
		return this.sMensaje;
	}

	public void setSMensaje(String sMensaje) {
		this.sMensaje = sMensaje;
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

	public Componente getComponente() {
		return this.componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

}