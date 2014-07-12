package com.example.java.web.annotated;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotated servlets don't require web.xml definition
//name parameter should be used if you want to reference the servlet in web.xml
//avaliable Servlet 3.0+
@WebServlet(value = "/annotated/parameterized", name = "AnnotetedParameterizedServlet", initParams = {
		@WebInitParam(name = "param1", value = "param1Value"), @WebInitParam(name = "param2", value = "param2Value") })
public class ParameterizedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		try (PrintWriter pw = response.getWriter()) {
			pw.write("Hello world\n");
			Enumeration<String> names = request.getHeaderNames();
			pw.write("\nHeaders\n");
			while (names.hasMoreElements()) {
				String header = names.nextElement();
				pw.write(header + " = " + request.getHeader(header) + "\n");
			}

			pw.write("\nInit parameters\n");
			// names and parameters also can be accesed via
			// getServletConfig().getInitParameterNames()
			Enumeration<String> initParameterNamess = getInitParameterNames();
			while (initParameterNamess.hasMoreElements()) {
				String name = initParameterNamess.nextElement();
				pw.write(name + " = " + getInitParameter(name) + "\n");
			}
		}
	}
}
