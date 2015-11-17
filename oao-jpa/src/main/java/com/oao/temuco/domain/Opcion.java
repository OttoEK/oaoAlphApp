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

	public long getnIdOpcion() {
		return nIdOpcion;
	}

	public void setnIdOpcion(long nIdOpcion) {
		this.nIdOpcion = nIdOpcion;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public String getsNombreOpcion() {
		return sNombreOpcion;
	}

	public void setsNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
	}

	public String getsTextoOpcion() {
		return sTextoOpcion;
	}

	public void setsTextoOpcion(String sTextoOpcion) {
		this.sTextoOpcion = sTextoOpcion;
	}

	public String getsTile() {
		return sTile;
	}

	public void setsTile(String sTile) {
		this.sTile = sTile;
	}

	public String getsVersionOpcion() {
		return sVersionOpcion;
	}

	public void setsVersionOpcion(String sVersionOpcion) {
		this.sVersionOpcion = sVersionOpcion;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}



}