<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/22
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页</title>
</head>
<body>
<form action="/s/addId" method="post">
    <p>id</p><input type="text" name ="id"/><br>
    <p>名字</p> <input type="text" name ="name"/><br>
    <p>手机号</p> <input type="text" name ="phone"/><br>
    <p>身份证</p> <input type="text" name ="IdCard"/><br>
    <input type="submit">
</form>

</body>
</html>
