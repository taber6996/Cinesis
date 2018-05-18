package com.master.cinesis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.master.cinesis.model.Pelicula;
import com.master.cinesis.model.Trailer;

@Repository
public class PeliculaDao extends AbstractSession{

	public void savePelicula(Pelicula pelicula){
		getSession().persist(pelicula);
	}
	
	public void deleteCineById(Integer pelicula_id){
		Pelicula pelicula = findById(pelicula_id);
		
		if (pelicula != null) {
			getSession().delete(pelicula);
		}
		
	}
	
	public void updatePelicula(Pelicula pelicula){
		getSession().update(pelicula);
	}
	
	public List<Pelicula> findAllPeliculas(){
		return getSession().createQuery("from Pelicula").list();
	}
	
	public Pelicula findById(Integer pelicula_id){
		return (Pelicula) getSession().get(Pelicula.class, pelicula_id);
	}
	
	public Pelicula findByName(String pelicula_nombre) {
		return  (Pelicula) getSession().createQuery(
				"from Pelicula where nombre = :pelicula_nombre")
				.setParameter("pelicula_nombre", pelicula_nombre).uniqueResult();
	}

}