<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    String name="Keerthana";
    session.setAttribute("name",name);
    String myname=(String) session.getAttribute("name");
    out.print(myname);
%>
Name using jsp exp:<%=session.getAttribute(name) %>
<BR>
name using EL exp: ${name }
</body>
</html>