package com.master.cinesis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.master.cinesis.model.Entrada;

@Repository
public class EntradaDao extends AbstractSession{
	
	public void saveEntrada(Entrada entrada){
		getSession().persist(entrada);
	}
	

	public void deleteEntradaById(Integer entrada_id){
		Entrada entrada = findById(entrada_id);
		
		if (entrada != null) {
			getSession().delete(entrada);
		}
		
	}
	
	public void updateEntrada(Entrada entrada){
		getSession().update(entrada);
	}
	
	public List<Entrada> findAllEntradas(){
		return getSession().createQuery("from Entrada").list();
	}
	
	public Entrada findById(Integer entrada_id){
		return (Entrada) getSession().get(Entrada.class, entrada_id);
	}
	
	public Entrada findByName(String entrada_nombre) {
		return  (Entrada) getSession().createQuery(
				"from Entrada where nombre = :entrada_nombre")
				.setParameter("entrada_nombre", entrada_nombre).uniqueResult();
	}
	
	public List<Entrada> findAllEntradaBySalaId (Integer sala_id){
		
		return (List<Entrada>) getSession().createQuery(
				"from Entrada t join t.sala where t.sala_id = :sala_id")
				.setParameter("sala_id", sala_id).list();
	}
}
