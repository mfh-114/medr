package org.mfh114.medr.servlet;

import java.io.IOException;

import javax.servlet.ServletContextListener;

import org.mfh114.medr.config.Log4J2Configurator;

public class Log4J2ConfigLoader implements ServletContextListener {

	private Log4J2Configurator log4J2Configurator;

	public Log4J2ConfigLoader() {
		this.log4J2Configurator = new Log4J2Configurator();
	}

	public void contextInitialized(javax.servlet.ServletContextEvent sce) {

		try {
			log4J2Configurator.load(sce.getServletContext());
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}

	}

	public void contextDestroyed(javax.servlet.ServletContextEvent sce) {
		log4J2Configurator.unload();
	}

}
