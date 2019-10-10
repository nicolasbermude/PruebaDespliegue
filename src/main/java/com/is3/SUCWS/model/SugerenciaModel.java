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
@Table(name = "sugerencia")
public class SugerenciaModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsugerencia")
    private Long id;
	
	@Column(name = "descripcion_s")
    private String descripcion;
	
	@Column(name = "tema")
    private String tema; 
	
	@ManyToOne
    @JoinColumn(name = "pedidosidpedido", referencedColumnName = "idpedido")
    private PedidoModel pedido;

	public SugerenciaModel() {
		
	}

	public SugerenciaModel(Long id, String descripcion, String tema, PedidoModel pedido) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tema = tema;
		this.pedido = pedido;
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

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}
	

}
