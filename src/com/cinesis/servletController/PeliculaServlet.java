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
import com.cinesis.controller.ControllerParser;
import com.cinesis.model.Pelicula;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "pelicula", urlPatterns = {"/pelicula"})
public class PeliculaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeliculaServlet() {
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
		
		getServletContext().getRequestDispatcher("/pelicula.jsp").forward(request, response);
				
	}

}
