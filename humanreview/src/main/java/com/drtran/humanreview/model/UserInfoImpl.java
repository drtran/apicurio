package com.drtran.humanreview.model;

public class UserInfoImpl implements UserInfo {

	private String username;
	private String password;
	private String token;

	public UserInfoImpl(String username) {
		this.username = username;
	}

	public String authenticate(String username, String password) {
		if (username.equals(this.username) && password.equals(this.password)) {
			token = "random-" + Math.random();
		} else {
			return "";
		}

		return token;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

}
