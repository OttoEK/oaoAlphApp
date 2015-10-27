package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the AUDITORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Auditoria.findAll", query="SELECT a FROM Auditoria a")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AUDITORIA_IDAUDITORIA_GENERATOR", sequenceName="AUDITORIA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUDITORIA_IDAUDITORIA_GENERATOR")
	@Column(name="N_ID_AUDITORIA")
	private Integer idAuditoria;

	@Column(name="B_SESION_EXPIRADA")
	private Integer sesionExpirada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_ACCION")
	private Date fechaAccion;

	//bi-directional many-to-one association to MensajeSistema
	@ManyToOne
	@JoinColumn(name="N_ID_MENSAJE_SISTEMA_FK")
	private MensajeSistema mensajeSistema;

	//bi-directional many-to-one association to Permiso
	@ManyToOne
	@JoinColumn(name="N_ID_PERMISO_FK")
	private Permiso permiso;

	public Auditoria() {
	}

	public Integer getIdAuditoria() {
		return this.idAuditoria;
	}

	public void setIdAuditoria(Integer idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	public Integer getSesionExpirada() {
		return this.sesionExpirada;
	}

	public void setSesionExpirada(Integer sesionExpirada) {
		this.sesionExpirada = sesionExpirada;
	}

	public Date getFechaAccion() {
		return this.fechaAccion;
	}

	public void setFechaAccion(Date fechaAccion) {
		this.fechaAccion = fechaAccion;
	}

	public MensajeSistema getMensajeSistema() {
		return this.mensajeSistema;
	}

	public void setMensajeSistema(MensajeSistema mensajeSistema) {
		this.mensajeSistema = mensajeSistema;
	}

	public Permiso getPermiso() {
		return this.permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

}