package com.drtran.humanreview.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.drtran.humanreview.model.UserInfo;
import com.drtran.humanreview.model.UserInfoImpl;

@Repository
public class UserRepository {
	private static List<UserInfo> userInfoList = new ArrayList<UserInfo>();

	static {
		String[] users = { "user1", "user2", "user3", "user4" };
		String[] passwords = { "password1", "password2", "password3", "password4" };

		for (int i = 0; i < users.length; i++) {
			UserInfo userInfo = new UserInfoImpl(users[i]);
			userInfo.setPassword(passwords[i]);
			userInfoList.add(userInfo);
		}
	}

	public String authenticateUser(String username, String password) {

		String token = "";
		for (UserInfo userInfo : userInfoList) {
			token = userInfo.authenticate(username, password);
			if (!token.isEmpty()) {
				break;
			}
		}
		return token;
	}
}
