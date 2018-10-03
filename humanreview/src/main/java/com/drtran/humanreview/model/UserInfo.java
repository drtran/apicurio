package com.drtran.humanreview.model;

public interface UserInfo {
	public String authenticate(String username, String password);
	public void setPassword(String password);
}
