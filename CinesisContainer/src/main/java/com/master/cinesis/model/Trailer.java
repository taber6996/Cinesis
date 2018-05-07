package com.master.cinesis.model;

import java.util.List;

import javax.persistence.*;


import com.master.cinesis.dao.TrailerDao;


public class Trailer {
	
	public Trailer(Integer idTrailer, Integer idPelicula, String titulo, String descripcion) {
		super();
		this.idTrailer = idTrailer;
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}


	private Integer idTrailer;
	
	private Pelicula idPelicula;
	
	private String titulo;
	
	private String descripcion;
	
	private Pelicula peliculas;
	
 //Duracion?????
	
	public void crearTrailer(Integer duracion,
			String titulo, String descripcion, Integer idPelicula) {
		TrailerDao tD = new TrailerDao();
		
		Trailer trailer = new Trailer(null, idPelicula, titulo, descripcion);
		
		tD.saveTrailer(trailer);
		
	}

	public void eliminarTrailer(String idTrailer) {
		TrailerDao tD = new TrailerDao();
		tD.deleteTrailerById(idTrailer);
	}

	
	public Trailer mostrarTrailer(String idTrailer) {
		TrailerDao tD = new TrailerDao();
		
		return tD.findById(idTrailer);
	}
	
	public Trailer mostrarTrailerByName(string name)
	{
		TrailerDao tD = new TrailerDao();
		
		return tD.findByName(name);
	}
	
	public List<Trailer> mostrarTodosTrailersById(Integer idPelicula)
	{
		TrailerDao tD = new TrailerDao();
		
		tD.findAllTrailerByPeliculaId(idPelicula);
	}
	
	public List<Trailer>mostrarTodosTrailers()
	{
		TrailerDao tD = new TrailerDao();
		
		return tD.findAllTrailer();
	}

	public void modificarTrailer(Integer duracion,
			String titulo, String descripcion, Integer idTrailer, Integer idPelicula)
	{
		TrailerDao tD = new TrailerDao();
		
		Trailer trailer = new Trailer(idTrailer, idPelicula, titulo, descripcion);
		
		tD.updateTrailer(trailer);
	}
	
	

}