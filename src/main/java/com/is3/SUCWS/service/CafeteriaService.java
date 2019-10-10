package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.CafeteriaModel;
import com.is3.SUCWS.repository.CafeteriaRepository;

@Service
public class CafeteriaService {
	
	@Autowired
	private CafeteriaRepository cafeteriaRepository;
	
	public CafeteriaModel saveCafeteria(CafeteriaModel cafeteria) {
        return cafeteriaRepository.save(cafeteria);
    }
	
	public CafeteriaModel editCafeteria(CafeteriaModel cafeteria) {
        return cafeteriaRepository.save(cafeteria);
    }
	

	public void deleteCafeteriaById(Long id) {
		cafeteriaRepository.deleteById(id);
    }
	
	public List<CafeteriaModel> getAllCafeteria() {
        return cafeteriaRepository.findAll();
    }

    public Optional<CafeteriaModel> getById(Long id) {
        return cafeteriaRepository.findById(id);
    }

}
