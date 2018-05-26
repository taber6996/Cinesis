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
   
	}
	
	


}
