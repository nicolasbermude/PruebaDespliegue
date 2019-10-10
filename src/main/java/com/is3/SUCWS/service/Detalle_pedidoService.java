package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.Detalle_pedidoModel;
import com.is3.SUCWS.repository.Detalle_pedidoRepository;

@Service
public class Detalle_pedidoService {
	
	@Autowired
	private Detalle_pedidoRepository detalle_pedidoRepository;
	
	public Detalle_pedidoModel saveDetallePedido(Detalle_pedidoModel detalle) {
        return detalle_pedidoRepository.save(detalle);
    }
	
	public Detalle_pedidoModel editDetallePedido(Detalle_pedidoModel detalle) {
        return detalle_pedidoRepository.save(detalle);
    }
	

	public void deleteDetallePedidoById(Long id) {
		detalle_pedidoRepository.deleteById(id);
    }
	
	public List<Detalle_pedidoModel> getAllDetallePedido() {
        return detalle_pedidoRepository.findAll();
    }

    public Optional<Detalle_pedidoModel> getById(Long id) {
        return detalle_pedidoRepository.findById(id);

}

}
