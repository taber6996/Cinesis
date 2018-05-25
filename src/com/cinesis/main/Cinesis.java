package com.cinesis.main;



import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.cinesis.dao.PeliculaDao;
import com.cinesis.model.Pelicula;

public class Cinesis {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
	public static void main( String[] args)
	{
		/*Timestamp ahora = new Timestamp(System.currentTimeMillis());
	   // SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
	   // Date h = formateador.format(ahora);
		
		Pelicula P = new Pelicula("Vengadores", null, null, 100, null,null, "Sinopsis", 50, null, "Espa�a", ahora, "jhyhb", ahora);
		PeliculaDao pd = new PeliculaDao();
		
		//pd.createPelicula(P);
		
		Pelicula prueba = P.mostrarPelicula(2);
		
		System.out.print(prueba.getNomPelicula());*/
	}
}
