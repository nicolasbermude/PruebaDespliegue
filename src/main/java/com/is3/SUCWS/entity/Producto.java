package com.is3.SUCWS.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Productos")
public class Producto implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2749054440125892290L;

	public Producto(int idproducto, String nombre_p, String imagen,  int cantidad_p, String descripcion_p, String precio, String tipo, String disponibilidad,
			boolean estado) {
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

	public Producto() {}

	
	@Id
	@GeneratedValue
	@Column(name="idproducto", nullable=false)
	private int idproducto;
	
	@Column(name="nombre_p", nullable=false)
	private String nombre_p;
	
	@Column(name="imagen", nullable=false)
	private String imagen;
	
	@Column(name="cantidad_p", nullable=false)
	private int cantidad_p;

	@Column(name="descripcion_p", nullable=true)
	private String descripcion_p;
	
	@Column(name="precio", nullable=false)
	private String precio;
	
	@Column(name="tipo", nullable=false)
	private String tipo;
	
	@Column(name="disponibilidad", nullable=false)
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}