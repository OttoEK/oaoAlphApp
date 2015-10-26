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

	public long getNIdComponente() {
		return this.nIdComponente;
	}

	public void setNIdComponente(long nIdComponente) {
		this.nIdComponente = nIdComponente;
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

	public BigDecimal getNIdMensajeSistemaFk() {
		return this.nIdMensajeSistemaFk;
	}

	public void setNIdMensajeSistemaFk(BigDecimal nIdMensajeSistemaFk) {
		this.nIdMensajeSistemaFk = nIdMensajeSistemaFk;
	}

	public String getSNombreOpcion() {
		return this.sNombreOpcion;
	}

	public void setSNombreOpcion(String sNombreOpcion) {
		this.sNombreOpcion = sNombreOpcion;
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

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public List<MensajeSistema> getMensajeSistemas() {
		return this.mensajeSistemas;
	}

	public void setMensajeSistemas(List<MensajeSistema> mensajeSistemas) {
		this.mensajeSistemas = mensajeSistemas;
	}

	public MensajeSistema addMensajeSistema(MensajeSistema mensajeSistema) {
		getMensajeSistemas().add(mensajeSistema);
		mensajeSistema.setComponente(this);

		return mensajeSistema;
	}

	public MensajeSistema removeMensajeSistema(MensajeSistema mensajeSistema) {
		getMensajeSistemas().remove(mensajeSistema);
		mensajeSistema.setComponente(null);

		return mensajeSistema;
	}

}