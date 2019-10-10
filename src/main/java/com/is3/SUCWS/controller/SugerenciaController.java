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

import com.is3.SUCWS.model.SugerenciaModel;
import com.is3.SUCWS.service.SugerenciaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/sugerencia")
@Api(tags = "sugerencia")
@CrossOrigin
public class SugerenciaController {
	
	@Autowired
    private SugerenciaService sugerenciaService;
	
	@PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Sugerencia", response = SugerenciaModel.class)  
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied")})
    public SugerenciaModel insertSugerencia(@RequestBody SugerenciaModel sugerencia) {
        return sugerenciaService.saveSugerencia(sugerencia);
    }

	
	@DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete Sugerencia", response = SugerenciaModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Sugerencia doesn't exist")})
    public void removeSugerencia(@RequestParam Long id) {
		sugerenciaService.deleteSugerenciaById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All Sugerencia", response = SugerenciaModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Sugerencia doesn't exist")})
    public List<SugerenciaModel> getAllSugerencia() {
        return sugerenciaService.getAllSugerencia();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get Sugerencia by Id", response = SugerenciaModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Sugerencia doesn't exist")})
    public Optional<SugerenciaModel> getByIdSugerencia(@RequestParam Long id) {
        return sugerenciaService.getById(id);
    }

}
