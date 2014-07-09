package com.example.java.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.web.util.TilesDispatchServlet;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see TilesDispatchServlet#TilesDispatchServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("model", new User("Péter","Budapest"));
		
		req.getRequestDispatcher("home.tile").forward(req, resp);
	}

}
