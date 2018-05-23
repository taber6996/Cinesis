package com.cinesis.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		/**
		 * En este ejemplo mandamos datos a la vista, entiendo que esto lo podemos colocar dentro de cada controller y dejar aquí el primario que inicia el servidor
		 * También manda la variable person cn reqeust a la vista
		 * Terminar de ver este vídeo
		 * 
		 * https://www.youtube.com/watch?v=B-N5X90qizQ
		 */
		PersonBeanModel person = new PersonBeanModel();
		person.setName("name");
		person.setEmail(request.getParameter("email"));
		person.doSomething();
		request.setAttribute("person", person);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		
		(**)
		
		

	}

}
