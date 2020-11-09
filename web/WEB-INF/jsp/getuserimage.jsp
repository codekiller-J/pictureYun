<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/11/8
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>获取用户照片</title>
    <style>
    body{
    background-image: url("../pic/bg6.jpg");
    background-size: cover;
    background-position: center;
    font-family: sans-serif;
    }

    .getallimage{
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
    <div class="getallimage">
        <a href="${pageContext.request.contextPath}/works/getUserImage?id=${user.id}">获取照片</a>
    </div>
</body>
</html>
