package org.mfh114.medr.unit.authn;

import org.junit.Test;
import org.mfh114.medr.DAOBroker;
import org.mfh114.medr.authn.dao.AuthnDataBroker;
import org.mfh114.medr.authn.domainBean.AuthnRequest;
import org.mfh114.medr.authn.domainBean.AuthnResponse;
import org.mfh114.medr.authn.service.AuthenticationService;
import org.mfh114.medr.authn.service.AuthnService;


public class AuthnServiceStub extends AuthenticationService {

	@Override
	public AuthnDataBroker getAuthnDAOBroker() {
		return new AuthnDataBrokerStub();
	}

	
}