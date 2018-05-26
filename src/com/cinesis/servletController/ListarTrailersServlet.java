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
import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

import jdk.nashorn.internal.runtime.ListAdapter;

@WebServlet(name = "entradas", urlPatterns = {"/entradas"})
public class ListarTrailersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarTrailersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		getServletContext().getRequestDispatcher("/privado/listado-trailer.jsp").forward(request, response);
				
	}

}
