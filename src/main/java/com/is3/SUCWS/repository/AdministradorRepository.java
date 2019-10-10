package com.is3.SUCWS.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.is3.SUCWS.model.AdministradorModel;


public interface AdministradorRepository extends JpaRepository  <AdministradorModel, Long>{
	
	//public abstract Administrador findUser (String usuario, String password);
	public abstract AdministradorModel findByUsuario (String usuario);

}
