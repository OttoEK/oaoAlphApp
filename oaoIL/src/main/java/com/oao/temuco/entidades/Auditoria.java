package com.oao.temuco.entidades;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class Auditoria.
 * 
 * @author everis
 */
@Entity
@Table(name = "AUDITORIA")
public class Auditoria {
	
	

//	@JoinColumn(name = "N_ID_COMPONENTE")
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	/** The id opcion. */
	@Id
	@Column(name = "N_ID_AUDITORIA")
	private int idAuditoria;

	/** The id opcion. */
	@Column(name = "N_ID_PERMISO_FK")
	@JoinColumn(name = "N_ID_PERMISO")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idPermiso;

	/** The id opcion. */
	@Column(name = "N_ID_MENSAJE_SISTEMA_FK")
	@JoinColumn(name = "N_ID_MENSAJE_SISTEMA")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idMensajeSistema;

	/** The id opcion. */
	@Column(name = "D_FECHA_ACCION")
	private Date fechaAccion;

	/** The id opcion. */
	@Column(name = "B_SESION_EXPIRADA")
	private Boolean sesionExpirada;

	/**
	 * Instantiates a new auditoria.
	 */
	public Auditoria() {
		super();
	}

	/**
	 * Instantiates a new auditoria.
	 * 
	 * @param idAuditoria
	 *            the id auditoria
	 * @param idPermiso
	 *            the id permiso
	 * @param idMensajeSistema
	 *            the id mensaje sistema
	 * @param fechaAccion
	 *            the fecha accion
	 * @param sesionExpirada
	 *            the sesion expirada
	 */
	public Auditoria(int idAuditoria, int idPermiso, int idMensajeSistema, Date fechaAccion, Boolean sesionExpirada) {
		super();
		this.idAuditoria = idAuditoria;
		this.idPermiso = idPermiso;
		this.idMensajeSistema = idMensajeSistema;
		this.fechaAccion = fechaAccion;
		this.sesionExpirada = sesionExpirada;
	}

	/**
	 * Gets the id auditoria.
	 * 
	 * @return the idAuditoria
	 */
	public final int getIdAuditoria() {
		return idAuditoria;
	}

	/**
	 * Sets the id auditoria.
	 * 
	 * @param idAuditoria
	 *            the idAuditoria to set
	 */
	public final void setIdAuditoria(int idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	/**
	 * Gets the id permiso.
	 * 
	 * @return the idPermiso
	 */
	public final int getIdPermiso() {
		return idPermiso;
	}

	/**
	 * Sets the id permiso.
	 * 
	 * @param idPermiso
	 *            the idPermiso to set
	 */
	public final void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
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
	 * Gets the fecha accion.
	 * 
	 * @return the fechaAccion
	 */
	public final Date getFechaAccion() {
		return fechaAccion;
	}

	/**
	 * Sets the fecha accion.
	 * 
	 * @param fechaAccion
	 *            the fechaAccion to set
	 */
	public final void setFechaAccion(Date fechaAccion) {
		this.fechaAccion = fechaAccion;
	}

	/**
	 * Gets the sesion expirada.
	 * 
	 * @return the sesionExpirada
	 */
	public final Boolean getSesionExpirada() {
		return sesionExpirada;
	}

	/**
	 * Sets the sesion expirada.
	 * 
	 * @param sesionExpirada
	 *            the sesionExpirada to set
	 */
	public final void setSesionExpirada(Boolean sesionExpirada) {
		this.sesionExpirada = sesionExpirada;
	}

}
