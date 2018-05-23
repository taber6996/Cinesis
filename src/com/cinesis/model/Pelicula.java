package com.cinesis.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.cinesis.dao.PeliculaDao;

public class Pelicula {
	

	private String nomPelicula;
	
	private String slug;
	
	private Integer idPelicula;
	
	private Integer duracion;
	
	private String imagenPrinc;
	
	private String imagenSec;

	private String sinopsis;
	
	private Integer calificacion;
	
	private Categoria categoria;
	
	private String pais;
	
	private Date estreno;
	
	private String directores;
	
	private Date fecha;
	
	//private List<Trailer> trailers;
	
	
	public Pelicula(String nomPelicula, String slug,Integer idPelicula,Integer duracion, String imagenPrinc,
			String imagenSec, String sinopsis, Integer calificacion, Categoria categoria, String pais, Date estreno,
			String directores, Date fecha) {
		
		
		this.nomPelicula = nomPelicula;
		this.slug = slug;
		this.idPelicula = idPelicula;
		this.duracion = duracion;
		this.imagenPrinc = imagenPrinc;
		this.imagenSec = imagenSec;
		this.sinopsis = sinopsis;
		this.calificacion = calificacion;
		this.categoria = categoria;
		this.pais = pais;
		this.estreno = estreno;
		this.directores = directores;
		this.fecha = fecha;
	
	}

	


	public void crearPelicula() {
		
		PeliculaDao pD = new PeliculaDao();
		//pD.savePelicula(this);
	}
	
	
	public Pelicula mostrarPelicula(Integer idPelicula) {
		PeliculaDao pD = new PeliculaDao();
		return pD.findById(idPelicula);
	}

	/*
	public void detallesPrivadoPeliculas(Integer idPelicula) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	*/

	public void editarPelicula() {
		PeliculaDao pD = new PeliculaDao();
		pD.updatePelicula(this);
		
	}

	
	public void borrarPelicula(Integer idPelicula) {
		PeliculaDao pD = new PeliculaDao();
		pD.deletePeliculaById(idPelicula);
	}

	
	public List<Pelicula> listadoPublicoPeliculas() {
		PeliculaDao pD = new PeliculaDao();
		return pD.findAllPeliculas();
		
	}


	public void valorarPelicula(Integer idPelicula, Integer valoracion) {
		this.calificacion = valoracion;
		//???????????????????????????????????????
	}

	
}
