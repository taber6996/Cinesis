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
		PersonBeanModel person = new PersonBeanModel();
		person.setName(request.getParameter("name"));
		person.setEmail(request.getParameter("email"));
		person.doSomething();
		//request.setAttribute("person", person);
		//getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		request.setAttribute("name", "nombre");
		request.setAttribute("email", "email");
		RequestDispatcher miDispatcher = request.getRequestDispatcher("index.jsp");
		
		miDispatcher.forward(request, response);

	}

}
