package com.lrs.jetty;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

/**
 * 
 * Simple Jetty FileServer. This is a simple example of Jetty configured as a
 * FileServer.
 *
 */
public class SimpleServer {

	private static String getBasePath() {
		return SimpleServer.class.getResource("/static").getPath();
	}

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);

		ResourceHandler handler = new ResourceHandler();

		handler.setDirectoriesListed(true);
		handler.setWelcomeFiles(new String[] { "index.html" });
		handler.setResourceBase(getBasePath());

		HandlerList handlers = new HandlerList();

		handlers.setHandlers(new Handler[] { handler, new DefaultHandler() });

		server.setHandler(handlers);

		server.start();

		server.join();

	}
}
