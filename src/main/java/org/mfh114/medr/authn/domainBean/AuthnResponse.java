package org.mfh114.medr.authn.domainBean;

import org.mfh114.medr.ResponseModel;

public class AuthnResponse implements ResponseModel {

	private Boolean isCrendentialValid;

	public Boolean getIsCrendentialValid() {
		return isCrendentialValid;
	}

	public void setIsCrendentialValid(Boolean isCrendentialValid) {
		this.isCrendentialValid = isCrendentialValid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthnResponse [isCrendentialValid=");
		builder.append(isCrendentialValid);
		builder.append("]");
		return builder.toString();
	}

}
