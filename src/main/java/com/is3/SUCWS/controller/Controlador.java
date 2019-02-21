package com.is3.SUCWS.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.entity.Producto;
import com.is3.SUCWS.entity.Sugerencia;
import com.is3.SUCWS.model.ProductoModel;
import com.is3.SUCWS.model.SugerenciaModel;
import com.is3.SUCWS.service.ProductoService;
import com.is3.SUCWS.service.SugerenciaService;

@RestController
@RequestMapping("/tesis")
@CrossOrigin
public class Controlador {

	
	
	@Autowired
	@Qualifier("servproducto")

	ProductoService servproducto;
	
	@GetMapping("/producto")
	public List<ProductoModel> listar(){
	
		return servproducto.listar();
	}

	@DeleteMapping("/producto/{idproducto}")
	public boolean eliminarProducto(@PathVariable("idproducto") int idproducto) {
	
		return servproducto.eliminar(idproducto);
	}

	@PutMapping("/producto")
	public boolean agregarProducto(@RequestBody @Valid Producto producto) {
	
		return servproducto.crear(producto);
	}
	@PostMapping("/producto")
	public boolean actualizarProducto(@RequestBody @Valid Producto producto) {
		
		return servproducto.actualizar(producto);
	}
	
	
	@Autowired
	@Qualifier("servsugerencia")
	SugerenciaService servsugerencia;
	
@GetMapping("/sugerencia")
	public List<SugerenciaModel> listart(){
	
		return servsugerencia.listart();
	}
	@PutMapping("/sugerencia")
	public boolean agregarSugerencia(@RequestBody @Valid Sugerencia sugerencia) {
	
		return servsugerencia.creart(sugerencia);
	}
	
	
	@DeleteMapping("/sugerencia/{idsugerencia}")
	public boolean eliminarsugerencia(@PathVariable("idsugerencia") int idsugerencia) {
	
		return servsugerencia.eliminar(idsugerencia);
	}
}