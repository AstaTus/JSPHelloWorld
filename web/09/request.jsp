<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request实例</title>
</head>
<body>
<form action="" method="post">
  <input type="text" name="userName"/>
  <input type="submit" value="提交">
</form>
请求方法名：<%=request.getMethod()%><br/>
请求资源：<%=request.getRequestURI()%><br/>
请求协议：<%=request.getProtocol()%><br/>
服务器的名称:<%=request.getServerName()%><br/>
服务器的端口:<%=request.getServerPort()%><br/>
客户端iP:<%=request.getRemoteAddr()%><br/>
客户端名称:<%=request.getRemoteHost()%><br/>
表单数据:<%=request.getParameter("userName")%>
</body>
</html>
