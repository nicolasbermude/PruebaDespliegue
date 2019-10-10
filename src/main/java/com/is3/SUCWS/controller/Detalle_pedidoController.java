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

import com.is3.SUCWS.model.Detalle_pedidoModel;
import com.is3.SUCWS.model.ProductosModel;
import com.is3.SUCWS.service.Detalle_pedidoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/detalle_pedido")
@Api(tags = "detalle_pedido")
@CrossOrigin
public class Detalle_pedidoController {
	
	@Autowired
    private Detalle_pedidoService detalle_pedidoService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Detalle Pedido", response = Detalle_pedidoModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 401, message = "Expired or invalid JWT token")})
    public Detalle_pedidoModel insertDetalle(@RequestBody Detalle_pedidoModel detalle) {
        return detalle_pedidoService.saveDetallePedido(detalle);
    }

	
	 @PutMapping(path = "/update")
	    @ApiOperation(value = "Update Detalle Pedido", response = Detalle_pedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 401, message = "Expired or invalid JWT token")})
	    public Detalle_pedidoModel updateDetalle(@RequestBody Detalle_pedidoModel detalle) {
	        return detalle_pedidoService.editDetallePedido(detalle);
	    }
	 
	 @DeleteMapping(path = "/delete")
	    @ApiOperation(value = "Delete Detalle Pedido", response = ProductosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Detalle Pedido doesn't exist")})
	    public void removeDetalle(@RequestParam Long id) {
		 detalle_pedidoService.deleteDetallePedidoById(id);
	    }

	    @GetMapping(path = "/all")
	    @ApiOperation(value = "Get All Detalle Pedido", response = Detalle_pedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Detalle Pedido doesn't exist")})
	    public List<Detalle_pedidoModel> getAllDetalle() {
	        return detalle_pedidoService.getAllDetallePedido();
	    }

	    @GetMapping(path = "/id")
	    @ApiOperation(value = "Get Detalle Pedido by Id", response = Detalle_pedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Detalle pedido doesn't exist")})
	    public Optional<Detalle_pedidoModel> getByIdPedido(@RequestParam Long id) {
	        return detalle_pedidoService.getById(id);
	    }

}
