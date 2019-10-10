package com.is3.SUCWS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.is3.SUCWS.model.ProductosModel;


public interface ProductoRepository extends JpaRepository<ProductosModel, Long>{
	
   @Query(value = "SELECT pr FROM ProductosModel pr WHERE pr.nombre_p like %?1%")
    List<ProductosModel> findByName(String nombre);

}
