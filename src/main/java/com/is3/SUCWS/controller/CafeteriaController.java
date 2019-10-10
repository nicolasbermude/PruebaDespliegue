package com.is3.SUCWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.model.CafeteriaModel;
import com.is3.SUCWS.service.CafeteriaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/cafeteria")
@Api(tags = "cafeteria")
public class CafeteriaController {
	
	@Autowired
    private CafeteriaService cafeteriaService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Cafeteria", response = CafeteriaModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public CafeteriaModel insertAdministrador(@RequestBody CafeteriaModel cafeteria) {
        return cafeteriaService.saveCafeteria(cafeteria);
    }
	
	 @PutMapping(path = "/update")
	    @ApiOperation(value = "Update Cafeteria", response = CafeteriaModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied")})
	    public CafeteriaModel updateCafeteria(@RequestBody CafeteriaModel cafeteria) {
	        return cafeteriaService.editCafeteria(cafeteria);
	    }
	 
	 @DeleteMapping(path = "/delete")
	    @ApiOperation(value = "Delete Cafeteria", response = CafeteriaModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Cafeteria doesn't exist")})
	    public void removeCafeteria(@RequestParam Long id) {
		 cafeteriaService.deleteCafeteriaById(id);
	    }

	    @GetMapping(path = "/all")
	    @ApiOperation(value = "Get All Administrador", response = CafeteriaModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Cafeteria doesn't exist")})
	    public List<CafeteriaModel> getAllCafeteria() {
	        return cafeteriaService.getAllCafeteria();
	    }

	    @GetMapping(path = "/id")
	    @ApiOperation(value = "Get Casino by Id", response = CafeteriaModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Cafeteria doesn't exist")})
	    public Optional<CafeteriaModel> getByIdCafeteria(@RequestParam Long id) {
	        return cafeteriaService.getById(id);
	    }

}
