package com.is3.SUCWS.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.is3.SUCWS.entity.Producto;


@Repository("repoproducto")
public interface ProductoRepository extends JpaRepository <Producto, Serializable>{
	
	
   public abstract Producto findByIdproducto (int idproducto);

}
