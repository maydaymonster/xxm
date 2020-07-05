package com.xxm.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.xxm.dao.UserDao;
import com.xxm.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
//	//1  �������ӳض���
//	private   ComboPooledDataSource ds=new ComboPooledDataSource();
//	//2����QueryRuner����
//	QueryRunner qr=new QueryRunner(ds);
	
	
	
	private QueryRunner qr=new QueryRunner(new ComboPooledDataSource());
	
	 public boolean insertUser(User user) {
		// qr.update(sql, )
		 String sql="insert into user(name,sex,phone_number,area,username,password) values(?,?,?,?,?,?)";
		try {
			 return  qr.update(sql, user.getName(),user.getSex(),user.getPhone_number(),user.getArea(),user.getUsername(),user.getPassword())>0?true:false;
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return false;
	 }
	 
	@Override
	public User selectUserByNameAndPassword(User user) {
		String sql="select * from user where username=? and password=?";
		 try {
			return qr.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	 
//	 public static void main(String[] args) {
//		 User us=new User();
//		 us.setUsername("xxxx");
//		 us.setPassword("111111");
//		 User u=new UserDaoImpl().selectUserByNameAndPassword( us);
//		    System.out.println(u);
//	}
}
