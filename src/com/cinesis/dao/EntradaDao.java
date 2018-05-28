package com.cinesis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.cinesis.model.Entrada;
import com.cinesis.model.Trailer;
import com.cinesis.servicios.Conexion;

public class EntradaDao {
	
	public void saveEntrada(Entrada entrada){
		try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "INSERT INTO entrada(sala_id,user_id,pelicula_id,precio,numeroAsiento,horario)  Values('"+entrada.getIdSala()+"', NULL,'"+entrada.getIdPelicula()+"','"+entrada.getPrecio()+"','"+entrada.getNumeroAsiento()+"','"+entrada.getHorario()+"')";
	   			   		   
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		  // stmt.close();
	   		   //conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
	}
	
	public void deleteEntradaById(Integer entrada_id){

		 try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "DELETE FROM entrada  WHERE id = '" + entrada_id + "'";
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		  // stmt.close();
	   		  // conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
		
		
	}
	
	public void updateEntrada(Entrada entrada){
		
		 try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "UPDATE entrada E SET E.id = '"+ entrada.getIdEntrada() +"', E.sala_id ='" + entrada.getIdSala() +" ', E.user_id =' "+ entrada.getIdUsuario() +"', E.pelicula_id =' "+ entrada.getIdPelicula()+" ', E.precio =' "+ entrada.getPrecio()+" ', E.numeroAsiento =  ' "+ entrada.getNumeroAsiento()+" ',E.horario =' "+ entrada.getHorario()+"' ";
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		   //stmt.close();
	   		   //conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
	}
	
	public void compraEntrada(Entrada entrada){
		
		 try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "UPDATE entrada E SET E.user_id =' "+ entrada.getIdUsuario() +"' WHERE `entrada`.`id` = " + entrada.getIdEntrada() + ";";
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		   //stmt.close();
	   		   //conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
	}
	
	
	
	public List<String> findById(Integer entrada_id){
		ResultSet rs = null;
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		   //Statement stmt = conn.createStatement();
  		   String query = "SELECT * From entrada E Where E.id = '"+entrada_id+"'";
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   rs = preparedStmt.executeQuery();
  		 rs.next();
  		 List<String> E = setDatosQuery(rs);
  		   return E;
  		   
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  			  
  		  }
		return null;
		
		 
	}
	
	
	
	
	public List<List<String>> findByIdPelicula(Integer pelicula_id){
		
		ResultSet rs = null;
		
		List<List<String>> list = new ArrayList<List<String>>();
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		 
  		   String query = "SELECT * From entrada Where E.pelicula_id = '"+pelicula_id+"'";
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
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
	
	
	public List<List<String>> findAllEntradas(){
		ResultSet rs = null;
		List<List<String>> list = new ArrayList<List<String>>();
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		 
  		   String query = "SELECT * From entrada";
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
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
	

	public List<Entrada> findAllEntradaBySalaId (Integer sala_id){
		return null;
	
	}
	
	
	public List<String> setDatosQuery(ResultSet rs)
	{
		List<String> lEntrada = new ArrayList<String>();
		try {
			lEntrada.add(String.valueOf(rs.getInt("id")));
			lEntrada.add(String.valueOf(rs.getInt("sala_id")));
			lEntrada.add(String.valueOf(rs.getInt("user_id")));
			lEntrada.add(String.valueOf(rs.getInt("pelicula_id")));
			lEntrada.add(String.valueOf(rs.getInt("precio")));
			lEntrada.add(String.valueOf(rs.getInt("horario")));
			lEntrada.add(String.valueOf(rs.getInt("numeroAsiento")));
			lEntrada.add(String.valueOf(rs.getInt("horario")));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lEntrada;
	}
	

}


/**
 * 
 * 
 * CREATE TABLE `entrada` (
  `id` int(11) NOT NULL,
  `sala_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pelicula_id` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `numeroAsiento` varchar(5) DEFAULT NULL,
  `horario` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT NULL

 * 
 * 
 * /
 */