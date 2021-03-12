package com.ust.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.dao.UserDao;
import com.ust.entity.Users;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void saveUser(Users theUser) {
		// TODO Auto-generated method stub
		userDao.saveUser(theUser);
		
	}

	@Override
	@Transactional
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}
	
	

}
