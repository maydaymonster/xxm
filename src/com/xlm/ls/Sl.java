package com.xlm.ls;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Sl implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {//sesssion����Ĵ���
		 
		System.out.println("session  �����ˡ�����:"+arg0.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {//session��������١�
		 
		System.out.println("session  �����ˡ�����:"+arg0.getSession());
	}

}
