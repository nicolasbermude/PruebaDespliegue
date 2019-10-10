package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.AlmuerzosModel;
import com.is3.SUCWS.repository.AlmuerzoRepository;

@Service

public class AlmuerzosService {
	
	@Autowired
	private AlmuerzoRepository almuerzoRepository;
	
	public AlmuerzosModel saveAlmuerzo(AlmuerzosModel almuerzo) {
        return almuerzoRepository.save(almuerzo);
    }
	
	public AlmuerzosModel editAlmuerzo(AlmuerzosModel almuerzo) {
        return almuerzoRepository.save(almuerzo);
    }
	

	public void deleteAlmuerzoById(Long id) {
		almuerzoRepository.deleteById(id);
    }
	
	public List<AlmuerzosModel> getAllAlmuerzo() {
        return almuerzoRepository.findAll();
    }

    public Optional<AlmuerzosModel> getById(Long id) {
        return almuerzoRepository.findById(id);

}
}
