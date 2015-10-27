package com.oao.temuco.entidades;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
//@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUARIO_IDUSUARIO_GENERATOR", sequenceName="USUARIO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_IDUSUARIO_GENERATOR")
	@Column(name="N_ID_USUARIO")
	private Integer idUsuario;

	@Column(name="B_ACTIVO")
	private Integer activo;

	@Column(name="B_BLOQUEADO")
	private Integer bloqueado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="D_FECHA_CREACION")
	private Date fechaCreacion;

	@Column(name="N_INTENTOS")
	private Integer intentos;

	@Column(name="S_CONTRASENIA")
	private String contrasenia;

	@Column(name="S_EMAIL")
	private String email;

	@Column(name="S_NOMBRE_USUARIO")
	private String nombreUsuario;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="usuario")
	private List<Permiso> permisos;

	//bi-directional many-to-one association to PreguntaSeguridad
	@OneToMany(mappedBy="usuario")
	private List<PreguntaSeguridad> preguntaSeguridads;

	public Usuario() {
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getActivo() {
		return this.activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getBloqueado() {
		return this.bloqueado;
	}

	public void setBloqueado(Integer bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIntentos() {
		return this.intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
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