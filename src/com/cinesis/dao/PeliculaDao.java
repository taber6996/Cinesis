package com.cinesis.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cinesis.model.Pelicula;
import com.cinesis.servicios.Conexion;

public class PeliculaDao extends AbstractSession{


	
    public void createPelicula(Pelicula peli){
    	  try { 
    		  Conexion cnx = new Conexion();
    		   Connection conn = cnx.obtener();
    		  // Statement stmt = conn.createStatement();
    		   String query = "INSERT INTO peliculas(nombre,slug,duracion,imagen_principal,imagen_secundario,sinopsis,calificacion,categoria,pais,estreno,director) Values( '" + peli.getNomPelicula() + "','" + peli.getSlug() +"','" + peli.getDuracion()+ "','" + peli.getImagenPrinc()+"','"+ peli.getImagenSec() +"','"+peli.getSinopsis()
    	        +"','"+peli.getCalificacion()+"','"+peli.getCategoria()+"','"+ peli.getPais()+"','"+ peli.getEstreno() +"','"+peli.getDirectores()+"')";
    		   System.out.println(query);
    		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
    		   boolean b = preparedStmt.execute();

    		//   preparedStmt.close();
    		//   conn.close();
    		  }catch(ClassNotFoundException | SQLException e) {
    			  System.out.println("nop" + e);
    			  
    		  }
    } 

	
	
	public void deletePeliculaById(Integer pelicula_id){
		try { 
	  		  Conexion cnx = new Conexion();
	  		   Connection conn = cnx.obtener();
	  		   //Statement stmt = conn.createStatement();
	  		   String query = "DELETE FROM peliculas WHERE id= " + pelicula_id;
	  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	  		   boolean b = preparedStmt.execute();
	  		   System.out.println(b);
	  		 //  stmt.close();
	  		//   conn.close();
	  		  }catch(ClassNotFoundException | SQLException e) {
	  			  System.out.println("nop" + e);
	  			  
	  		  }
	}
	
	public void updatePelicula(Pelicula pelicula){
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		  // Statement stmt ;//= conn.createStatement();
  		   String query = "UPDATE peliculas P Set id = '"+pelicula.getIdPelicula() +"', nombre = '" + pelicula.getNomPelicula() + "' , slug= '" + pelicula.getSlug() +
  				   "', duracion= '" + pelicula.getDuracion() +"', imagen_principal= '" + pelicula.getImagenPrinc() +"', imagen_secundario= '" + pelicula.getImagenSec() +
  				   "', sinopsis= '" + pelicula.getSinopsis() + "', calificacion= '" + pelicula.getCalificacion() + "', categoria='" + pelicula.getCategoria() +
  				   "', calificacion='"+ pelicula.getCalificacion() + "', categoria='" + pelicula.getCategoria() + "', pais= '"  + pelicula.getPais() +
  				   "', estreno= '" + pelicula.getEstreno() + "', director= '" + pelicula.getDirectores() + "' WHERE P.id = " + pelicula.getIdPelicula();
  		   
  		   
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   boolean b = preparedStmt.execute();
  		   System.out.println(b);
  		 //  stmt.close();
  		 //  conn.close();
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  			  
  		  }
		
	}
	
	public List<List<String>> findAllPeliculas(){
		ResultSet rs = null;
		List<List<String>> list = new ArrayList<List<String>>();
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		  // Statement stmt = conn.createStatement();
  		   String query = "SELECT * From peliculas";
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   rs = preparedStmt.executeQuery();
  		   while(rs.isLast())
  		   {
  			 //list.add(setDatosQuery(rs));
  			 rs.next();
  		   }
  		 //  stmt.close();
  		 //  conn.close();
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  		  }
		return list;
	}
	
	public List<String> findById(Integer pelicula_id)
	{
		ResultSet rs = null;
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		  // Statement stmt = conn.createStatement();
  		   String query = "SELECT * From peliculas P Where P.id = " + pelicula_id;
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   rs = preparedStmt.executeQuery();
  		  
  		  List<String> l = setDatosQuery(rs);
  	
  		//   stmt.close();
  		//   conn.close();
  		   return l;
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  		  }
		return null;
	}
	public List<String> setDatosQuery(ResultSet rs)
	{
		List<String> lPeli = new ArrayList<String>();
		try {
			rs.next();
			lPeli.add(String.valueOf(rs.getInt("id")));
			lPeli.add(rs.getString("nombre"));
			lPeli.add(rs.getString("slug"));
			lPeli.add(String.valueOf(rs.getInt("duracion")));
			lPeli.add(rs.getString("imagen_principal"));
			lPeli.add(rs.getString("imagen_secundario"));
			lPeli.add(rs.getString("sinopsis"));
			lPeli.add(String.valueOf(rs.getInt("calificacion")));
			lPeli.add(rs.getString("categoria"));
			lPeli.add(rs.getString("pais"));
			lPeli.add(rs.getTimestamp("estreno").toGMTString());
			lPeli.add(rs.getString("director"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lPeli;
	}
	
	public Pelicula findByName(String pelicula_nombre) {
		return null;	}

}