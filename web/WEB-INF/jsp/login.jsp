<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/10/28
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            background-image: url("../pic/bg5.jpg");
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
        }

        .login-page {
            width: 360px;
            padding: 10% 0 0;
            margin: auto;
        }

        .form {
            position: relative;
            z-index: 1;
            background: coral;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 45px;
            text-align: center;
        }

        .form input{
            outline: none;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }


    </style>
</head>
<body>

<div class="login-page">
    <div class="form">
        <form action="${pageContext.request.contextPath}/user/login" method="post">
           用户名： <input type="text" name="username" placeholder="请输入用户名">
            密码：<input type="password" name="password" placeholder="请输入用户密码">
            <input type="submit" value="登陆">

    </form>
    </div>
</div>

</body>
</html>
