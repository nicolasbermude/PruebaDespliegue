package com.is3.SUCWS.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.is3.SUCWS.entity.Producto;
import com.is3.SUCWS.entity.Sugerencia;
import com.is3.SUCWS.model.ProductoModel;
import com.is3.SUCWS.model.SugerenciaModel;


@Component("convertidor")
public class Convertidor {
	
	public List<ProductoModel> convlistProducto(List<Producto> productos){
		
		List<ProductoModel> listProductoModel = new ArrayList<>();
		
		for(Producto producto : productos) {
			
			listProductoModel.add(new ProductoModel(producto));
		}
		
		return listProductoModel;
	}
	
	
	
public List<SugerenciaModel> convlistsugerencia(List<Sugerencia> sugerencias){
		
		List<SugerenciaModel> convlistsugerencia = new ArrayList<>();
		
		for(Sugerencia sugerencia : sugerencias) {
			
			convlistsugerencia.add(new SugerenciaModel(sugerencia));
		}
		
		return convlistsugerencia;
	}
	
}
