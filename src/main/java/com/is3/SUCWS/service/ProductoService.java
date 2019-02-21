package com.is3.SUCWS.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.converter.Convertidor;
import com.is3.SUCWS.entity.Producto;
import com.is3.SUCWS.model.ProductoModel;
import com.is3.SUCWS.repository.ProductoRepository;


@Service("servproducto")


public class ProductoService {
	@Autowired
	@Qualifier("repoproducto")
 
	private ProductoRepository repoproducto;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor Convertidor;
	
	private static final Log logger = LogFactory.getLog(ProductoService.class);
	
	public boolean crear(Producto producto) {
		logger.info("Creando Producto");
		try {
			
			repoproducto.save(producto);
			logger.info("Producto creado");
			return true;
		} catch (Exception e) {
			logger.error("Error al crear Producto");
			return false;
		}
	}
	
	
	
	public boolean eliminar(int idproducto) {
		logger.info("Eliminando Producto por ID");
		try {
			
			Producto producto = repoproducto.findByIdproducto(idproducto);
			repoproducto.delete(producto);
			logger.info("Producto eliminado");
			return true;
		} catch (Exception e) {
			logger.error("Error al eliminar Producto");
			return false;
		}
	}
	
	
	public List<ProductoModel> listar() {
		logger.info("Listando Productos");
		try {

			return Convertidor.convlistProducto(repoproducto.findAll());
		} catch (Exception e) {
			logger.error("Error al listar Productos");
			return null;
		}
	}
	public boolean actualizar(Producto producto) {
		logger.info("Actualizando Producto");
		try {
			
			repoproducto.save(producto);
			logger.info("Producto actualizado");
			return true;
		} catch (Exception e) {
			logger.error("Error al actualizar Producto");
			return false;
		}
	}
	
	}
