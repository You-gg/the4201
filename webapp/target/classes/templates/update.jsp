<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/22
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>修改</title>
</head>
<body>

<form action="/s/update" method="post">
    <h1>修改</h1>
    <p>id</p><input type="text" name ="id" value="${student.idCard}" /><br>
    <p>名字</p> <input type="text" name ="name" value="${student.idCard}"/><br>
    <p>手机号</p> <input type="text" name ="phone" value="${student.idCard}"/><br>
    <p>身份证</p><input type="text" name ="IdCard" value="${student.idCard}"/>
    <input type="submit">
</form>
</body>
</html>
