package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MODULO database table.
 * 
 */
@Entity
@NamedQuery(name="Modulo.findAll", query="SELECT m FROM Modulo m")
public class Modulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_MODULO")
	private long nIdModulo;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="S_NOMBRE_MODULO")
	private String sNombreModulo;

	@Column(name="S_TILE")
	private String sTile;

	@Column(name="S_TITULO_VENTANA")
	private String sTituloVentana;

	@Column(name="S_VERSION_MODULO")
	private String sVersionModulo;

	//bi-directional many-to-one association to Aplicacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_APLICACION_FK")
	private Aplicacion aplicacion;

	//bi-directional many-to-one association to Opcion
	@OneToMany(mappedBy="modulo")
	private List<Opcion> opcions;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="modulo")
	private List<Permiso> permisos;

	public Modulo() {
	}

	public long getnIdModulo() {
		return nIdModulo;
	}

	public void setnIdModulo(long nIdModulo) {
		this.nIdModulo = nIdModulo;
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

	public String getsNombreModulo() {
		return sNombreModulo;
	}

	public void setsNombreModulo(String sNombreModulo) {
		this.sNombreModulo = sNombreModulo;
	}

	public String getsTile() {
		return sTile;
	}

	public void setsTile(String sTile) {
		this.sTile = sTile;
	}

	public String getsTituloVentana() {
		return sTituloVentana;
	}

	public void setsTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}

	public String getsVersionModulo() {
		return sVersionModulo;
	}

	public void setsVersionModulo(String sVersionModulo) {
		this.sVersionModulo = sVersionModulo;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public List<Opcion> getOpcions() {
		return opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	
}