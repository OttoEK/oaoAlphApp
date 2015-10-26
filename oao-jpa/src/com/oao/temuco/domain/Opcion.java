package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPCION database table.
 * 
 */
@Entity
@NamedQuery(name="Opcion.findAll", query="SELECT o FROM Opcion o")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_OPCION")
	private long nIdOpcion;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="S_NOMBRE_OPCION")
	private String sNombreOpcion;

	@Column(name="S_TEXTO_OPCION")
	private String sTextoOpcion;

	@Column(name="S_TILE")
	private String sTile;

	@Column(name="S_VERSION_OPCION")
	private String sVersionOpcion;

	//bi-directional many-to-one association to Componente
	@OneToMany(mappedBy="opcion")
	private List<Componente> componentes;

	//bi-directional many-to-one association to Modulo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_MODULO_FK")
	private Modulo modulo;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="opcion")
	private List<Permiso> permisos;

	public Opcion() {
	}

	public long getNIdOpcion() {
		return this.nIdOpcion;
	}

	public void setNIdOpcion(long nIdOpcion) {
		this.nIdOpcion = nIdOpcion;
	}

	public BigDecimal getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getSNombreOpcion() {
		return this.sNombreOpcion;
	}

	public void setSNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
	}

	public String getSTextoOpcion() {
		return this.sTextoOpcion;
	}

	public void setSTextoOpcion(String sTextoOpcion) {
		this.sTextoOpcion = sTextoOpcion;
	}

	public String getSTile() {
		return this.sTile;
	}

	public void setSTile(String sTile) {
		this.sTile = sTile;
	}

	public String getSVersionOpcion() {
		return this.sVersionOpcion;
	}

	public void setSVersionOpcion(String sVersionOpcion) {
		this.sVersionOpcion = sVersionOpcion;
	}

	public List<Componente> getComponentes() {
		return this.componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	public Componente addComponente(Componente componente) {
		getComponentes().add(componente);
		componente.setOpcion(this);

		return componente;
	}

	public Componente removeComponente(Componente componente) {
		getComponentes().remove(componente);
		componente.setOpcion(null);

		return componente;
	}

	public Modulo getModulo() {
		return this.modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setOpcion(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setOpcion(null);

		return permiso;
	}

}