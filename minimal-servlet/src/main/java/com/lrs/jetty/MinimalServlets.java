package com.lrs.jetty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class MinimalServlets {
	public static void main(String[] args) throws Exception {

		Server server = new Server(8080);

		ServletHandler handler = new ServletHandler();

		handler.addServletWithMapping(SimpleServlet.class, "/*");

		server.setHandler(handler);

		server.start();
		server.join();

	}

	public static class SimpleServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html");
			res.setStatus(HttpServletResponse.SC_OK);
			res.getWriter().println("<h1>Hello Jetty!</h1>");
		}

	}
}
