<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/21
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
登录成功。<br/>
用户名:<%=request.getParameter("uname")%><br/>
密码:<%=request.getParameter("upwd")%><br/>
<a href=<%=request.getContextPath()%> + "login.jsp">返回登录页面</a>
</body>
</html>
