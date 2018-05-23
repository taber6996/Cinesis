package com.cinesis.model;

import java.util.ArrayList;
import java.util.List;

import com.cinesis.dao.TrailerDao;

public class Trailer {
	
	public Trailer(Integer idTrailer, Integer idPelicula, String titulo, String descripcion) {
		super();
		this.idTrailer = idTrailer;
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}


	public Trailer() {//Construtor vacio
		this.idTrailer = null;
		this.idPelicula = null;
		this.titulo = null;
		this.descripcion = null;
	}


	private Integer idTrailer;
	
	private Integer idPelicula;
	
	private String titulo;
	
	private String descripcion;
	
	
	
	//private Pelicula peliculas;
	
 //Duracion?????
	
	public void crearTrailer() {
		TrailerDao tD = new TrailerDao();
				
		tD.saveTrailer(this);
	}

	public void eliminarTrailer(Integer idTrailer) {
		TrailerDao tD = new TrailerDao();
		tD.deleteTrailerById(idTrailer);
	}

	
	public Trailer mostrarTrailer(Integer idTrailer) {
		TrailerDao tD = new TrailerDao();
		
		return tD.findById(idTrailer);
	}
	
	public Trailer mostrarTrailerByName(String name)
	{
		TrailerDao tD = new TrailerDao();
		
		return tD.findByName(name);
	}
	
	public List<Trailer> mostrarTodosTrailersById(Integer idPelicula)
	{
		TrailerDao tD = new TrailerDao();
		
		return tD.findAllTrailerByPeliculaId(idPelicula);
	}
	
	public List<Trailer>mostrarTodosTrailers()
	{
		TrailerDao tD = new TrailerDao();
		
		return tD.findAllTrailer();
	}

	public void modificarTrailer()
	{
		TrailerDao tD = new TrailerDao();
		
		tD.updateTrailer(this);
	}
	public Integer getIdTrailer() {
		return idTrailer;
	}

	public void setIdTrailer(Integer idTrailer) {
		this.idTrailer = idTrailer;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
