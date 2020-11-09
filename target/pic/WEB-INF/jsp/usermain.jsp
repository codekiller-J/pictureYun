<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/10/28
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
    <style>
        body {
            background-image: url("../pic/bg2.jpg");
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
        }

        .modified{
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;

        }

        .addpic {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
        .allpic{
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
<div>


    <div class="modified">
        <a href="${pageContext.request.contextPath}/user/toModified?username=${msg.username}">修改个人密码</a>
    </div>

    <div class="addpic">
        <a href="${pageContext.request.contextPath}/works/toAddWorks?username=${msg.username}">上传图片</a>
    </div>

    <div class="allpic">
        <a href="${pageContext.request.contextPath}/works/toGetUserImage?username=${msg.username}">照片库</a>
    </div>

</div>
</body>
</html>
