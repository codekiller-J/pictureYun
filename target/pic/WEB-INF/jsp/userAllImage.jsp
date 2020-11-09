<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/11/8
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>用户照片列表</title>
    <base href="<%=basePath%>">
</head>
<body>
<p>

</p>
<c:forEach var="list" items="${requestScope.get('list')}">
<tr>

    <td><img src="/pic/imgs/${list}" style="display: block;float:left" ></td>

</tr>

</c:forEach>

</body>
<style>
    img {
        width: 50%;
        height: 50%;
    }
</style>
</html>
