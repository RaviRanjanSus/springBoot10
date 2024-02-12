package com.ravi.in.service;


import org.springframework.stereotype.Service;

import com.ravi.in.model.User;

@Service
public class UserService {
	
	private User user=new User(12,"ravi","jamui");

	
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return user;
	}

}
