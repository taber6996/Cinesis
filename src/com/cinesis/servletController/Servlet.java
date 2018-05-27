package com.cinesis.servletController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
import com.cinesis.model.Entrada;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;
import com.cinesis.model.Trailer;

public class Servlet extends HttpServlet {

	protected  List<Entrada> setAllEntradas(HttpServletRequest request)
	{
		
		// Declaramos la lista donde indicamos el controlelr al que atacar
		List<String> listaEntradas = new ArrayList<String>();
		
		// Indicamos el controller
		listaEntradas.add("ContEntrada");
		
		// invocamos al parse
		ControllerParser parser = new ControllerParser();	
		
		// Sacamos nuestro controller
		ControllerInter contr = parser.parse(listaEntradas);
		
		// Recogemos todos los elementos
		List<Object> entradasObj = contr.readAll();
		
		// Generamos lista para iterar
		Iterator<Object> it = entradasObj.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		
		while(it.hasNext()){
			entradas.add((Entrada) it.next());
		}
		
		return entradas;
	}
	
	protected  List<Pelicula> setAllPeliculas(HttpServletRequest request)
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContPeli");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr = parser.parse(lista);
		
		// Recogemos todos los elementos
		List<Object> peliculasObj = contr.readAll();
		
		// Generamos lista para iterar
		Iterator<Object> it = peliculasObj.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		while(it.hasNext()){
			peliculas.add((Pelicula) it.next());
		}
				
		return peliculas;
		
	}
	
	protected  List<Trailer> setAllTrailer(HttpServletRequest request)
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContTrailer");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr = parser.parse(lista);
		System.out.println(parser);
		
		// Recogemos todos los elementos
		List<Object> trailerObj = contr.readAll();
		
		// Generamos lista para iterar
		Iterator<Object> it = trailerObj.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Trailer> trailers = new ArrayList<Trailer>();
		
		while(it.hasNext()){
			trailers.add((Trailer) it.next());
		}

		return trailers;
		
	}
	
	
	protected List<Sala> setAllSalas(HttpServletRequest request)
	{
		List<String> listaSalas = new ArrayList<String>();
		
		listaSalas.add("ContSala");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr =  parser.parse(listaSalas);
		
		// Recogemos todos los elementos
		List<Object> salasObj = contr.readAll();
		
		// Generamos lista para iterar
		Iterator<Object> it = salasObj.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Sala> salas = new ArrayList<Sala>();
		
		while(it.hasNext()){
			salas.add((Sala) it.next());
		}
		
		return salas;
		
	}
}
