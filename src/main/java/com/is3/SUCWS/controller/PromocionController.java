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

import com.is3.SUCWS.model.PromocionModel;
import com.is3.SUCWS.service.PromocionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/promocion")
@Api(tags = "promocion")
@CrossOrigin
public class PromocionController {
	
	@Autowired
    private PromocionService promocionService;
    
    @PostMapping(path = "/insertPromocion")
    @ApiOperation(value = "Insert Promocion", response = PromocionModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public PromocionModel insertPromocion(@RequestBody PromocionModel promocion) {
        return promocionService.savePromocion(promocion);
    }
	
	
	@PutMapping(path = "/updatePromocion")
    @ApiOperation(value = "Update Promocion", response = PromocionModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public PromocionModel updateProducto(@RequestBody PromocionModel promocion) {
        return promocionService.editPromocion(promocion);
    }
 
 @DeleteMapping(path = "/deletePromocion")
    @ApiOperation(value = "Delete Producto", response = PromocionModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public void removePromocion(@RequestParam Long id) {
	 promocionService.deletePromocionById(id);
    }

    @GetMapping(path = "/allPromocion")
    @ApiOperation(value = "Get All Promocion", response = PromocionModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Promocion doesn't exist")})
    public List<PromocionModel> getAllPromocion() {
        return promocionService.getAllPromocion();
    }

    @GetMapping(path = "/idPromocion")
    @ApiOperation(value = "Get Promocion by Id", response = PromocionModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Promocion doesn't exist")})
    public Optional<PromocionModel> getByIdPromocion(@RequestParam Long id) {
        return promocionService.getByIds(id);
    }

}
