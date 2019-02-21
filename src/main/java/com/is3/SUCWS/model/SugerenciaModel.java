package com.is3.SUCWS.model;

import com.is3.SUCWS.entity.Sugerencia;

public class SugerenciaModel {

public SugerenciaModel(int idsugerencia,String tema, String descripcion_s) {
		
		super();
		
		this.idsugerencia = idsugerencia;
		this.tema=tema;
		this.descripcion_s=descripcion_s;
		
		
		}

public SugerenciaModel(Sugerencia sugerencia ) {
	
	this.tema=sugerencia.getTema();
	this.descripcion_s=sugerencia.getDescripcion_s();
	this.idsugerencia=sugerencia.getIdsugerencia();

}

	private String tema;
	private String descripcion_s;
	private int idsugerencia;
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

	public int getIdsugerencia() {
		return idsugerencia;
	}

	public void setIdsugerencia(int idsugerencia) {
		this.idsugerencia = idsugerencia;
	}




}
