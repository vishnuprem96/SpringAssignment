package com.ust.service;

import java.util.List;

import com.ust.entity.Users;

public interface UserService {
	
	public void saveUser(Users theUser);
	public List<Users> getUsers();

}
