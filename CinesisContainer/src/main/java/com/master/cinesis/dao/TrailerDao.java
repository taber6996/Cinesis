package com.master.cinesis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.master.cinesis.model.Trailer;

@Repository
public class TrailerDao extends AbstractSession {
	
	public void saveTrailer(Trailer trailer){
		getSession().persist(trailer);
	}
	
	public void deleteTrailerById(Integer trailer_id){
		Trailer trailer = findById(trailer_id);
		
		if (trailer != null) {
			getSession().delete(trailer);
		}
		
	}
	
	public void updateTrailer(Trailer trailer){
		getSession().update(trailer);
	}
	
	public List<Trailer> findAllTrailer(){
		return getSession().createQuery("from Trailer").list();
	}
	
	public Trailer findById(Integer trailer_id){
		return (Trailer) getSession().get(Trailer.class, trailer_id);
	}
	
	public Trailer findByName(String trailer_nombre) {
		return  (Trailer) getSession().createQuery(
				"from Trailer where nombre = :trailer_nombre")
				.setParameter("trailer_nombre", trailer_nombre).uniqueResult();
	}
	
	
	public List<Trailer> findAllTrailerByPeliculaId (Integer pelicula_id){
		
		return (List<Trailer>) getSession().createQuery(
				"from Trailer t join t.pelicula where t.pelicula_id = :pelicula_id")
				.setParameter("pelicula_id", pelicula_id).list();
	}
}
