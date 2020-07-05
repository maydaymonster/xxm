<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
  span{
     color:red;
  }
</style>

</head>
<body>
    <span>五秒钟以后，系统自动的跳转到登录页面，如果没有跳转，请<span> <a href='login.jsp'>点击</a>
   <%
       session.invalidate();//退出。
       
       response.setHeader("refresh", "5;login.jsp");//设置响应头
   
   %>
</body>
</html>