package com.is3.SUCWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cafeteria")
public class CafeteriaModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcafeteria")
    private Long id;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "ubicacion")
    private String ubicacion;
	
	@ManyToOne
    @JoinColumn(name = "idcafateriaadministrador", referencedColumnName = "idadmin")
    private AdministradorModel admin;

	public CafeteriaModel() {
		
	}

	public CafeteriaModel(Long id, String nombre, String ubicacion, AdministradorModel admin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.admin = admin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public AdministradorModel getAdmin() {
		return admin;
	}

	public void setAdmin(AdministradorModel admin) {
		this.admin = admin;
	}
	

}
