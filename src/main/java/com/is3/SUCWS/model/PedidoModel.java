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
@Table(name = "pedidos")
public class PedidoModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpedido")
    private Long id;
	
	@Column(name = "numero_orden")
    private Long numero;
	
	@Column(name = "descripcion_orden")
    private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "cafeteriaidcafeteria", referencedColumnName = "idcafeteria")
    private CafeteriaModel cafeteria;

	@ManyToOne
    @JoinColumn(name = "detalle_pedidoiddetalle", referencedColumnName = "iddetalle")
    private Detalle_pedidoModel detalle;

	public PedidoModel() {
		
	}

	public PedidoModel(Long id, Long numero, String descripcion, CafeteriaModel cafeteria,
			Detalle_pedidoModel detalle) {
		super();
		this.id = id;
		this.numero = numero;
		this.descripcion = descripcion;
		this.cafeteria = cafeteria;
		this.detalle = detalle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CafeteriaModel getCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(CafeteriaModel cafeteria) {
		this.cafeteria = cafeteria;
	}

	public Detalle_pedidoModel getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle_pedidoModel detalle) {
		this.detalle = detalle;
	}

	
}
