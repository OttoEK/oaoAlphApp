package com.oao.temuco.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="N_ID_USUARIO")
	private long nIdUsuario;

	@Column(name="B_ACTIVO")
	private BigDecimal bActivo;

	@Column(name="B_BLOQUEADO")
	private BigDecimal bBloqueado;

	@Temporal(TemporalType.DATE)
	@Column(name="D_FECHA_CREACION")
	private Date dFechaCreacion;

	@Column(name="N_INTENTOS")
	private BigDecimal nIntentos;

	@Column(name="S_CONTRASENIA")
	private String sContrasenia;

	@Column(name="S_EMAIL")
	private String sEmail;

	@Column(name="S_NOMBRE_USUARIO")
	private String sNombreUsuario;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="usuario")
	private List<Permiso> permisos;

	//bi-directional many-to-one association to PreguntaSeguridad
	@OneToMany(mappedBy="usuario")
	private List<PreguntaSeguridad> preguntaSeguridads;

	public Usuario() {
	}

	public long getNIdUsuario() {
		return this.nIdUsuario;
	}

	public void setNIdUsuario(long nIdUsuario) {
		this.nIdUsuario = nIdUsuario;
	}

	public BigDecimal getBActivo() {
		return this.bActivo;
	}

	public void setBActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getBBloqueado() {
		return this.bBloqueado;
	}

	public void setBBloqueado(BigDecimal bBloqueado) {
		this.bBloqueado = bBloqueado;
	}

	public Date getDFechaCreacion() {
		return this.dFechaCreacion;
	}

	public void setDFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public BigDecimal getNIntentos() {
		return this.nIntentos;
	}

	public void setNIntentos(BigDecimal nIntentos) {
		this.nIntentos = nIntentos;
	}

	public String getSContrasenia() {
		return this.sContrasenia;
	}

	public void setSContrasenia(String sContrasenia) {
		this.sContrasenia = sContrasenia;
	}

	public String getSEmail() {
		return this.sEmail;
	}

	public void setSEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getSNombreUsuario() {
		return this.sNombreUsuario;
	}

	public void setSNombreUsuario(String sNombreUsuario) {
		this.sNombreUsuario = sNombreUsuario;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setUsuario(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setUsuario(null);

		return permiso;
	}

	public List<PreguntaSeguridad> getPreguntaSeguridads() {
		return this.preguntaSeguridads;
	}

	public void setPreguntaSeguridads(List<PreguntaSeguridad> preguntaSeguridads) {
		this.preguntaSeguridads = preguntaSeguridads;
	}

	public PreguntaSeguridad addPreguntaSeguridad(PreguntaSeguridad preguntaSeguridad) {
		getPreguntaSeguridads().add(preguntaSeguridad);
		preguntaSeguridad.setUsuario(this);

		return preguntaSeguridad;
	}

	public PreguntaSeguridad removePreguntaSeguridad(PreguntaSeguridad preguntaSeguridad) {
		getPreguntaSeguridads().remove(preguntaSeguridad);
		preguntaSeguridad.setUsuario(null);

		return preguntaSeguridad;
	}

}