package com.is3.SUCWS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sugerencia")
public class Sugerencia {

	public Sugerencia (int idsugerencia, String tema, String descripcion_s) {
		
		super();
		this.idsugerencia = idsugerencia;
		this.tema=tema;
		this.descripcion_s=descripcion_s;
		
		
		}
	public Sugerencia () {}
	
	
	@Id
	@GeneratedValue
	@Column(name="idsugerencia", nullable=false)
	private int idsugerencia;
	

	@Column(name="tema", nullable=false)
	private String tema;
	
	@Column(name="descripcion_s", nullable=false)
	private String descripcion_s;

	public int getIdsugerencia() {
		return idsugerencia;
	}
	public void setIdsugerencia(int idsugerencia) {
		this.idsugerencia = idsugerencia;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDescripcion_s() {
		return descripcion_s;
	}
	public void setDescripcion_s(String descripcion_s) {
		this.descripcion_s = descripcion_s;
	}

	
	
	
	
}
