package com.cinesis.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
	
	private Timestamp estreno;
	
	private String directores;
	
	private Timestamp fecha;
	
	//private List<Trailer> trailers;
	
	public Pelicula() {
	}
	
	public Pelicula(String nomPelicula, String slug,Integer idPelicula,Integer duracion, String imagenPrinc,
			String imagenSec, String sinopsis, Integer calificacion, Categoria categoria, String pais, Timestamp estreno,
			String directores, Timestamp fecha) {
		
		
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

	


	public void crearPelicula(String nomPelicula,String slug,Integer idPeli, Integer duration,
			String imagen,String imagenSec, String sinopsis,
			Integer calificacion,Categoria categoria, String pais, Timestamp estreno,String directores,
			Timestamp fecha) {
		
		PeliculaDao pD = new PeliculaDao();
		Pelicula p = new Pelicula(nomPelicula,slug,idPeli,duration, imagen, imagenSec, sinopsis, calificacion, categoria, pais,estreno, directores, fecha);
		
		pD.createPelicula(p);
	}
	
	
	public Pelicula mostrarPelicula(Integer idPelicula) {
		PeliculaDao pD = new PeliculaDao();
		ResultSet rs =  pD.findById(idPelicula);
		
		return setDatosQuery(rs);
	}
	public Pelicula setDatosQuery(ResultSet rs)
	{
		Pelicula peli = new Pelicula();
		String cat;
		try {
			rs.next();
			peli.setIdPelicula(rs.getInt("id"));
			peli.setNomPelicula(rs.getString("nombre"));
			peli.setSlug(rs.getString("slug"));
			peli.setDuracion(rs.getInt("duracion"));
			peli.setImagenPrinc(rs.getString("imagen_principal"));
			peli.setImagenSec(rs.getString("imagen_secundario"));
			peli.setSinopsis(rs.getString("sinopsis"));
			peli.setCalificacion(rs.getInt("calificacion"));
			cat = rs.getString("categoria");
			peli.setCategoria(stringToEnum(cat));
			peli.setPais(rs.getString("pais"));
			peli.setEstreno(rs.getTimestamp("estreno"));
			peli.setDirectores(rs.getString("director"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peli;
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

	public void editarPelicula(String nombre, String slug, int idPelicula, int duration, String imagen, String imagenSec, String sinopsis, int calificacion, Categoria categoria, String pais, Timestamp estreno, String directores, Timestamp fecha) {
		PeliculaDao pD = new PeliculaDao();
		Pelicula p = new Pelicula(nomPelicula,slug,idPelicula,duration, imagen, imagenSec, sinopsis, calificacion, categoria, pais,estreno, directores, fecha);

		pD.updatePelicula(p);
		
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

	public Timestamp getEstreno() {
		return estreno;
	}

	public void setEstreno(Timestamp estreno) {
		this.estreno = estreno;
	}

	public String getDirectores() {
		return directores;
	}

	public void setDirectores(String directores) {
		this.directores = directores;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	
}
