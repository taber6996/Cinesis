package com.cinesis.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
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
		
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContPeli");
		ControllerParser parser = new ControllerParser();	
		ControllerInter contr =	 parser.parse(lista);
		Pelicula pelicula =  (Pelicula) contr.read(1);
		
		System.out.println(pelicula.getNomPelicula());
	

	}
}
