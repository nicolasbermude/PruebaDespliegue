package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.ProductosModel;
import com.is3.SUCWS.repository.ProductoRepository;


@Service

public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	public ProductosModel saveProducto(ProductosModel producto) {
        return productoRepository.save(producto);
    }
	
	public ProductosModel editProducto(ProductosModel producto) {
        return productoRepository.save(producto);
    }
	
	
	public void deleteProductoById(Long id) {
		productoRepository.deleteById(id);
    }
	
	public List<ProductosModel> getAllProducto() {
        return productoRepository.findAll();
    }

    public Optional<ProductosModel> getById(Long id) {
        return productoRepository.findById(id);
    }
	
	public List<ProductosModel> findByName(String nombre) {
        return productoRepository.findByName(nombre);
    }
	
	}
