package org.mfh114.medr.authn.service;

import org.mfh114.medr.authn.dao.AuthnDataBroker;
import org.mfh114.medr.authn.dao.AuthnDataBrokerImpl;
import org.mfh114.medr.authn.domainBean.AuthnRequest;
import org.mfh114.medr.authn.domainBean.AuthnResponse;
import org.mfh114.medr.authn.dto.UserDTO;

public class AuthenticationService implements AuthnService {

	@Override
	public AuthnResponse authenticate(AuthnRequest authnRequest) {

		String userName = authnRequest.getUserName();
		String passwd = authnRequest.getPassword();

		UserDTO user = getAuthnDAOBroker().getUser(userName, passwd);

		AuthnResponse res = new AuthnResponse();
		if (user == null) {
			res.setIsCrendentialValid(false);
		} else {
			res.setIsCrendentialValid(true);
		}

		return res;
	}

	@Override
	public AuthnDataBroker getAuthnDAOBroker() {
		// TODO Auto-generated method stub
		return new AuthnDataBrokerImpl();
	}



}
