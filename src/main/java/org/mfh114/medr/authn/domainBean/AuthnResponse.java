package org.mfh114.medr.authn.domainBean;

import org.mfh114.medr.ResponseModel;

public class AuthnResponse implements ResponseModel {

	private Boolean isAuthenticationValid;

	public Boolean getIsAuthenticationValid() {
		return isAuthenticationValid;
	}

	public void setIsAuthenticationValid(Boolean isAuthenticationValid) {
		this.isAuthenticationValid = isAuthenticationValid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthnResponse [isAuthenticationValid=");
		builder.append(isAuthenticationValid);
		builder.append("]");
		return builder.toString();
	}

}
