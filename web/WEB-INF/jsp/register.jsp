<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/11/8
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        body {
            background-image: url("../pic/bg5.jpg");
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
        }

        .register-page {
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

        .form input {
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


<div class="register-page">
    <div class="form">
        <form action="${pageContext.request.contextPath}/user/register" method="post">
            <input type="text" name="username" placeholder="用户名"><br><br><br>
            <input type="password" name="password" placeholder="密码"><br><br><br>
           <input type="text" name="email" placeholder="邮箱"><br><br><br>
             <input type="text" name="telephone" placeholder="手机号码"><br><br><br>
            <input type="submit" value="注册">
        </form>
    </div>
</div>


</body>
</html>
