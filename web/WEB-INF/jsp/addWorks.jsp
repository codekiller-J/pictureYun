<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/11/8
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图片</title>
    <style>
    body {
    background-image: url("../pic/bg6.jpg");
    background-size: cover;
    background-position: center;
    font-family: sans-serif;
    }

    .addworks-page {
    width: 360px;
    padding: 10% 0 0;
    margin: auto;
    }

    .form {
    position: relative;
    z-index: 1;
    background: none;
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

<div class="addworks-page">
    <div class="form" >
    <form action="${pageContext.request.contextPath}/works/addWorks"  enctype="multipart/form-data" method="post">
                <input  type="hidden" name="username" value="${user.username}">
            <input type="text" name="works_description" placeholder="请输入作品描述">
                <input type="file" name="picfile">

           <input type="submit" name="上传">
    </form>
    </div>
</div>

</body>
</html>
