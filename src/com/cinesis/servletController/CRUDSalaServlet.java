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
import com.cinesis.controller.ControllerSala;
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "salas", urlPatterns = {"/salas"})
public class CRUDSalaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDSalaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<String> listaSala = new ArrayList<String>();
		
		listaSala.add("ContSala");
		ControllerParser parser = new ControllerParser();	
		
		ControllerInter contr =	 parser.parse(listaSala);
		
		getServletContext().getRequestDispatcher("/privado/salas.jsp").forward(request, response);
				
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
								
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
		
		ControllerParser parser = new ControllerParser();	
	
		ControllerInter contr =	 parser.parse(listaSala);

		contr.insert(listaSala);
		
		
		// Devolvemos a la vista Entrada
        request.setAttribute("error", "Sala creada");
        getServletContext().getRequestDispatcher("/privado/salas.jsp").forward(request, response);
			     
	}

}
