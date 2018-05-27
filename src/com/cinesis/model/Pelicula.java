package com.cinesis.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
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
	
	private String estreno;
	
	private String directores;
	
	
	//private List<Trailer> trailers;
	
	public Pelicula() {
	}
	
	public Pelicula(Integer idPelicula,String nomPelicula, String slug,Integer duracion, String imagenPrinc,
			String imagenSec, String sinopsis, Integer calificacion, Categoria categoria, String pais, String estreno,
			String directores) {
		
		
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
	}

	


	public void crearPelicula(String nomPelicula,String slug, Integer duration,
			String imagen,String imagenSec, String sinopsis,
			Integer calificacion,Categoria categoria, String pais, String estreno,String directores) {
		
		PeliculaDao pD = new PeliculaDao();
		Pelicula p = new Pelicula(null,nomPelicula,slug,duration, imagen, imagenSec, sinopsis, calificacion, categoria, pais,estreno, directores);
		
		pD.createPelicula(p);
	}
	
	
	public Pelicula mostrarPelicula(Integer idPelicula) {
		PeliculaDao pD = new PeliculaDao();
		List<String> lPeli = new ArrayList<String>();

		
		lPeli = pD.findById(idPelicula);
		Iterator<String> it =  lPeli.iterator();
		
		Pelicula peli = new Pelicula(Integer.parseInt(it.next()),it.next(),it.next(),
				Integer.parseInt(it.next()),it.next(),it.next(),it.next(),Integer.parseInt(it.next()),
				stringToEnum(it.next()),it.next(),it.next(),it.next());

		return peli;
	}
	
	public Timestamp stringToTimestamp(String fecha)
	{
		Timestamp timestamp = null;
		try {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		    Date parsedDate = (Date) dateFormat.parse(fecha);
		    timestamp = new java.sql.Timestamp(parsedDate.getTime());
		} catch(Exception e) {

		}
		return timestamp;
	}
	
	public Categoria stringToEnum(String stringEnum) {
		Categoria cat = Categoria.valueOf(stringEnum);
		return cat;
	
	}

	/*
	public void detallesPrivadoPeliculas(Integer idPelicula) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	*/

	public void editarPelicula(int idPelicula, String nombre, String slug,  int duration, String imagen, String imagenSec, String sinopsis, int calificacion, Categoria categoria, String pais, String estreno, String directores) {
		PeliculaDao pD = new PeliculaDao();
		Pelicula p = new Pelicula(idPelicula,nombre,slug,duration, imagen, imagenSec, sinopsis, calificacion, categoria, pais,estreno, directores);

		pD.updatePelicula(p);
	}

	
	public void borrarPelicula(Integer idPelicula) {
		PeliculaDao pD = new PeliculaDao();
		pD.deletePeliculaById(idPelicula);
	}

	
	public List<Object> listadoPublicoPeliculas() {
		PeliculaDao pD = new PeliculaDao();
		
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> l2 = new ArrayList<String>();
		List<Object> listPeli = new ArrayList<Object>();

		list = pD.findAllPeliculas();
		
		Iterator<List<String>> it = list.iterator();
		
		for (int i = 0; i < list.size(); i++)
		{
			
			l2 = it.next();
			Iterator<String> it2 = l2.iterator();
			
			Pelicula peliAux = new Pelicula(Integer.parseInt(it2.next()),it2.next(),it2.next(),
					Integer.parseInt(it2.next()),it2.next(),it2.next(),it2.next(),Integer.parseInt(it2.next()),
					stringToEnum(it2.next()),it2.next(),stringToTimestamp(it2.next()),it2.next());
			listPeli.add(peliAux); 
		}
		
		return listPeli;
	}


	public void valorarPelicula(Integer idPelicula, Integer valoracion) {
		this.calificacion = valoracion;
		//???????????????????????????????????????
		
		// Creo que no es necesario hacerlo. Alejandro Z.
	}

	public String getNomPelicula() {
		return nomPelicula;
	}

	public void setNomPelicula(String nomPelicula) {
		this.nomPelicula = nomPelicula;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getImagenPrinc() {
		return imagenPrinc;
	}

	public void setImagenPrinc(String imagenPrinc) {
		this.imagenPrinc = imagenPrinc;
	}

	public String getImagenSec() {
		return imagenSec;
	}

	public void setImagenSec(String imagenSec) {
		this.imagenSec = imagenSec;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstreno() {
		return estreno;
	}

	public void setEstreno(String estreno) {
		this.estreno = estreno;
	}

	public String getDirectores() {
		return directores;
	}

	public void setDirectores(String directores) {
		this.directores = directores;
	}
	
}
