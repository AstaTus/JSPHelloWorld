<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息展示</title>
</head>
<body>
用户名:<%=request.getAttribute("userName")%>
技能:<%=request.getAttribute("skills")%>
</body>
</html>
