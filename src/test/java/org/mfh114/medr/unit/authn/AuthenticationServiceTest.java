package org.mfh114.medr.unit.authn;

import org.junit.Assert;
import org.junit.Test;
import org.mfh114.medr.authn.domainBean.AuthnRequest;
import org.mfh114.medr.authn.domainBean.AuthnResponse;
import org.mfh114.medr.authn.dto.UserDTO;


public class AuthenticationServiceTest {

	@Test
	public void testAuthenticate() {
		
		AuthnRequest authnReq = new AuthnRequest();
		authnReq.setUserName("login1");
		authnReq.setPassword("123");
		
		AuthnResponse authnResponse = new AuthnServiceStub().authenticate(authnReq);
		
		Assert.assertEquals(true, authnResponse.getIsCrendentialValid());
	}
	
}