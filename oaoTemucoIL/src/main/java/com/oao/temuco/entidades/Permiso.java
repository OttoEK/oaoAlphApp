package com.oao.temuco.entidades;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The Class Permiso.
 * 
 * @author everis
 */
@Entity
@Table(name = "PERMISO")
public class Permiso {

	/** The id permiso. */
	@Id
	@Column(name = "N_ID_PERMISO")
	private int idPermiso;

	/** The id usuario. */
	@Column(name = "N_ID_USUARIO_FK")
	@JoinColumn(name = "N_ID_USUARIO")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idUsuario;

	/** The id aplicacion. */
	@Column(name = "N_ID_APLICACION_FK")
	@JoinColumn(name = "N_ID_APLICACION")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idAplicacion;

	/** The id modulo. */
	@Column(name = "N_ID_MODULO_FK")
	@JoinColumn(name = "N_ID_MODULO")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idModulo;

	/** The id opcion. */
	@Column(name = "N_ID_OPCION_FK")
	@JoinColumn(name = "N_ID_OPCION")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private int idOpcion;

	/** The desde. */
	@Column(name = "D_DESDE")
	private Date desde;

	/** The hasta. */
	@Column(name = "D_HASTA")
	private Date hasta;

	/** The lectura. */
	@Column(name = "B_LECTURA")
	private Boolean lectura;

	/** The escritura. */
	@Column(name = "B_ESCRITURA")
	private Boolean escritura;

	/** The activo. */
	@Column(name = "B_ACTIVO")
	private Boolean activo;

	/**
	 * Instantiates a new permiso.
	 */
	public Permiso() {
		super();
	}

	/**
	 * Instantiates a new permiso.
	 * 
	 * @param idPermiso
	 *            the id permiso
	 * @param idUsuario
	 *            the id usuario
	 * @param idAplicacion
	 *            the id aplicacion
	 * @param idModulo
	 *            the id modulo
	 * @param idOpcion
	 *            the id opcion
	 * @param desde
	 *            the desde
	 * @param hasta
	 *            the hasta
	 * @param lectura
	 *            the lectura
	 * @param escritura
	 *            the escritura
	 * @param activo
	 *            the activo
	 */
	public Permiso(int idPermiso, int idUsuario, int idAplicacion, int idModulo, int idOpcion, Date desde, Date hasta, Boolean lectura, Boolean escritura, Boolean activo) {
		super();
		this.idPermiso = idPermiso;
		this.idUsuario = idUsuario;
		this.idAplicacion = idAplicacion;
		this.idModulo = idModulo;
		this.idOpcion = idOpcion;
		this.desde = desde;
		this.hasta = hasta;
		this.lectura = lectura;
		this.escritura = escritura;
		this.activo = activo;
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
	 * Gets the id usuario.
	 * 
	 * @return the idUsuario
	 */
	public final int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Sets the id usuario.
	 * 
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public final void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Gets the id aplicacion.
	 * 
	 * @return the idAplicacion
	 */
	public final int getIdAplicacion() {
		return idAplicacion;
	}

	/**
	 * Sets the id aplicacion.
	 * 
	 * @param idAplicacion
	 *            the idAplicacion to set
	 */
	public final void setIdAplicacion(int idAplicacion) {
		this.idAplicacion = idAplicacion;
	}

	/**
	 * Gets the id modulo.
	 * 
	 * @return the idModulo
	 */
	public final int getIdModulo() {
		return idModulo;
	}

	/**
	 * Sets the id modulo.
	 * 
	 * @param idModulo
	 *            the idModulo to set
	 */
	public final void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	/**
	 * Gets the id opcion.
	 * 
	 * @return the idOpcion
	 */
	public final int getIdOpcion() {
		return idOpcion;
	}

	/**
	 * Sets the id opcion.
	 * 
	 * @param idOpcion
	 *            the idOpcion to set
	 */
	public final void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}

	/**
	 * Gets the desde.
	 * 
	 * @return the desde
	 */
	public final Date getDesde() {
		return desde;
	}

	/**
	 * Sets the desde.
	 * 
	 * @param desde
	 *            the desde to set
	 */
	public final void setDesde(Date desde) {
		this.desde = desde;
	}

	/**
	 * Gets the hasta.
	 * 
	 * @return the hasta
	 */
	public final Date getHasta() {
		return hasta;
	}

	/**
	 * Sets the hasta.
	 * 
	 * @param hasta
	 *            the hasta to set
	 */
	public final void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	/**
	 * Gets the lectura.
	 * 
	 * @return the lectura
	 */
	public final Boolean getLectura() {
		return lectura;
	}

	/**
	 * Sets the lectura.
	 * 
	 * @param lectura
	 *            the lectura to set
	 */
	public final void setLectura(Boolean lectura) {
		this.lectura = lectura;
	}

	/**
	 * Gets the escritura.
	 * 
	 * @return the escritura
	 */
	public final Boolean getEscritura() {
		return escritura;
	}

	/**
	 * Sets the escritura.
	 * 
	 * @param escritura
	 *            the escritura to set
	 */
	public final void setEscritura(Boolean escritura) {
		this.escritura = escritura;
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
