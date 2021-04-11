package org.mfh114.medr.servlet;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;

public enum CacheCurator implements CacheReader<String, Object> {
	
	INSTANCE;
	
	private Cache<String, Object> cache;
	private CacheCurator() {
		init();
	}
	
	private void init() {
		Object obj = null;
		try {
			
			InitialContext ctx = new InitialContext();
			obj = ctx.lookup("java:comp/env/infinispan/DataCache");
			
			if (obj instanceof EmbeddedCacheManager) {
				System.out.println("Cache manager....");
				Cache<String, Object> cache = ((EmbeddedCacheManager) obj).getCache("local");
				
				
			} else {
				System.out.println("No Cache manager....");
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Cache<String, Object> getReader() {
		return cache;
	}

}
