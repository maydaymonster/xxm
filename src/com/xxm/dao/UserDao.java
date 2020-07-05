package com.xxm.dao;

import com.xxm.entity.User;

public interface UserDao {
    boolean insertUser(User user);
    
    
    User selectUserByNameAndPassword(User user);
}
