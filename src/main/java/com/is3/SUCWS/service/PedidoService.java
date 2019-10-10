package com.is3.SUCWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.model.PedidoModel;
import com.is3.SUCWS.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public PedidoModel savePedido(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }
	
	public PedidoModel editPedido(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }
	

	public void deletePedidoById(Long id) {
		pedidoRepository.deleteById(id);
    }
	
	public List<PedidoModel> getAllPedido() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> getById(Long id) {
        return pedidoRepository.findById(id);
    }

}
