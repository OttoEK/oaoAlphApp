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

	public long getNIdPermiso() {
		return this.nIdPermiso;
	}

	public void setNIdPermiso(long nIdPermiso) {
		this.nIdPermiso = nIdPermiso;
	}

	public BigDecimal getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getBEscritura() {
		return this.bEscritura;
	}

	public void setBEscritura(BigDecimal bEscritura) {
		this.bEscritura = bEscritura;
	}

	public BigDecimal getBLectura() {
		return this.bLectura;
	}

	public void setBLectura(BigDecimal bLectura) {
		this.bLectura = bLectura;
	}

	public Date getDDesde() {
		return this.dDesde;
	}

	public void setDDesde(Date dDesde) {
		this.dDesde = dDesde;
	}

	public Date getDHasta() {
		return this.dHasta;
	}

	public void setDHasta(Date dHasta) {
		this.dHasta = dHasta;
	}

	public List<Auditoria> getAuditorias() {
		return this.auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	public Auditoria addAuditoria(Auditoria auditoria) {
		getAuditorias().add(auditoria);
		auditoria.setPermiso(this);

		return auditoria;
	}

	public Auditoria removeAuditoria(Auditoria auditoria) {
		getAuditorias().remove(auditoria);
		auditoria.setPermiso(null);

		return auditoria;
	}

	public Aplicacion getAplicacion() {
		return this.aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public Modulo getModulo() {
		return this.modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}