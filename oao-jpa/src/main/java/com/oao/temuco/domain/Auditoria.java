package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_AUDITORIA")
	private long nIdAuditoria;

	@Column(name="B_SESION_EXPIRADA")
	private BigDecimal bSesionExpirada;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_ACCION")
	private Date dFechaAccion;

	//bi-directional many-to-one association to MensajeSistema
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_MENSAJE_SISTEMA_FK")
	private MensajeSistema mensajeSistema;

	//bi-directional many-to-one association to Permiso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_PERMISO_FK")
	private Permiso permiso;

	public Auditoria() {
	}

	public long getnIdAuditoria() {
		return nIdAuditoria;
	}

	public void setnIdAuditoria(long nIdAuditoria) {
		this.nIdAuditoria = nIdAuditoria;
	}

	public BigDecimal getbSesionExpirada() {
		return bSesionExpirada;
	}

	public void setbSesionExpirada(BigDecimal bSesionExpirada) {
		this.bSesionExpirada = bSesionExpirada;
	}

	public Date getdFechaAccion() {
		return dFechaAccion;
	}

	public void setdFechaAccion(Date dFechaAccion) {
		this.dFechaAccion = dFechaAccion;
	}

	public MensajeSistema getMensajeSistema() {
		return mensajeSistema;
	}

	public void setMensajeSistema(MensajeSistema mensajeSistema) {
		this.mensajeSistema = mensajeSistema;
	}

	public Permiso getPermiso() {
		return permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

}