package com.xxm.service;

import com.xxm.entity.User;

public interface UserService {//�ӿ���saд��  ���ǳ���Աд�ġ�
	
  boolean  addUser(User user);
  
  User login(User user);
}
