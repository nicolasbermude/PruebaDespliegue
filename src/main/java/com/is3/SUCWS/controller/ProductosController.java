package com.is3.SUCWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.model.ProductosModel;
import com.is3.SUCWS.service.ProductoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/productos")
@Api(tags = "productos")
@CrossOrigin
public class ProductosController {
	
	@Autowired
    private ProductoService productosService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Productos", response = ProductosModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public ProductosModel insertProductos(@RequestBody ProductosModel producto) {
        return productosService.saveProducto(producto);
    }

	
	 @PutMapping(path = "/update")
	    @ApiOperation(value = "Update Producto", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied")})
	    public ProductosModel updateProducto(@RequestBody ProductosModel producto) {
	        return productosService.editProducto(producto);
	    }
	 
	 @DeleteMapping(path = "/delete")
	    @ApiOperation(value = "Delete Producto", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Producto doesn't exist")})
	    public void removeProducto(@RequestParam Long id) {
		 productosService.deleteProductoById(id);
	    }

	    @GetMapping(path = "/all")
	    @ApiOperation(value = "Get All Productos", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Producto doesn't exist")})
	    public List<ProductosModel> getAllProducto() {
	        return productosService.getAllProducto();
	    }

	    @GetMapping(path = "/id")
	    @ApiOperation(value = "Get Producto by Id", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Producto doesn't exist")})
	    public Optional<ProductosModel> getByIdProducto(@RequestParam Long id) {
	        return productosService.getById(id);
	    }
	    
	    @GetMapping(path = "/nombre")
	    @ApiOperation(value = "Get Producto by Name", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Producto doesn't exist")})
		 public List<ProductosModel> findByName(@RequestParam String nombre) {
		       return productosService.findByName(nombre);
		    }
	    
}
