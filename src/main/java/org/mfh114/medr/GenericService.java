package org.mfh114.medr;

public interface GenericService {

	public <T extends DAOBroker> T getBroker();
	
}
