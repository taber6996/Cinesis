package com.cinesis.dao;

import java.sql.Connection;
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
   		   Statement stmt = conn.createStatement();
   		   String query = "INSERT INTO sala(num_filas,num_columnas,num_asientos_vip,num_asientos_minusvalidos,calidad_sonido,3d)  Values( '" + sala.getNumFilas() +" ',' "+ sala.getNumColumnas() +"',' "+ sala.getNumAsientosVIP()+" ',' "+ sala.getNumAsientosMinusvalidos() +" ',' "+ sala.getCalidadSonido() +" ',' "+ booleanToInt(sala.get_3D()) +"')";
   		   java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
   		   boolean b = preparedStmt.execute();
   		   System.out.println(b);
   		   stmt.close();
   		   conn.close();
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
		
	}
	
	public void updateSala(Sala sala){
			}
	
	public List<Sala> findAllSala(){
		return null;	}
	
	public Sala findById(Integer sala_id){
		return null;	}
	
	public Sala findByName(String sala_nombre) {
		return null;	}
}



