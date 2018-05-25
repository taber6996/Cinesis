package com.cinesis.model;

import java.sql.ResultSet;
import java.sql.SQLException;
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
	}


	private Integer idTrailer;
	
	private Integer idPelicula;
	
	private String titulo;
	
	private String descripcion;
	
	
	
	
	public void crearTrailer(int idPelicula, String titulo, String descripcion) {
		
		TrailerDao tD = new TrailerDao();
		Trailer t = new Trailer(null, idPelicula, titulo, descripcion);
		tD.saveTrailer(t);
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

	public void modificarTrailer(int idTrailer, int idPelicula, String titulo, String descripcion)
	{
		TrailerDao tD = new TrailerDao();
		Trailer t = new Trailer(idTrailer, idPelicula, titulo, descripcion);
		
		tD.updateTrailer(t);
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
	
	public Trailer setDatosQuery(ResultSet rs){
		Trailer trailer = null;
		try {
		trailer.setIdTrailer(rs.getInt("id"));
		trailer.setIdPelicula(rs.getInt("pelicula_id"));
		trailer.setTitulo(rs.getString("titulo"));
		trailer.setDescripcion(rs.getString("descripcion"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return trailer;
	}
}
