package org.mfh114.medr.servlet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextListener;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;

public class CacheServletContextListener implements ServletContextListener {

	Cache<String, Object> cache;
	
	public CacheServletContextListener() {
		this.cache = null;
	}

	public void contextInitialized(javax.servlet.ServletContextEvent sce) {
		
		//  java:jboss/infinispan/<name-of-container>/<name-of-cache>
		
		
		Object obj = null;
		try {
			
			InitialContext ctx = new InitialContext();
			
			//https://github.com/wildfly-extras/wildfly-camel/issues/1933
			obj = ctx.lookup("java:comp/env/infinispan/DataCache");
			
			if (obj instanceof EmbeddedCacheManager) {
				System.out.println("Cache manager....");
				this.cache = ((EmbeddedCacheManager) obj).getCache("local");
				
			} else {
				System.out.println("No Cache manager....");
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void contextDestroyed(javax.servlet.ServletContextEvent sce) {
		if(cache != null) {
			this.cache.clear();
			this.cache = null;
		}
	}
	
}
