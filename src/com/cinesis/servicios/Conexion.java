package com.cinesis.servicios;
import java.sql.*;

//import org.apache.log4j.Logger;
public class Conexion {
     
   private static Connection cnx = null;
   
   public  Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
        	Class.forName("com.mysql.jdbc.Driver");
        	
        	String cadcon="jdbc:mysql://localhost:8889/cinesis";
        	String user="root";
        	String password="root";
        	
            cnx = DriverManager.getConnection(cadcon, cadcon, password);
         } catch (SQLException ex) {
        	System.out.println("Error sql: "+ex.getMessage());
        	//ex.printStackTrace();
            //throw new SQLException(ex); 
         } catch (ClassNotFoundException ex) {
        	 System.out.println("Error class: "+ex.getMessage());
            throw new ClassCastException(ex.getMessage());
         } catch (Exception ex){
    	   System.out.println("Error: "+ex.getMessage());
    	}
      }
      return cnx;
   }
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
   
   
   
 
}