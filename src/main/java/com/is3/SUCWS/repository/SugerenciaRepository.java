package com.is3.SUCWS.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.is3.SUCWS.entity.Sugerencia;

@Repository("reposugerencia")

public interface SugerenciaRepository extends JpaRepository <Sugerencia, Serializable> {

	
	   public abstract Sugerencia findByIdsugerencia (int idsugerencia);

}


