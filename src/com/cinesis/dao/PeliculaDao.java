package com.cinesis.dao;

import java.sql.*;
import java.util.List;

import com.cinesis.model.Pelicula;
import com.cinesis.model.Trailer;
import com.cinesis.servicios.Conexion;

public class PeliculaDao extends AbstractSession{


	
	public void createPelicula(Pelicula peli){
            
            Conexion cnx = new Conexion();
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pStatement = null;
            
           
             try {
            	   System.out.println("Hola que tal " + con);
             con = cnx.obtener();
             
             System.out.println("Hola que tal " + con);
            String sql = "INSERT INTO peliculas(nombre,slug,duracion,imagen_principal,imagen_secundaria,"
                    + "sinopsis,calificacion,categoria,pais,estreno,director) Values(peli.getNomPelicula(),peli.getSlug(),peli.getDuracion(),peli.getImagenPrinc(),peli.getImagenSec(),"
                    + "peli.getSinopsis(),peli.getCalificacion(),peli.getCategoria(), peli.getPais(), peli.getEstreno(), peli.getDirectores())";
            pStatement = con.prepareStatement(sql);
            rs = pStatement.executeQuery();
           
        } catch (Exception e) {
            System.out.println("Error en la obtencion del codigo: ");
        }
        try {
            rs.close();
            pStatement.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error en el cierre de la base de datos");
        }
            
    
		
	}
	
	
	public void deletePeliculaById(Integer pelicula_id){
		
	}
	
	public void updatePelicula(Pelicula pelicula){
	
	}
	
	public List<Pelicula> findAllPeliculas(){
		return null;	}
	
	public Pelicula findById(Integer pelicula_id){
		return null;	}
	
	public Pelicula findByName(String pelicula_nombre) {
		return null;	}

}