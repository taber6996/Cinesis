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
	
	private Observador OBSERVABLE;
	private Observable s;
	
	public void saveTrailer(Trailer trailer){
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		   //Statement stmt = conn.createStatement();
  		   String query = "INSERT INTO trailers(pelicula_id,titulo,descripcion) Values( '" + trailer.getIdPelicula() + "','" + trailer.getTitulo() +"','"+ trailer.getDescripcion() +"')" ;
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   boolean b = preparedStmt.execute();
  		   System.out.println(b);
  		   //stmt.close();
  		   //conn.close();
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  			  
  		  }
		   OBSERVABLE = new Observador();
   		    s = new Observable();
   		    
   		   synchronized (OBSERVABLE){
   			   OBSERVABLE.insert(s, this);		   
   		   }
	}
	
	public void deleteTrailerById(Integer trailer_id){
		 Conexion cnx = new Conexion();
		Connection con = null;
		//ResultSet rs = null;
		java.sql.PreparedStatement pStatement = null;
	    	try {
				//System.out.println("Hola que tal " + con);
	  	con = cnx.obtener();
	 	 
	 	String sql = "DELETE * FROM trailers WHERE id =" + trailer_id;
	 	pStatement = con.prepareStatement(sql);
	 	//rs = pStatement.executeQuery();
	    
	     } catch (Exception e) {
	     	System.out.println("Error en la obtencion del codigo: ");
	     }
	     try {
	     	//rs.close();
	     	//pStatement.close();
	     	//con.close();
	     } catch (Exception ex) {
	     	System.out.println("Error en el cierre de la base de datos");
	     }
		 

		
	}
	
	public void updateTrailer(Trailer trailer){
		Conexion cnx = new Conexion();
    	Connection con = null;
    	//ResultSet rs = null;
    	java.sql.PreparedStatement pStatement = null;
    	try {

		  	con = cnx.obtener();
		 	 
		 	String sql = "UPDATE trailers SET pelicula_id = '"+trailer.getIdPelicula()+"', titulo = '"+trailer.getTitulo()+"' , descripcion = '" + trailer.getDescripcion() +"' WHERE id =" + trailer.getIdTrailer();
		 			
					
		 	pStatement = con.prepareStatement(sql);
		 	boolean b = pStatement.execute();
	  		System.out.println(b);
		 	//rs = pStatement.executeQuery();
    
     } catch (Exception e) {
     	System.out.println("Error en la obtencion del codigo: ");
     }
		   OBSERVABLE = new Observador();
   		    s = new Observable();
   		    
   		   synchronized (OBSERVABLE){
   			   OBSERVABLE.update(s, this);		   
   		   }
    /* try {
     	//rs.close();
     	//pStatement.close();
     	//con.close();
     } catch (Exception ex) {
     	System.out.println("Error en el cierre de la base de datos");
     }*/

	}
	
	public List<List<String>> findAllTrailer(){
		ResultSet rs = null;
		List<List<String>> list = new ArrayList<List<String>>();
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 java.sql.PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM trailers";
	   		java.sql.PreparedStatement preparedStmt = con.prepareStatement(sql);
	  		   rs = preparedStmt.executeQuery();

	  			 while(rs.next())
	  			 {
	  				 list.add(setDatosQuery(rs));
	  			 }
	  		  }catch(ClassNotFoundException | SQLException e) {
	  			  System.out.println("nop" + e);
	  		  }
			return list;

	}
public List<String> setDatosQuery(ResultSet rs)
{
	List<String> lTrailer = new ArrayList<String>();
	try {
	//	rs.next();
		//String s = rs.getString("s");
		lTrailer.add(String.valueOf(rs.getInt("id")));
		lTrailer.add(String.valueOf(rs.getInt("pelicula_id")));
		lTrailer.add(rs.getString("titulo"));
		lTrailer.add(rs.getString("descripcion"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return lTrailer;
}
	
	public Trailer findById(Integer trailer_id){
		Trailer trailer = null;
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 java.sql.PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM trailers WHERE id =" + trailer_id;
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		
   			trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   		
	   		//stmt.close();
	   		//con.close();
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
	   		String sql = "SELECT * FROM trailers WHERE titulo =" + trailer_nombre;
	   		stmt = con.prepareStatement(sql);

	   		ResultSet rs = stmt.executeQuery(sql);
	   		
  			trailer = new Trailer(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
	   		
	   		//stmt.close();
	   		//con.close();
	   	   }catch(ClassNotFoundException | SQLException e) {
	   	   
	   	   }
	   	   
	   	 return trailer;
	   	 }
	
	
	public List<List<String>> findAllTrailerByPeliculaId (Integer pelicula_id){
		List<List<String>> trailers = new ArrayList<List<String>>();
			ResultSet rs = null;
	   	 Conexion cnx = new Conexion();
	   	 Connection con = null;
	   	 PreparedStatement stmt = null;
	   	   try {
	   	    
	   		//Statement stmt = cnx.prepareStatement();
	   		  con =     cnx.obtener();
	   		String sql = "SELECT * FROM trailers WHERE pelicula_id = pelicula_id";
	   		stmt = con.prepareStatement(sql);

	   		java.sql.PreparedStatement preparedStmt = con.prepareStatement(sql);
	  		rs = preparedStmt.executeQuery();

	  		while(rs.next())
	  			 {
	  			trailers.add(setDatosQuery(rs));
	  			 }
	  		  }catch(ClassNotFoundException | SQLException e) {
	  			  System.out.println("nop" + e);
	  		  }
			return trailers;
			}
}
