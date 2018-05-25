package com.cinesis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import com.cinesis.model.Sala;
import com.cinesis.servicios.Conexion;



public class SalaDao extends AbstractSession{
	
	

	public void saveSala(Sala sala){
		
		 try { 
   		  Conexion cnx = new Conexion();
   		   Connection conn = cnx.obtener();
   		  // Statement stmt = conn.createStatement();
   		   String query = "INSERT INTO sala(num_filas,num_columnas,num_asientos_vip,num_asientos_minusvalidos,calidad_sonido,3d)  Values( '" + sala.getNumFilas() +" ',' "+ sala.getNumColumnas() +"',' "+ sala.getNumAsientosVIP()+" ',' "+ sala.getNumAsientosMinusvalidos() +" ',' "+ sala.getCalidadSonido() +" ',' "+ booleanToInt(sala.get_3D()) +"')";
   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
   		   boolean b = preparedStmt.execute();
   		   System.out.println(b);
   		  // stmt.close();
   		   //conn.close();
   		  }catch(ClassNotFoundException | SQLException e) {
   			  System.out.println("nop" + e);
   			  
   		  }
		
		
	}
	
	public int booleanToInt(boolean siono){
		if(siono)
			return 1;
		
		return 0;
	}
	
	public void deleteSalaById(Integer sala_id){
		
		 try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "DELETE FROM sala  WHERE id = '" + sala_id + "'";
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		  // stmt.close();
	   		  // conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
		
		
		
		
	}
	
	public void updateSala(Sala sala){
		
		
		 try { 
	   		  Conexion cnx = new Conexion();
	   		   Connection conn = cnx.obtener();
	   		  // Statement stmt = conn.createStatement();
	   		   String query = "UPDATE sala S SET S.id = '"+ sala.getIdSala() +"', S.num_filas ='" + sala.getNumFilas() +" ', S.num_columnas =' "+ sala.getNumColumnas() +"', S.num_asientos_vip =' "+ sala.getNumAsientosVIP()+" ', S.num_asientos_minusvalidos =' "+ sala.getNumAsientosMinusvalidos() +" ', S.calidad_sonido =  ' "+ sala.getCalidadSonido() +" ',S.3d =' "+ booleanToInt(sala.get_3D()) +"' ";
	   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
	   		   boolean b = preparedStmt.execute();
	   		   System.out.println(b);
	   		   //stmt.close();
	   		   //conn.close();
	   		  }catch(ClassNotFoundException | SQLException e) {
	   			  System.out.println("nop" + e);
	   			  
	   		  }
			}
	        
	        
	        
	        
	        
	
	public List<Sala> findAllSala(){
		return null;	}
	
	
	
	
	
	
	public ResultSet findById(Integer sala_id){
		ResultSet rs = null;
		try { 
  		  Conexion cnx = new Conexion();
  		   Connection conn = cnx.obtener();
  		   //Statement stmt = conn.createStatement();
  		   String query = "SELECT * From sala S Where S.id = '" + sala_id + "'";
  		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
  		   rs = preparedStmt.executeQuery();
  		   if (rs.getRow() == 1)
  		   {
  		   }
  		 //  stmt.close();
  		  }catch(ClassNotFoundException | SQLException e) {
  			  System.out.println("nop" + e);
  			  
  		  }
		return rs;
		
		
	
	}
	
	
}



