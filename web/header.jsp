<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%	
	//获取项目名
	String path = request.getContextPath();
	//获取tomcat 协议+地址+端口号+ 获取项目名
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 

</head>
</head>
<body>


<div class="box">
      <div class="inner whiteGL">
          <div class="left">
              <a class="mix" href="">仿小米商城-学习专用</a>
          </div>
          <div class="right">
              
              <c:if test="${null == sessionScope.user }">
              	<a class="mix" href="login.jsp">登录</a>
              	<a href="register.jsp">注册</a>
              	<a href="admin/main.jsp">管理</a>
              </c:if>
              <c:if test="${null != sessionScope.user }">
              	 <a class="mix" href="idnex.jsp">欢迎  ${sessionScope.user.username }    </a><a href="logout.jsp">退出</a>
              </c:if>
              
              
          </div>
      </div>
  </div>
  <div class="logo">
      <div class="logo_left">
          <div>
              <a href="javascript:void(0);" title="小米官网"><img class="xiaomi" src="img/logo.jpg"></a>
          </div>
      </div>
      <ul class="logo_center orangeGL">
          <a href="">小米手机</a>
          <a href="">红米</a>
          <a href="">笔记本</a>
          <a href="">电视</a>
          <a href="">盒子</a>
          <a href="">新品</a>
          <a href="">路由器</a>
          <a href="">智能硬件</a>
          <a href="">服务</a>
          <a href="">社区</a>
      </ul>
      <form class="logo_right">
         <div class="logo_input"><input type="text" id="search" value="">
         </div>
          <a class="logo_right_a" ><img src="img/find.jpg"></a>
          <!--<a href="">红米5新品</a>-->
          <!--<a href="">小米Noto 3</a>-->
      </form>
  </div>
</body>
</html>