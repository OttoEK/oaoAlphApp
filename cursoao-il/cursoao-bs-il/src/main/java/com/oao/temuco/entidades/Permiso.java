package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

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
	@SequenceGenerator(name="PERMISO_IDPERMISO_GENERATOR", sequenceName="PERMISO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERMISO_IDPERMISO_GENERATOR")
	@Column(name="N_ID_PERMISO")
	private Integer idPermiso;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Column(name="B_ESCRITURA")
	private Integer escritura;

	@Column(name="B_LECTURA")
	private Integer lectura;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_DESDE")
	private Date desde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_HASTA")
	private Date hasta;

	//bi-directional many-to-one association to Auditoria
	@OneToMany(mappedBy="permiso")
	private List<Auditoria> auditorias;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne
	@JoinColumn(name="N_ID_APLICACION_FK")
	private Aplicacion aplicacion;

	//bi-directional many-to-one association to Modulo
	@ManyToOne
	@JoinColumn(name="N_ID_MODULO_FK")
	private Modulo modulo;

	//bi-directional many-to-one association to Opcion
	@ManyToOne
	@JoinColumn(name="N_ID_OPCION_FK")
	private Opcion opcion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="N_ID_USUARIO_FK")
	private Usuario usuario;

	public Permiso() {
	}

	public Integer getIdPermiso() {
		return this.idPermiso;
	}

	public void setIdPermiso(Integer idPermiso) {
		this.idPermiso = idPermiso;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getEscritura() {
		return this.escritura;
	}

	public void setEscritura(Integer escritura) {
		this.escritura = escritura;
	}

	public Integer getLectura() {
		return this.lectura;
	}

	public void setLectura(Integer lectura) {
		this.lectura = lectura;
	}

	public Date getDesde() {
		return this.desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return this.hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
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