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

import com.cinesis.controller.Controller;
import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerPelicula;
import com.cinesis.controller.ControllerSala;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "form", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		// Comprobamos el tipo de post que hacemos
		String crearObjeto = request.getParameter("type_form");
		
		switch (crearObjeto) {
		case "pelicula":
			
			List<String> listaPelicula = new ArrayList<String>();
			
			listaPelicula.add("ContPeli");
			// nombre
			listaPelicula.add(request.getParameter("nombre"));
			// Slug
			listaPelicula.add(request.getParameter("nombre"));
			// Duración
			listaPelicula.add(request.getParameter("duracion"));
			
			listaPelicula.add(request.getParameter("imagen_principal"));
			
			listaPelicula.add(request.getParameter("imagen_secundario"));
			
			listaPelicula.add(request.getParameter("sinopsis"));
			
			listaPelicula.add(request.getParameter("calificacion"));
			
			listaPelicula.add(request.getParameter("categoria"));
			
			listaPelicula.add(request.getParameter("pais"));
			
			listaPelicula.add(request.getParameter("estreno"));
			
			listaPelicula.add(request.getParameter("director"));
			
			listaPelicula.add(request.getParameter("estreno"));
					
			Controller controllerPelicula = new Controller();
			
			controllerPelicula.run(listaPelicula);
			
			// Devolvemos a la vista pelis
	        request.setAttribute("error", "Película creada");
	        getServletContext().getRequestDispatcher("/privado/crear-pelicula.jsp").forward(request, response);
		    	    
			break;
		case "entrada":
			
			List<String> listaEntrada = new ArrayList<String>();
			
			listaEntrada.add("ContEntrada");
			// nombre
			listaEntrada.add(request.getParameter("sala_id"));
			// Slug
			listaEntrada.add(request.getParameter("user_id"));
			// Duración
			listaEntrada.add(request.getParameter("pelicula_id"));
			
			listaEntrada.add(request.getParameter("precio"));
			
			listaEntrada.add(request.getParameter("numeroAsiento"));
			
			listaEntrada.add(request.getParameter("horario"));
			
			Controller controllerEntrada = new Controller();
			
			controllerEntrada.run(listaEntrada);
			
			// Devolvemos a la vista Entrada
	        request.setAttribute("error", "Entrada creada");
	        getServletContext().getRequestDispatcher("/privado/crear-entrada.jsp").forward(request, response);
			
								
			break;
		case "sala":
								
			List<String> listaSala = new ArrayList<String>();
			
			listaSala.add("ContSala");
			// nombre
			listaSala.add(request.getParameter("num_filas"));
			// Slug
			listaSala.add(request.getParameter("num_columnas"));
			// Duración
			listaSala.add(request.getParameter("num_asientos_vip"));
			listaSala.add(request.getParameter("num_asientos_minusvalidos"));
			listaSala.add(request.getParameter("calidad_sonido"));
			listaSala.add(request.getParameter("3d"));
			
			
			Controller controllerSalaCommand = new Controller();
			
			ControllerSala controllerSala = (ControllerSala) controllerSalaCommand.run(listaSala);
			
			controllerSala.insert(listaSala);
			
			// Devolvemos a la vista Entrada
	        request.setAttribute("error", "Sala creada");
	        getServletContext().getRequestDispatcher("/privado/crear-sala.jsp").forward(request, response);
			
			break;
		case "trailer":
					
			
			List<String> listaTrailer = new ArrayList<String>();
			
			listaTrailer.add("ContTrailer");
			// nombre
			listaTrailer.add(request.getParameter("pelicula_id"));
			// Slug
			listaTrailer.add(request.getParameter("titulo"));
			// Duración
			listaTrailer.add(request.getParameter("descripcion"));

			
			
			Controller controllerTrailer = new Controller();
			
			controllerTrailer.run(listaTrailer);
			
			// Devolvemos a la vista Entrada
	        request.setAttribute("error", "Trailer creada");
	        getServletContext().getRequestDispatcher("/privado/crear-trailer.jsp").forward(request, response);
	        
			break;

		default:
			break;
		}
	        
	}
	
	


}
