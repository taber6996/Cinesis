package com.cinesis.servletController;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
import com.cinesis.model.Entrada;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "comprar-entrada", urlPatterns = {"/comprar-entrada"})
public class ComprarEntradaServlet extends Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComprarEntradaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String str_pelicula_id = request.getParameter("pelicula_id");
		
		Integer pelicula_id = Integer.parseInt(str_pelicula_id); 

		List<String> listaPelicula = new ArrayList<String>();
		
		listaPelicula.add("ContPeli");

		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr =	 parser.parse(listaPelicula);

		Pelicula pelicula =  (Pelicula) contr.read(pelicula_id);

		request.setAttribute("pelicula", pelicula);
		
	

		List<String> listsEntrada = new ArrayList<String>();
		
		listsEntrada.add("ContEntrada");

		ControllerParser parserEntrada = new ControllerParser();	
		
		ControllerInter contrEntrada =	 parserEntrada.parse(listsEntrada);		

		List<Object> entrada = contrEntrada.readByPelicula(pelicula_id);
		// Generamos lista para iterar
		Iterator<Object> entradasIT = entrada.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		
		while(entradasIT.hasNext()){
			entradas.add((Entrada) entradasIT.next());
		}

		request.setAttribute("pelicula", pelicula);
		request.setAttribute("entradas", entradas);
		
		getServletContext().getRequestDispatcher("/comprar_entradas.jsp").forward(request, response);
				
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
								
		List<String> listaEntrada = new ArrayList<String>();
		
		listaEntrada.add("ContEntrada");
		
		listaEntrada.add(request.getParameter("entrada_id"));
		
		listaEntrada.add("1");

		
		ControllerParser parser = new ControllerParser();	
	
		ControllerInter contr =	 parser.parse(listaEntrada);
		
		contr.insert(listaEntrada);
		
		// Una vez guardada, recuperamos los objectos necesarios
		String str_pelicula_id = request.getParameter("pelicula_id");
		
		Integer pelicula_id = Integer.parseInt(str_pelicula_id); 

		List<String> listaPelicula = new ArrayList<String>();
		
		listaPelicula.add("ContPeli");

		ControllerParser parserPeli = new ControllerParser();	
		
		ControllerInter contrPeli =	 parserPeli.parse(listaPelicula);

		Pelicula pelicula =  (Pelicula) contrPeli.read(pelicula_id);

		request.setAttribute("pelicula", pelicula);
		
	

		List<String> listsEntrada = new ArrayList<String>();
		
		listsEntrada.add("ContEntrada");

		ControllerParser parserEntrada = new ControllerParser();	
		
		ControllerInter contrEntrada =	 parserEntrada.parse(listsEntrada);		

		List<Object> entrada = contrEntrada.readByPelicula(pelicula_id);
		// Generamos lista para iterar
		Iterator<Object> entradasIT = entrada.iterator();
		
		// Generamos una lista para almacenar los nuevos objetos de la clase 
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		
		while(entradasIT.hasNext()){
			entradas.add((Entrada) entradasIT.next());
		}

		request.setAttribute("pelicula", pelicula);
		request.setAttribute("entradas", entradas);
		
		
		// Devolvemos a la vista Entrada
        request.setAttribute("error", "Entrada comprada");
        getServletContext().getRequestDispatcher("/comprar_entradas.jsp").forward(request, response);
			     
	}

}
