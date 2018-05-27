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

import com.cinesis.model.Entrada;
import com.cinesis.model.Pelicula;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "peliculas", urlPatterns = {"/peliculas"})
public class PeliculasServlet extends Servlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeliculasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Pelicula> peliculas = (ArrayList<Pelicula>) setAllPeliculas(request);
		
		// Generamos lista para iterar
		Iterator<Pelicula> it = peliculas.iterator();
		

		request.setAttribute("peliculas", peliculas);
		
		System.out.println(peliculas);
		
		getServletContext().getRequestDispatcher("/peliculas.jsp").forward(request, response);
				
	}

}
