package org.mfh114.medr.authn.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mfh114.medr.authn.domainBean.AuthnRequest;

import com.opensymphony.xwork2.ActionSupport;

public class AuthenticationAction extends ActionSupport {

	private static final Logger LOGGER = LogManager.getLogger(AuthenticationAction.class);

	private AuthnRequest authnRequest;

	public AuthnRequest getAuthnRequest() {
		return authnRequest;
	}

	public void setAuthnRequest(AuthnRequest authnRequest) {
		this.authnRequest = authnRequest;
	}

	public String execute() {

		// Call AuthnService to authenticate user's credential.
		LOGGER.trace("authn service 1");
		LOGGER.debug("authn service 2");

		/// display login page
		if (authnRequest != null) {
			return SUCCESS;
		}

		return SUCCESS;

	}

	@Override
	public void validate() {

	}

}
