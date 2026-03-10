<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Product JSP</h1>

 <jsp:useBean id="p1" class="com.wipro.bean.Product" scope="session"></jsp:useBean>
 
 <%--<jsp:setProperty property="pid" name="pid" param="pid"/>
  <jsp:setProperty property="pname" name="pname" param="pname"/>
  <jsp:setProperty property="price" name="price" param="price"/>--%>
 <jsp:include page="success.jsp"></jsp:include>
 
</body>
</html>