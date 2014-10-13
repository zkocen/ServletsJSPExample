package com.exampleTut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if ((request.getParameter("firstName") == null) || (request.getParameter("lastName") == null)) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");		
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

}
