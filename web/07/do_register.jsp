<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册信息处理</title>
</head>
<body>
<jsp:useBean id="user" class="com.astatus.entity.UserEntity"></jsp:useBean>
<jsp:setProperty name="user" property="userName" param="userName"/>
<jsp:setProperty name="user" property="password" param="password"/>
<%
  String userNmae = request.getParameter("userName");
  String password = request.getParameter("password");
  out.println(userNmae);
  out.println("<br/>");
  out.println(password);
%>
<jsp:getProperty name="user" property="userName"/>
<jsp:getProperty name="user" property="password"/>
</body>
</html>
