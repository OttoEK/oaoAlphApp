package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the COMPONENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Componente.findAll", query="SELECT c FROM Componente c")
public class Componente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_COMPONENTE")
	private long nIdComponente;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="N_ID_MENSAJE_SISTEMA_FK")
	private BigDecimal nIdMensajeSistemaFk;

	@Column(name="S_NOMBRE_OPCION")
	private String sNombreOpcion;

	@Column(name="S_TILE")
	private String sTile;

	@Column(name="S_VERSION_OPCION")
	private String sVersionOpcion;

	//bi-directional many-to-one association to Opcion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="N_ID_OPCION_FK")
	private Opcion opcion;

	//bi-directional many-to-one association to MensajeSistema
	@OneToMany(mappedBy="componente")
	private List<MensajeSistema> mensajeSistemas;

	public Componente() {
	}

	public long getnIdComponente() {
		return nIdComponente;
	}

	public void setnIdComponente(long nIdComponente) {
		this.nIdComponente = nIdComponente;
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

	public BigDecimal getnIdMensajeSistemaFk() {
		return nIdMensajeSistemaFk;
	}

	public void setnIdMensajeSistemaFk(BigDecimal nIdMensajeSistemaFk) {
		this.nIdMensajeSistemaFk = nIdMensajeSistemaFk;
	}

	public String getsNombreOpcion() {
		return sNombreOpcion;
	}

	public void setsNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
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

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public List<MensajeSistema> getMensajeSistemas() {
		return mensajeSistemas;
	}

	public void setMensajeSistemas(List<MensajeSistema> mensajeSistemas) {
		this.mensajeSistemas = mensajeSistemas;
	}


}