package org.mfh114.medr.authn.dao;

import org.mfh114.medr.authn.dto.UserDTO;

public interface AuthnDataBroker {

	public UserDTO getUser(String username, String password);

	
}
