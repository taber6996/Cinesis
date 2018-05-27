package com.cinesis.servicios;
import java.sql.*;

//import org.apache.log4j.Logger;
public class Conexion {
     
   private static Connection cnx = null;
   
   public  Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	String cadcon="jdbc:mysql://127.0.0.1:8889/cinesis?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        	String user = "root";
        	String password = "root";

            cnx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/cinesis?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
         } catch (SQLException ex) {
        	System.out.println("Error sql: "+ex.getMessage());
        	ex.printStackTrace();
            throw new SQLException(ex); 
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