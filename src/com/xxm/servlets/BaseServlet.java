package com.xxm.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���봦��
		 request.setCharacterEncoding("utf-8");
		 response.setContentType("text/html;charset=utf-8");
		//��ȡ������ʶ
		String method = request.getParameter("mark");
		//System.out.println(method);
		Class clazz=this.getClass();
		try {
			Method m = clazz.getMethod(method, HttpServletRequest.class,HttpServletResponse.class);
			m.invoke(this, request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
