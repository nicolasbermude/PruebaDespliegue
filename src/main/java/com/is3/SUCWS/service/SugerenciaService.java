package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.SugerenciaModel;
import com.is3.SUCWS.repository.SugerenciaRepository;

@Service
public class SugerenciaService {
	
	@Autowired
	private SugerenciaRepository sugerenciaRepository;
	
	public SugerenciaModel saveSugerencia(SugerenciaModel sugerencia) {
        return sugerenciaRepository.save(sugerencia);
    }
	
	public void deleteSugerenciaById(Long id) {
		sugerenciaRepository.deleteById(id);
    }
	
	public List<SugerenciaModel> getAllSugerencia() {
        return sugerenciaRepository.findAll();
    }

    public Optional<SugerenciaModel> getById(Long id) {
        return sugerenciaRepository.findById(id);
    }


}
