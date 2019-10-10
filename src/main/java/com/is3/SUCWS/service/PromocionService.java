package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.PromocionModel;
import com.is3.SUCWS.repository.PromocionRepository;


@Service

public class PromocionService {

	@Autowired
private PromocionRepository promocionRepository; 
	
	public PromocionModel savePromocion(PromocionModel promocion) {
        return promocionRepository.save(promocion);
    }
	

	public PromocionModel editPromocion(PromocionModel promocion) {
        return promocionRepository.save(promocion);
    }
	
	public void deletePromocionById(Long id) {
		promocionRepository.deleteById(id);
    }
	
	public List<PromocionModel> getAllPromocion() {
        return promocionRepository.findAll();
    }

    public Optional<PromocionModel> getByIds(Long id) {
        return promocionRepository.findById(id);
    }
}
