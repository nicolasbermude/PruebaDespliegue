package com.is3.SUCWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class AdministradorModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idadmin")
    private Long id;
	
	@Column(name = "correo")
    private String correo;
	
	@Column(name = "estado")
    private boolean estado;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "password")
    private String password;
	
	@Column(name = "rol")
    private Long rol;
	
	@Column(name = "telefono")
    private Long telefono;
	
	@Column(name = "usuario")
    private String usuario;

	public AdministradorModel() {
		
	}

	public AdministradorModel(Long id, String correo, boolean estado, String nombre, String password, Long rol,
			Long telefono, String usuario) {
		super();
		this.id = id;
		this.correo = correo;
		this.estado = estado;
		this.nombre = nombre;
		this.password = password;
		this.rol = rol;
		this.telefono = telefono;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRol() {
		return rol;
	}

	public void setRol(Long rol) {
		this.rol = rol;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
}