package com.ust.dao;

import java.util.List;


import com.ust.entity.Users;

public interface UserDao {
	
	public void saveUser(Users theUser);
	public List<Users> getUsers();

}
