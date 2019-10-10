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
@Table(name = "almuerzos")
public class AlmuerzosModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idalmuerzo")
    private Long id;
	
	@Column(name = "cantidad_a")
    private Long cantidad_p;
	
	@Column(name = "descripcion_a")
    private String descripcion;
	
	@Column(name = "dia")
    private String dia;
	
	@Column(name = "disponibilidad")
    private String disponibilidad;
	
	@Column(name = "myphoto")
    private String myphoto;
	
	@Column(name = "precio")
    private Long precio;
	
	@ManyToOne
    @JoinColumn(name = "cafeteriaidcafeteria", referencedColumnName = "idcafeteria")
	private CafeteriaModel cafeteria;

	public AlmuerzosModel() {
		
	}

	public AlmuerzosModel(Long id, Long cantidad_p, String descripcion, String dia, String disponibilidad,
			String myphoto, Long precio, CafeteriaModel cafeteria) {
		super();
		this.id = id;
		this.cantidad_p = cantidad_p;
		this.descripcion = descripcion;
		this.dia = dia;
		this.disponibilidad = disponibilidad;
		this.myphoto = myphoto;
		this.precio = precio;
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public CafeteriaModel getCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(CafeteriaModel cafeteria) {
		this.cafeteria = cafeteria;
	}

	
	
}
