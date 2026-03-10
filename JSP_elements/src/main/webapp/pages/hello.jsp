<%@ page language="java" import="java.util.* ,java.sql.* ,java.io.*"contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Welocme to jsp</h1>
  hello
 <% 
      out.print("Hi friends");
      int x=10;
      out.print(x);
      List list=new ArrayList();
      list.add("Queen");
      list.add("Diana");
      out.print(list);
      
 %>
 <%!
 static String name;
 int sid;
 public void m1(){
	 
 }
 %>
</body>
</html>