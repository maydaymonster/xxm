package com.xxm.servlets;

import com.xxm.entity.User;
import com.xxm.service.UserService;
import com.xxm.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/userServlet.do")
public class UserServlet extends BaseServlet {
   private UserService userService=new UserServiceImpl();
   
	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("this is register.....");
		
		 
		
		
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		int isex=Integer.parseInt(sex);
		String phone_number=request.getParameter("phone_number");
		String area=request.getParameter("area");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//System.out.println(name+":"+isex+":"+phone_number+":"+area+":"+username+":"+password);
		
		
		User user=new User(name,isex,phone_number,area,username,password,null);
		 
		//���÷����
		boolean z=userService.addUser(user);
		if(z)
		{
			response.sendRedirect("login.jsp");
		}else
		{
			request.setAttribute("msg","<font color='red'>ע��ʧ��</font>");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}

	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	   System.out.println("this is login.do....");
	   
	   String username=request.getParameter("username");
	   String password=request.getParameter("password");
//	   System.out.println(username+":"+password);

	   
	   //��ұ���ʹ��������ʽ�������жϣ������������Ƿ�Ϸ���
	   
	   User  user=new User();
	   user.setUsername(username);
	   user.setPassword(password);
	   
	   
	   //���÷���㡣��������
	   User users=userService.login(user);
	   if(users!=null)
	   {
		   //�������ԡ�
		   HttpSession session=request.getSession();//getSession(true);
		   session.setAttribute("user", users);
		   response.sendRedirect("index.jsp");//������ҳ��
		   
		   
	   }else
	   {
		   request.setAttribute("msg", "<font color='red'>��¼ʧ��</font>");
		   request.getRequestDispatcher("login.jsp").forward(request, response);
		   
	   }
	}
}
