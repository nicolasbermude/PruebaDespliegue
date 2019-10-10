package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.is3.SUCWS.model.AdministradorModel;
import com.is3.SUCWS.repository.AdministradorRepository;

@Service

public class AdministradorService {
	@Autowired
	private AdministradorRepository administradorRepository;
	
	
	public AdministradorModel saveAdministrador(AdministradorModel administrador) {
        return administradorRepository.save(administrador);
    }
	
	public AdministradorModel editAdministrador(AdministradorModel administrador) {
        return administradorRepository.save(administrador);
    }
	

	public void deleteAdministradorById(Long id) {
        administradorRepository.deleteById(id);
    }
	
	public List<AdministradorModel> getAllAdministrador() {
        return administradorRepository.findAll();
    }

    public Optional<AdministradorModel> getById(Long id) {
        return administradorRepository.findById(id);
    }
	
public AdministradorModel buscarAdministradorUsuario(String usuario, String password) {
		
		
		try {
				AdministradorModel administrador = administradorRepository.findByUsuario(usuario);
				if (password.equals(administrador.getPassword())) {
					return administrador;
				} else {
					return null;
				}
			
		} catch (Exception e) {
			
			return null;
		}
}
		
	
}