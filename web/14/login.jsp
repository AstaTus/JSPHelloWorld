<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/21
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="/loginServlet" method="post">
    userNmae:<input type="text" name="uname"/><br/>
    password:<input type="password" name="upwd"><br/>
  <input type="submit" value="Login"/>
  <input type="reset" value="Reset">
</form>
</body>
</html>
