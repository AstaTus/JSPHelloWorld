<%
String userName = request.getParameter("userName");
  String skills="";
  String[] skillArr = request.getParameterValues("skills");
  if (skillArr != null && skillArr.length > 0){
    for (String skill : skillArr){
      skills += (skill + " ");
    }
  }

  request.setAttribute("userName", userName);
  request.setAttribute("skills", skills);
%>
<jsp:forward page="welcome.jsp"></jsp:forward>