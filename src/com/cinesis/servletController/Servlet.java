package com.cinesis.servletController;

import java.util.ArrayList;
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

	protected void setAllEntradas(HttpServletRequest request)
	{
		List<String> listaEntradas = new ArrayList<String>();
		
		listaEntradas.add("ContEntrada");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr = parser.parse(listaEntradas);
		
		List<Entrada> entradas = contr.readALL();
		
		request.setAttribute("entradas", entradas);
	}
	
	protected void setAllPeliculas(HttpServletRequest request)
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContPeli");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr = parser.parse(lista);
		
		List<Pelicula> peliculas = contr.readAll();
		
		request.setAttribute("peliculas", peliculas);
	}
	
	protected void setAllTrailer(HttpServletRequest request)
	{
		List<String> lista = new ArrayList<String>();
		
		lista.add("ContTrailer");
		
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr = parser.parse(lista);
		
		List<Trailer> trailers = contr.readALL();
		
		request.setAttribute("trailers", trailers);
	}
	
	
	protected void setAllSalas(HttpServletRequest request)
	{
		List<String> listaSalas = new ArrayList<String>();
		
		listaSalas.add("ContSala");
		
		ControllerParser parserSala = new ControllerParser();	
		
		ControllerInter contrSala =  parserSala.parse(listaSalas);
		
		List<Sala> salas = contrSala.readALL();
		
		request.setAttribute("salas", salas);
	}
}
