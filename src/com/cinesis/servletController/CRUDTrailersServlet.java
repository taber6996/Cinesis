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

import com.cinesis.controller.ControllerInter;
import com.cinesis.controller.ControllerParser;
import com.cinesis.controller.ControllerPelicula;
import com.cinesis.controller.ControllerSala;
import com.cinesis.controller.ControllerTrailer;
import com.cinesis.model.Pelicula;
import com.cinesis.model.Trailer;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "trailers", urlPatterns = {"/trailers"})
public class CRUDTrailersServlet extends Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDTrailersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		setAllTrailer(request);
		setAllPeliculas(request);
		
		getServletContext().getRequestDispatcher("/privado/trailers.jsp").forward(request, response);
				
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			List<String> listaTrailer = new ArrayList<String>();
			
			listaTrailer.add("ContTrailer");
			// nombre
			listaTrailer.add(request.getParameter("pelicula_id"));
			// Slug
			listaTrailer.add(request.getParameter("titulo"));
			// Duración
			listaTrailer.add(request.getParameter("descripcion"));

			
			ControllerParser parser = new ControllerParser();	
			
			ControllerInter contr =	 parser.parse(listaTrailer);
		
			contr.insert(listaTrailer);

			setAllTrailer(request);
			setAllPeliculas(request);
			

	        request.setAttribute("error", "Trailer creada");
	        getServletContext().getRequestDispatcher("/privado/trailers.jsp").forward(request, response);
   
	}

}
