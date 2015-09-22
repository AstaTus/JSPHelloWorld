<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  session.invalidate();
  response.setHeader("refresh","2;URL=welcome.jsp");
%>