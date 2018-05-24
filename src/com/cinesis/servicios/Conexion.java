package com.cinesis.servicios;
import java.sql.*;

import org.apache.log4j.Logger;
public class Conexion {
    
    
    
   private static Connection cnx = null;
   
   
   
   
   
   public  Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinesis", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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