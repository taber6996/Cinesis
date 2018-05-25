package com.cinesis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cinesis.model.Trailer;
import com.cinesis.servicios.Conexion;

public class TrailerDao extends AbstractSession {
	
	public void saveTrailer(Trailer trailer){
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		   Statement stmt = conn.createStatement();
  		   String query = "INSERT INTO trailers(pelicula_id,titulo,descripcion) Values( '" + trailer.getIdPelicula() + "','" + trailer.getTitulo() +"')'" ;
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   boolean b = preparedStmt.execute();
  		   System.out.println(b);
  		   stmt.close();
  		   conn.close();
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  			  
  		  }
	}
	
	public void deleteTrailerById(Integer trailer_id){
		 Conexion cnx = new Conexion();
	    	Connection con = null;
	    	ResultSet rs = null;
	    	PreparedStatement pStatement = null;
	    	try {
				System.out.println("Hola que tal " + con);
	  	con = cnx.obtener();
	 	 
	  	System.out.println("Hola que tal " + con);
	 	String sql = "DELETE * FROM trailers WHERE id = 'trailer_id' ";
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
	
	public void updateTrailer(Trailer trailer){
		Conexion cnx = new Conexion();
    	Connection con = null;
    	ResultSet rs = null;
    	PreparedStatement pStatement = null;
    	try {
			System.out.println("Hola que tal " + con);
  	con = cnx.obtener();
 	 
  	System.out.println("Hola que tal " + con);
 	String sql = "UPDATE trailers pelicula_id = trailer.getIdPelicula(), titulo = trailer.getTitulo(), descripcion = trailer.getDescripcion() "
 			+ "WHERE id = trailer.getIdTrailer()";
			
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
	
	public List<Trailer> findAllTrailer(){
		List<Trailer> trailers = new ArrayList<Trailer>();
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM peliculas";
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		for(int i = 0;rs.next();i++) {
	   			Trailer trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   				
	   			trailers.add(i, trailer);
	   		}
	   		stmt.close();
	   		con.close();
	   	   }catch(ClassNotFoundException | SQLException e) {
	   	   
	   	   }
	   	   
	   	 return trailers;    

	}
	
	public Trailer findById(Integer trailer_id){
		Trailer trailer = null;
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM peliculas WHERE id = trailer_id";
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		
   			trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   		
	   		stmt.close();
	   		con.close();
	   	   }catch(ClassNotFoundException | SQLException e) {
	   	   
	   	   }
	   	   
	   	 return trailer;
	   	 }
	
	public Trailer findByName(String trailer_nombre) {
		Trailer trailer = null;
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM peliculas WHERE titulo = trailer_nombre";
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		
  			trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   		
	   		stmt.close();
	   		con.close();
	   	   }catch(ClassNotFoundException | SQLException e) {
	   	   
	   	   }
	   	   
	   	 return trailer;
	   	 }
	
	
	public List<Trailer> findAllTrailerByPeliculaId (Integer pelicula_id){
		List<Trailer> trailers = new ArrayList<Trailer>();
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM peliculas WHERE pelicula_id = pelicula_id";
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		for(int i = 0;rs.next();i++) {
	   			Trailer trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   				
	   			trailers.add(i, trailer);
	   		}
	   		stmt.close();
	   		con.close();
	   	   }catch(ClassNotFoundException | SQLException e) {
	   	   
	   	   }
	   	   
	   	 return trailers;  	   	 }
}
