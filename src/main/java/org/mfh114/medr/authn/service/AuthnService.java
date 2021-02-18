package org.mfh114.medr.authn.service;

import org.mfh114.medr.GenericService;
import org.mfh114.medr.authn.domainBean.AuthnRequest;
import org.mfh114.medr.authn.domainBean.AuthnResponse;

public interface AuthnService extends GenericService<AuthnRequest, AuthnResponse> {

	public AuthnResponse authenticate(AuthnRequest authnRequest);
	
}
