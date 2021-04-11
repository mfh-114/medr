package org.mfh114.medr.servlet;

import org.infinispan.Cache;

public interface CacheReader<String, Object> {

	public Cache<String, Object> getReader();
	
}
