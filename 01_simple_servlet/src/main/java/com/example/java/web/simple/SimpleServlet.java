package com.example.java.web.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		try(PrintWriter pw = response.getWriter()){
			pw.write("Hello world\n");
			Enumeration<String> names = request.getHeaderNames();
			pw.write("\nHeaders\n");
			while(names.hasMoreElements()){
				String header = names.nextElement();
				pw.write(header + " = " + request.getHeader(header) + "\n");
			}
		}
	}
}
