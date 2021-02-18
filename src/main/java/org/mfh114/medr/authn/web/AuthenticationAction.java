package org.mfh114.medr.authn.web;

import org.mfh114.medr.authn.domainBean.AuthnRequest;

import com.opensymphony.xwork2.ActionSupport;

public class AuthenticationAction extends ActionSupport {

	private AuthnRequest authnRequest;

	public AuthnRequest getAuthnRequest() {
		return authnRequest;
	}

	public void setAuthnRequest(AuthnRequest authnRequest) {
		this.authnRequest = authnRequest;
	}

	public String execute() {

		/// display login page
		if(authnRequest != null) {
			return SUCCESS;
		}
		
		// Call AuthnService to authenticate user's credential.
		System.out.println("authn service");
		
		return SUCCESS;

	}

}
