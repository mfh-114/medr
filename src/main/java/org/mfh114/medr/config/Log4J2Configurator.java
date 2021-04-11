package org.mfh114.medr.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.AbstractMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;

public class Log4J2Configurator {

	private LoggerContext ctx;

	public Log4J2Configurator() {
		this.ctx = null;
	}

	/***
	 * Load external configuration file and get logger context.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void load(ServletContext servletContext) throws FileNotFoundException, IOException {

		String log4jConfigFile = System.getProperty("jboss.server.config.dir") + File.separator + File.separator
				+ "apps" + File.separator + "medr" + File.separator + "log4j2.xml";

		String name = "medr";
		File logConfigFile = new File(log4jConfigFile);
		URI uri = logConfigFile.toURI();

		this.ctx = Configurator.initialize(name, null, uri);

		System.out.println("Successfully Log4J2 LoggerContext initialized.");

		this.ctx.start();

	}

	/***
	 * Shutdown the given logger context.
	 */
	public void unload() {

		if (this.ctx != null) {
			this.ctx.stop();
			System.out.println("Successfully Log4J2 LoggerContext shutdown.");
		}

	}

}
