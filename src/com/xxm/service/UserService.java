package com.xxm.service;

import com.xxm.entity.User;

public interface UserService {//接口是sa写的  类是程序员写的。
	
  boolean  addUser(User user);
  
  User login(User user);
}
