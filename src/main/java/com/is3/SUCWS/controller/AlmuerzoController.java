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

import com.is3.SUCWS.model.AlmuerzosModel;
import com.is3.SUCWS.service.AlmuerzosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/almuerzos")
@Api(tags = "almuerzos")
@CrossOrigin
public class AlmuerzoController {
	
	@Autowired
    private AlmuerzosService almuerzosService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Almuerzos", response = AlmuerzosModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public AlmuerzosModel insertAlmuerzos(@RequestBody AlmuerzosModel almuerzo) {
        return almuerzosService.saveAlmuerzo(almuerzo);
    }

	
	 @PutMapping(path = "/update")
	    @ApiOperation(value = "Update Almuerzos", response = AlmuerzosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied")})
	    public AlmuerzosModel updateAlmuerzo(@RequestBody AlmuerzosModel almuerzo) {
	        return almuerzosService.editAlmuerzo(almuerzo);
	    }
	 
	 @DeleteMapping(path = "/delete")
	    @ApiOperation(value = "Delete Almuerzos", response = AlmuerzosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Almuerzos doesn't exist")})
	    public void removeAlmuerzos(@RequestParam Long id) {
		 almuerzosService.deleteAlmuerzoById(id);
	    }

	    @GetMapping(path = "/all")
	    @ApiOperation(value = "Get All Almuerzos", response = AlmuerzosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Almuerzos doesn't exist")})
	    public List<AlmuerzosModel> getAllAlmuerzo() {
	        return almuerzosService.getAllAlmuerzo();
	    }

	    @GetMapping(path = "/id")
	    @ApiOperation(value = "Get Almuerzos by Id", response = AlmuerzosModel.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Something went wrong"),
	            @ApiResponse(code = 401, message = "Access denied"),
	            @ApiResponse(code = 404, message = "The Almuerzos doesn't exist")})
	    public Optional<AlmuerzosModel> getByIdProducto(@RequestParam Long id) {
	        return almuerzosService.getById(id);
	    }

}
