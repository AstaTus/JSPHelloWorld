<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>3</title>
</head>
<body>
<%
  Cookie myCookie = new Cookie("name", "chenjunqi");
  myCookie.setMaxAge(3600);
  response.addCookie(myCookie);
%>
</body>
</html>
