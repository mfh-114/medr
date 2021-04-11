package org.mfh114.medr.authn.dto;

import org.mfh114.medr.GenericDTO;

public class UserDTO implements GenericDTO {

	private Integer id;
	private String userName;
	private String loginId;
	private String passwrd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDTO [id=");
		builder.append(id);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", loginId=");
		builder.append(loginId);
		builder.append(", passwrd=");
		builder.append(passwrd);
		builder.append("]");
		return builder.toString();
	}

}
