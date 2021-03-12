package com.ust.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ust.entity.Users;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(Users theUser) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theUser);
		
	}

	@Override
	public List<Users> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Users> theQuery = session.createQuery("from Users",Users.class);
		List<Users> userss = theQuery.getResultList();
		return userss;
	}

}
