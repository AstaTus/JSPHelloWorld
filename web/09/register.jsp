<%--
  Created by IntelliJ IDEA.
  User: AstaTus
  Date: 2015/9/18
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入表单信息</title>
</head>
<body>
<form action="do_register.jsp" method="post">
  用户名：<input type="text" name="userName"/><br/>
<input type="checkbox" name="skills" value="java">java
<input type="checkbox" name="skills" value="python">python
<input type="checkbox" name="skills" value="lua">lua
<input type="checkbox" name="skills" value="c++">c++
<br/>
<input type="submit" value="提交"/>
<input type="reset" value="重置">
</form>
</body>
</html>
