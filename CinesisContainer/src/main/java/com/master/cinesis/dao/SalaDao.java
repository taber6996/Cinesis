package com.master.cinesis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.master.cinesis.dao.AbstractSession;
import com.master.cinesis.model.Sala;

@Repository
public class SalaDao extends AbstractSession{

	public void saveSala(Sala sala){
		getSession().persist(sala);
	}
	
	public void deleteSlaById(Integer sala_id){
		Sala sala = findById(sala_id);
		
		if (sala != null) {
			getSession().delete(sala);
		}
		
	}
	
	public void updateDala(Sala sala){
		getSession().update(sala);
	}
	
	public List<Sala> findAllSala(){
		return getSession().createQuery("from Sala").list();
	}
	
	public Sala findById(Integer sala_id){
		return (Sala) getSession().get(Sala.class, sala_id);
	}
	
	public Sala findByName(String sala_nombre) {
		return  (Sala) getSession().createQuery(
				"from Sala where nombre = :sala_nombre")
				.setParameter("sala_nombre", sala_nombre).uniqueResult();
	}
}
