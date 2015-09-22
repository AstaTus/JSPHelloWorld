<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String userName = request.getParameter("userName");
  String password = request.getParameter("password");
  if (userName != null && password != null){
    session.setAttribute("userName", userName);
    session.setAttribute("password", password);
    response.setHeader("refresh", "2;URL=welcome.jsp");
  }

%>
<jsp:forward page="welcome.jsp"></jsp:forward>