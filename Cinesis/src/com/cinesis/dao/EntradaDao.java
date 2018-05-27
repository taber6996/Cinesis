package com.cinesis.dao;

import java.util.List;

import com.cinesis.model.Entrada;
import com.cinesis.model.Trailer;

public class EntradaDao {
	
	public void saveEntrada(Entrada entrada){
		
	}
	
	public void deleteEntradaById(Integer entrada_id){

		
	}
	
	public void updateEntrada(Entrada entrada){
		
	}
	
	public List<Entrada> findAllEntradas(){
		return null;
	}
	
	public Entrada findById(Integer entrada_id){
		return null;
		 
	}
	
	public Entrada findByName(String entrada_nombre) {
		return null;
		
	}
	
	public List<Entrada> findAllEntradaBySalaId (Integer sala_id){
		return null;
	
	}
}


/**
 * 
 * 
 * CREATE TABLE `entrada` (
  `id` int(11) NOT NULL,
  `sala_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pelicula_id` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `numeroAsiento` varchar(5) DEFAULT NULL,
  `horario` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT NULL

 * 
 * 
 * /
 */