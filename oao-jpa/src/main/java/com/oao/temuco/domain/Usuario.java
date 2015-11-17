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

	public long getnIdUsuario() {
		return nIdUsuario;
	}

	public void setnIdUsuario(long nIdUsuario) {
		this.nIdUsuario = nIdUsuario;
	}

	public BigDecimal getbActivo() {
		return bActivo;
	}

	public void setbActivo(BigDecimal bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getbBloqueado() {
		return bBloqueado;
	}

	public void setbBloqueado(BigDecimal bBloqueado) {
		this.bBloqueado = bBloqueado;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public BigDecimal getnIntentos() {
		return nIntentos;
	}

	public void setnIntentos(BigDecimal nIntentos) {
		this.nIntentos = nIntentos;
	}

	public String getsContrasenia() {
		return sContrasenia;
	}

	public void setsContrasenia(String sContrasenia) {
		this.sContrasenia = sContrasenia;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsNombreUsuario() {
		return sNombreUsuario;
	}

	public void setsNombreUsuario(String sNombreUsuario) {
		this.sNombreUsuario = sNombreUsuario;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public List<PreguntaSeguridad> getPreguntaSeguridads() {
		return preguntaSeguridads;
	}

	public void setPreguntaSeguridads(List<PreguntaSeguridad> preguntaSeguridads) {
		this.preguntaSeguridads = preguntaSeguridads;
	}



}