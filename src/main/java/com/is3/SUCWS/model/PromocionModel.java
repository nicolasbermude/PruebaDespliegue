package com.is3.SUCWS.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "promocion")

public class PromocionModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpromo")
    private Long id;
	
	@Column(name = "descripcion_promo")
    private String descripcion;
	
	@Column(name = "dia_promo")
    private Date dia;
	
	@Column(name = "precio_promo")
    private Long precio;
	
	@ManyToOne
    @JoinColumn(name = "productosidproducto", referencedColumnName = "idproducto")
	private ProductosModel producto;

	public PromocionModel() {
		
	}

	public PromocionModel(Long id, String descripcion, Date dia, Long precio, ProductosModel producto) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.dia = dia;
		this.precio = precio;
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public ProductosModel getProducto() {
		return producto;
	}

	public void setProducto(ProductosModel producto) {
		this.producto = producto;
	}

	
}
