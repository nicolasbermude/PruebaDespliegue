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
@Table(name = "detalle_pedido")
public class Detalle_pedidoModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetalle")
    private Long id;
	
	@Column(name = "cantidad_a")
    private Long cantidad_a;
	
	@Column(name = "cantidad_p")
    private Long cantidad_p;
	
	@Column(name = "descripcion_a")
    private String descripcion_a;
	
	@Column(name = "descripcion_p")
    private String descripcion_p;
	
	@Column(name = "nombre_p")
    private String nombre_p;
	
	@Column(name = "precio")
    private Long precio;
	
	@ManyToOne
    @JoinColumn(name = "productosidproducto", referencedColumnName = "idproducto")
	private ProductosModel producto;
	
	@ManyToOne
    @JoinColumn(name = "almuerzosidalmuerzo", referencedColumnName = "idalmuerzo")
	private AlmuerzosModel almuerzo;

	public Detalle_pedidoModel() {
	
	}

	public Detalle_pedidoModel(Long id, Long cantidad_a, Long cantidad_p, String descripcion_a, String descripcion_p,
			String nombre_p, Long precio, ProductosModel producto, AlmuerzosModel almuerzo) {
		super();
		this.id = id;
		this.cantidad_a = cantidad_a;
		this.cantidad_p = cantidad_p;
		this.descripcion_a = descripcion_a;
		this.descripcion_p = descripcion_p;
		this.nombre_p = nombre_p;
		this.precio = precio;
		this.producto = producto;
		this.almuerzo = almuerzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCantidad_a() {
		return cantidad_a;
	}

	public void setCantidad_a(Long cantidad_a) {
		this.cantidad_a = cantidad_a;
	}

	public Long getCantidad_p() {
		return cantidad_p;
	}

	public void setCantidad_p(Long cantidad_p) {
		this.cantidad_p = cantidad_p;
	}

	public String getDescripcion_a() {
		return descripcion_a;
	}

	public void setDescripcion_a(String descripcion_a) {
		this.descripcion_a = descripcion_a;
	}

	public String getDescripcion_p() {
		return descripcion_p;
	}

	public void setDescripcion_p(String descripcion_p) {
		this.descripcion_p = descripcion_p;
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

	public ProductosModel getProducto() {
		return producto;
	}

	public void setProducto(ProductosModel producto) {
		this.producto = producto;
	}

	public AlmuerzosModel getAlmuerzo() {
		return almuerzo;
	}

	public void setAlmuerzo(AlmuerzosModel almuerzo) {
		this.almuerzo = almuerzo;
	}

	
	

}
