<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
登录！
<%
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  out.print(username);

  out.print(password);
%>


</body>
</html>
