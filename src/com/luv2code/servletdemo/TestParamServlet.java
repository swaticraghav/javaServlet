package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */

public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestParamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		String maxCartSize = context.getInitParameter("max-shopping-car-size");
		String teamName = context.getInitParameter("project-team-name");
		String welcome = getInitParameter("Arrival");
		String departure = getInitParameter("Departure");

		// set the content type
		response.setContentType("text/html");
		// get the printWriter object
		PrintWriter out = response.getWriter();
		// generate the HTML content
		out.println("Cart Size: " + maxCartSize + "<br/><br/><hr>");
		out.println("Team Name: " + teamName + "<br/>");
		out.println("Arrival: " + welcome);
		out.println("Departure: " + departure);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
