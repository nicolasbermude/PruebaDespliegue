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
@Table(name = "productos")
public class ProductosModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto")
    private Long id;
	
	@Column(name = "cantidad_p")
    private Long cantidad_p;
	
	@Column(name = "descripcion_p")
    private String descripcion;
	
	@Column(name = "disponibilidad")
    private String disponibilidad;
	
	@Column(name = "myphoto")
    private String myphoto;
	
	@Column(name = "nombre_p")
    private String nombre_p;
	
	@Column(name = "precio")
    private Long precio;
	
	@Column(name = "tipo")
    private String tipo;
	
	@ManyToOne
    @JoinColumn(name = "cafeteriaidcafeteria", referencedColumnName = "idcafeteria")
	private CafeteriaModel cafeteria;

	public ProductosModel() {
		
	}

	public ProductosModel(Long id, Long cantidad_p, String descripcion, String disponibilidad, String myphoto,
			String nombre_p, Long precio, String tipo, CafeteriaModel cafeteria) {
		super();
		this.id = id;
		this.cantidad_p = cantidad_p;
		this.descripcion = descripcion;
		this.disponibilidad = disponibilidad;
		this.myphoto = myphoto;
		this.nombre_p = nombre_p;
		this.precio = precio;
		this.tipo = tipo;
		this.cafeteria = cafeteria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCantidad_p() {
		return cantidad_p;
	}

	public void setCantidad_p(Long cantidad_p) {
		this.cantidad_p = cantidad_p;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getMyphoto() {
		return myphoto;
	}

	public void setMyphoto(String myphoto) {
		this.myphoto = myphoto;
	}

	public String getNombre_p() {
		return nombre_p;
	}

	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public CafeteriaModel getCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(CafeteriaModel cafeteria) {
		this.cafeteria = cafeteria;
	}

	
	

}
