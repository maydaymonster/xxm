package com.xlm.ls;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Sl implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {//sesssion对象的创建
		 
		System.out.println("session  出生了。。。:"+arg0.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {//session对象的销毁。
		 
		System.out.println("session  销毁了。。。:"+arg0.getSession());
	}

}
