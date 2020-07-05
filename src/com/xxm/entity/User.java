package com.xxm.entity;

import java.io.Serializable;

//
public class User implements Serializable {
	
	private int id;
	private String name;
	private int sex;
	private String phone_number;
	private String area;
	private String username;
	private String password;
	private String create_time;

	public User() {
	}

	
	
	public User(  String name, int sex, String phone_number, String area, String username, String password,
			String create_time) {
	 
		 
		this.name = name;
		this.sex = sex;
		this.phone_number = phone_number;
		this.area = area;
		this.username = username;
		this.password = password;
		this.create_time = create_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone_number=" + phone_number + ", area="
				+ area + ", username=" + username + ", password=" + password + ", create_time=" + create_time + "]";
	}

	// setter getter
	/// alt+shift+s

}
