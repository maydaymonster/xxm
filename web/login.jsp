<%--
  Created by IntelliJ IDEA.
  User: 顾文杰
  Date: 2020/7/3
  Time: 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="UTF-8">
<title>登录页面</title>
<link rel="stylesheet" href="css/index.css">
<script src="js/jquery.1.11.1.min.js"></script>
<script src="js/login.js"></script>

<style>

</style>

</head>
<body>
<div class="register_head_on">

</div>
<div class="register_head">
    <a href="index.html"><img src="img/logo.jpg" alt=""></a>
    <div class="register_head_right">
        <p class="register_head_right_p1">小 米 商 城</p>
        <p class="register_head_right_p2">让每个人都享受科技乐趣</p>
    </div>

</div>

<div class="register">
    <div class="register_boby">
        <div class="register_boby_min">
            <div class="register_boby_no1">
                <div class="register_boby_no1_in">
                    <span style="color: #ff6700">账号登录 </span>
                    <span class="register_boby_sapn"> | </span>
                    <span> 扫码登录</span>
                </div>
            </div>

            <div class="register_boby_no2">
                <form id="f3" action="userServlet.do" method="post">
                    <input type="hidden" name="mark" value="login"/>
                    <input type="text" placeholder="请输入您的用户名" name="username">
                    <input type="password" placeholder="密码" name="password">
                    <div class="register_boby_no2_div">
                        <span id="loginb">登录</span>
                    </div>
                </form>
            </div>

            <div class="register_boby_no3">
                <a href="javascript:void(0);" style="color: #ff6700">手机短信登录/注册</a>
                <sapn class="register_boby_no3_span">
                    <a href="javascript:void(0);">立即注册</a>
                    <span>|</span>
                    <a href="javascript:void(0);">忘记密码?</a>
                </sapn>

            </div>
            <div class="register_boby_no4">
                <img src="img/register02.jpg" alt="">
            </div>



        </div>
    </div>
</div>
<div class="register_foot">
    <img  src="img/register03.jpg" alt="">
</div>

</body>
</html>