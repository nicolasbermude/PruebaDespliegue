package com.is3.SUCWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.model.AdministradorModel;
import com.is3.SUCWS.service.AdministradorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/administrador")
@Api(tags = "administrador")
@CrossOrigin
public class AdministradorController {

	@Autowired
	private AdministradorService administradorService;

	@PostMapping(path = "/insert")
	@ApiOperation(value = "Insert Administrador", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public AdministradorModel insertAdministrador(@RequestBody AdministradorModel administrador) {
		return administradorService.saveAdministrador(administrador);
	}

	@PutMapping(path = "/update")
	@ApiOperation(value = "Update Administrador", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied") })
	public AdministradorModel updateAdministrador(@RequestBody AdministradorModel administrador) {
		return administradorService.editAdministrador(administrador);
	}

	@DeleteMapping(path = "/delete")
	@ApiOperation(value = "Delete Administrador", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The Administrador doesn't exist") })
	public void removeCasino(@RequestParam Long id) {
		administradorService.deleteAdministradorById(id);
	}

	@GetMapping(path = "/all")
	@ApiOperation(value = "Get All Administrador", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The Administrador doesn't exist") })
	public List<AdministradorModel> getAllAdministrador() {
		return administradorService.getAllAdministrador();
	}

	@GetMapping(path = "/id")
	@ApiOperation(value = "Get Administrador by Id", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The Administrador doesn't exist") })
	public Optional<AdministradorModel> getByIdCasino(@RequestParam Long id) {
		return administradorService.getById(id);
	}

	@GetMapping(path = "/usuario")
	@ApiOperation(value = "Login", response = AdministradorModel.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Access denied"),
			@ApiResponse(code = 404, message = "The Administrador doesn't exist") })
	public AdministradorModel buscarAdministradorUsuario(@RequestHeader("usuario") String usuario,
			@RequestHeader("password") String password) {

		return administradorService.buscarAdministradorUsuario(usuario, password);

	}
}
