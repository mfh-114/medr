package org.mfh114.medr.unit.authn;

import org.mfh114.medr.authn.dao.AuthnDataBroker;
import org.mfh114.medr.authn.dto.UserDTO;

public class AuthnDataBrokerStub implements AuthnDataBroker {

	@Override
	public UserDTO getUser(String username, String password) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setLoginId("login1");
		userDTO.setPasswrd("123");
		userDTO.setUserName("Test test");
		
		return userDTO;
	}

}
