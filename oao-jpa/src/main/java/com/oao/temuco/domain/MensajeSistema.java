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

	public long getnIdMensajeSistema() {
		return nIdMensajeSistema;
	}

	public void setnIdMensajeSistema(long nIdMensajeSistema) {
		this.nIdMensajeSistema = nIdMensajeSistema;
	}

	public String getbActivo() {
		return bActivo;
	}

	public void setbActivo(String bActivo) {
		this.bActivo = bActivo;
	}

	public String getbAdvertencia() {
		return bAdvertencia;
	}

	public void setbAdvertencia(String bAdvertencia) {
		this.bAdvertencia = bAdvertencia;
	}

	public String getbError() {
		return bError;
	}

	public void setbError(String bError) {
		this.bError = bError;
	}

	public String getbMensajeUsuario() {
		return bMensajeUsuario;
	}

	public void setbMensajeUsuario(String bMensajeUsuario) {
		this.bMensajeUsuario = bMensajeUsuario;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getsIdioma() {
		return sIdioma;
	}

	public void setsIdioma(String sIdioma) {
		this.sIdioma = sIdioma;
	}

	public String getsMensaje() {
		return sMensaje;
	}

	public void setsMensaje(String sMensaje) {
		this.sMensaje = sMensaje;
	}

	public List<Auditoria> getAuditorias() {
		return auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	
}