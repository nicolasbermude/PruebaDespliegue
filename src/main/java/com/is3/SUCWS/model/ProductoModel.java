package com.is3.SUCWS.model;

import com.is3.SUCWS.entity.Producto;

public class ProductoModel {

	
	
	
	
	public ProductoModel(int idproducto, String nombre_p, String imagen,  int cantidad_p, String descripcion_p, String precio,
			String tipo, String disponibilidad) {
		super();
		this.idproducto = idproducto;
		this.nombre_p = nombre_p;
		this.imagen = imagen;
		this.cantidad_p = cantidad_p;
		this.descripcion_p = descripcion_p;
		this.precio = precio;
		this.tipo = tipo;
		this.disponibilidad = disponibilidad;
	}


	public ProductoModel(Producto producto) {
	this.idproducto = producto.getIdproducto();
	this.nombre_p = producto.getNombre_p();
	this.imagen = producto.getImagen();
	this.cantidad_p = producto.getCantidad_p();
	this.descripcion_p = producto.getDescripcion_p();
	this.precio = producto.getPrecio();
	this.tipo = producto.getTipo();
	this.disponibilidad = producto.getDisponibilidad();
	
	}
	
	private int idproducto;
	private String nombre_p;
	private String imagen;
	private int cantidad_p;
	private String descripcion_p;
	private String precio;
	private String tipo;
	private String disponibilidad;
	public int getIdproducto() {
		return idproducto;
	}


	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}


	public String getNombre_p() {
		return nombre_p;
	}


	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public int getCantidad_p() {
		return cantidad_p;
	}


	public void setCantidad_p(int cantidad_p) {
		this.cantidad_p = cantidad_p;
	}


	public String getDescripcion_p() {
		return descripcion_p;
	}


	public void setDescripcion_p(String descripcion_p) {
		this.descripcion_p = descripcion_p;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	}	