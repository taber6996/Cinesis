package com.master.cinesis.model;

import javax.persistence.*;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.mapping.Array;

import com.master.cinesis.dao.PeliculaDao;

//import java.lang.reflect.Array;
//import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "Pelicula")


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
	
	private Set<Trailer> trailers;
	
	
	public Pelicula(Integer idPelicula, String nomPelicula, String slug, Integer duracion, String imagenPrinc,
			String imagenSec, String sinopsis, Integer calificacion, Categoria categoria, String pais, Date estreno,
			String directores, Date fecha, Set<Trailer> trailers) {
		
		this.idPelicula = idPelicula;
		this.nomPelicula = nomPelicula;
		this.slug = slug;
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
		this.trailers = trailers;
	}

	

	public void crearPelicula(String nomPelicula, Integer duration,
			String imagenPrinc, String imangenSec, Array actores, String sinopsis, Set<Trailer> trailers,
			Integer calificacion, String pais, Date estreno, String directores, Date fecha, Categoria categoria) {
		
		Pelicula P = new Pelicula(null, nomPelicula,null,duration,imagenPrinc,imangenSec,sinopsis,calificacion,categoria,pais,
					estreno,directores,fecha,trailers); 
		PeliculaDao pD = new PeliculaDao();
		pD.savePelicula(P);
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

	public void editarPelicula(Pelicula pelicula) {
		PeliculaDao pD = new PeliculaDao();
		pD.updatePelicula(pelicula);
		
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
