<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
  response.setHeader("Cache=Control", "no-cache");
  response.setIntHeader("Refresh", 2);
  out.println("data is" + new java.util.Date().toString() + "<br/>");
%>
</body>
</html>
