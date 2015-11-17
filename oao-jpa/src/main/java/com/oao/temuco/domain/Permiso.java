package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PERMISO database table.
 * 
 */
@Entity
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_PERMISO")
	private long nIdPermiso;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Column(name="B_ESCRITURA")
	private BigDecimal bEscritura;

	@Column(name="B_LECTURA")
	private BigDecimal bLectura;

	@Temporal(TemporalType.DATE)
	@Column(name="D_DESDE")
	private Date dDesde;

	@Temporal(TemporalType.DATE)
	@Column(name="D_HASTA")
	private Date dHasta;

	//bi-directional many-to-one association to Auditoria
	@OneToMany(mappedBy="permiso")
	private List<Auditoria> auditorias;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_APLICACION_FK")
	private Aplicacion aplicacion;

	//bi-directional many-to-one association to Modulo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_MODULO_FK")
	private Modulo modulo;

	//bi-directional many-to-one association to Opcion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_OPCION_FK")
	private Opcion opcion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_USUARIO_FK")
	private Usuario usuario;

	public Permiso() {
	}

	public long getnIdPermiso() {
		return nIdPermiso;
	}

	public void setnIdPermiso(long nIdPermiso) {
		this.nIdPermiso = nIdPermiso;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getbEscritura() {
		return bEscritura;
	}

	public void setbEscritura(BigDecimal bEscritura) {
		this.bEscritura = bEscritura;
	}

	public BigDecimal getbLectura() {
		return bLectura;
	}

	public void setbLectura(BigDecimal bLectura) {
		this.bLectura = bLectura;
	}

	public Date getdDesde() {
		return dDesde;
	}

	public void setdDesde(Date dDesde) {
		this.dDesde = dDesde;
	}

	public Date getdHasta() {
		return dHasta;
	}

	public void setdHasta(Date dHasta) {
		this.dHasta = dHasta;
	}

	public List<Auditoria> getAuditorias() {
		return auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



}