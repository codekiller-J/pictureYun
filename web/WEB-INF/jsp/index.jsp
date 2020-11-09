<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/10/28
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      body{
        background-image: url("../pic/bg4.jpg");
        background-size: cover;
       background-position: center;
        font-family: sans-serif;
      }

      #register{
        width: 180px;
        height: 38px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background: deepskyblue;
        border-radius: 4px;

      }

#login{
  width: 180px;
  height: 38px;
  margin: 100px auto;
  text-align: center;
  line-height: 38px;
  background: deepskyblue;
  border-radius: 4px;
}

    </style>
  </head>
  <body>


<div id="login">
<a href="${pageContext.request.contextPath}/user/toLogin">登录</a>
  </div>


<div id="register">
<a href="${pageContext.request.contextPath}/user/toRegister">注册</a>
</div>


  </body>
</html>
