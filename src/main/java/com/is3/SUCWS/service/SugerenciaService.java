package com.is3.SUCWS.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.converter.Convertidor;
import com.is3.SUCWS.entity.Sugerencia;
import com.is3.SUCWS.model.SugerenciaModel;
import com.is3.SUCWS.repository.SugerenciaRepository;

@Service("servsugerencia")

public class SugerenciaService {

	
	@Autowired
	@Qualifier("reposugerencia")
	
	private SugerenciaRepository reposugerencia;

	@Autowired
	@Qualifier("convertidor")
	private Convertidor Convertidor;
	
	
	private static final Log logger = LogFactory.getLog(SugerenciaService.class);

	
	
	public boolean creart(Sugerencia sugerencia) {
		logger.info("Creando Sugerencia");
		try {
			
			reposugerencia.save(sugerencia);
			logger.info("sugerencia creado");
			return true;
		} catch (Exception e) {
			logger.error("Error al crear sugerencia");
			return false;
		}
	}
	
	
	public List<SugerenciaModel> listart() {
		logger.info("Listando sugerencia");
		try {

			return Convertidor.convlistsugerencia(reposugerencia.findAll());
		} catch (Exception e) {
			logger.error("Error al listar sugerencia");
			return null;
		}
	}
	
	
	public boolean eliminar(int idsugerencia) {
		logger.info("Eliminando sugerencia por ID");
		try {
			
			Sugerencia sugerencia = reposugerencia.findByIdsugerencia(idsugerencia);
			reposugerencia.delete(sugerencia);
			logger.info("sugerencia eliminado");
			return true;
		} catch (Exception e) {
			logger.error("Error al eliminar sugerencia");
			return false;
		}
	}
	
	
}
