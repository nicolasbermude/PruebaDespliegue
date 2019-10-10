package com.is3.SUCWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.model.PedidoModel;
import com.is3.SUCWS.service.PedidoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/pedidos")
@Api(tags = "pedidos")
@CrossOrigin
public class PedidoController {
	
	@Autowired
    private PedidoService pedidoService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Pedidos", response = PedidoModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public PedidoModel insertPedido(@RequestBody PedidoModel pedido) {
        return pedidoService.savePedido(pedido);
    }
	
	 @DeleteMapping(path = "/delete")
	    @ApiOperation(value = "Delete Pedido", response = PedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Pedido doesn't exist")})
	    public void removeProducto(@RequestParam Long id) {
		 pedidoService.deletePedidoById(id);
	    }

	    @GetMapping(path = "/all")
	    @ApiOperation(value = "Get All Pedido", response = PedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Producto doesn't exist")})
	    public List<PedidoModel> getAllPedido() {
	        return pedidoService.getAllPedido();
	    }

	    @GetMapping(path = "/id")
	    @ApiOperation(value = "Get Pedido by Id", response = PedidoModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Pedido doesn't exist")})
	    public Optional<PedidoModel> getByIdPedido(@RequestParam Long id) {
	        return pedidoService.getById(id);
	    }

}
