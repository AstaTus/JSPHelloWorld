<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%if (session.getAttribute("userName") != null){%>
欢迎:<%=session.getAttribute("userName")%>
<a href="logout.jsp">注销</a><br/>
<%}else{%>
  亲先登录
<a href="login.jsp">登录</a>
<%}%>
<%if (session.isNew()){%>
  <br/>
欢迎新湖用
<%}
else{%>
欢迎lao湖用
<%}%>

</body>
</html>
