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

	public long getNIdModulo() {
		return this.nIdModulo;
	}

	public void setNIdModulo(long nIdModulo) {
		this.nIdModulo = nIdModulo;
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

	public String getSNombreModulo() {
		return this.sNombreModulo;
	}

	public void setSNombreModulo(String sNombreModulo) {
		this.sNombreModulo = sNombreModulo;
	}

	public String getSTile() {
		return this.sTile;
	}

	public void setSTile(String sTile) {
		this.sTile = sTile;
	}

	public String getSTituloVentana() {
		return this.sTituloVentana;
	}

	public void setSTituloVentana(String sTituloVentana) {
		this.sTituloVentana = sTituloVentana;
	}

	public String getSVersionModulo() {
		return this.sVersionModulo;
	}

	public void setSVersionModulo(String sVersionModulo) {
		this.sVersionModulo = sVersionModulo;
	}

	public Aplicacion getAplicacion() {
		return this.aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public Opcion addOpcion(Opcion opcion) {
		getOpcions().add(opcion);
		opcion.setModulo(this);

		return opcion;
	}

	public Opcion removeOpcion(Opcion opcion) {
		getOpcions().remove(opcion);
		opcion.setModulo(null);

		return opcion;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setModulo(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setModulo(null);

		return permiso;
	}

}