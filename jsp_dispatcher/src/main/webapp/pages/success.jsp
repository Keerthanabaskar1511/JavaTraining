<%@ page language="java" import="com.wipro.bean.Product" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%Product p=(Product) session.getAttribute("p");
 out.print(p);%>
 <%= session.getAttribute("p")%>
 <BR>
 ${p1};
 <br>
 <jsp:useBean id="p1" class="com.wipro.bean.Product" scope="session"></jsp:useBean>
  <jsp:getProperty property="pid" name="p1"/>
  <jsp:getProperty property="pname" name="p1"/>
  <jsp:getProperty property="price" name="p1"/>
  
</body>
</html>