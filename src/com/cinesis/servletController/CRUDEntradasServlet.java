package com.cinesis.servletController;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinesis.controller.ControllerEntrada;
import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
import com.cinesis.controller.ControllerPelicula;
import com.cinesis.model.Entrada;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Sala;
import com.cinesis.model.Trailer;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "entradas", urlPatterns = {"/entradas"})
public class CRUDEntradasServlet extends Servlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDEntradasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		List<Sala> salas = setAllSalas(request);
		List<Pelicula> peliculas = setAllPeliculas(request);
		List<Entrada> entradas = setAllEntradas(request);

		request.setAttribute("salas", salas);
		request.setAttribute("peliculas", peliculas);
		request.setAttribute("entradas", entradas);


		getServletContext().getRequestDispatcher("/privado/entradas.jsp").forward(request, response);
				
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			
			List<String> listaEntrada = new ArrayList<String>();
			
			listaEntrada.add("ContEntrada");
			// nombre
			listaEntrada.add(request.getParameter("sala_id"));
			// Duración
			listaEntrada.add(request.getParameter("pelicula_id"));
			
			listaEntrada.add(request.getParameter("precio"));
			
			listaEntrada.add(request.getParameter("numeroAsiento"));
			
			listaEntrada.add(request.getParameter("horario"));
			
			ControllerParser parser = new ControllerParser();	
	
			ControllerInter contr =	 parser.parse(listaEntrada);

			contr.crearEntrada(listaEntrada);
			
			// Devolvemos a la vista Entrada
	        request.setAttribute("error", "Entrada creada");
			
	        List<Sala> salas = setAllSalas(request);
			List<Pelicula> peliculas = setAllPeliculas(request);
			List<Entrada> entradas = setAllEntradas(request);

			request.setAttribute("salas", salas);
			request.setAttribute("peliculas", peliculas);
			request.setAttribute("entradas", entradas);
			
			System.out.println("retorna");
		
			getServletContext().getRequestDispatcher("/privado/entradas.jsp").forward(request, response);
	}
	
	
	

}
