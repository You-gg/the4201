<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/18
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>imdex</h1>
<h1>${mass}</h1>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>手机号</td>
    </tr>
    <c:forEach items="${list}" var="student">
    <table>
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.phone}</td>
            <td>${student.idCard}</td>
            <td>
                <a href="/s/deleteById/${student.id}">删除</a>
                <a href="/s/ById/${student.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
