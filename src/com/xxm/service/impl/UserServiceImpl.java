package com.xxm.service.impl;

import com.xxm.dao.UserDao;
import com.xxm.dao.impl.UserDaoImpl;
import com.xxm.entity.User;
import com.xxm.service.UserService;
//·þÎñ²ã
public class UserServiceImpl implements UserService{
    private  UserDao  userDao=new UserDaoImpl();
	@Override
	public boolean addUser(User user) {
		 return userDao.insertUser(user);
//		return false;
	}
	@Override
	public User login(User user) {
		 
		return userDao.selectUserByNameAndPassword(user);
	}

}
