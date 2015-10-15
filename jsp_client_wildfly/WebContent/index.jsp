<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"
 import="wildfly_helloservice.*"
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Invocando servicio web desde cliente JSP</title>
</head>
<body>
<h2>Hello Service Client</h2>
 <%
	 try{
		 HelloService service=new HelloService();
		 Hello port = service.getHelloPort();
		 out.println(port.sayHello("Daniel"));
	 }catch (Exception e){
	 	e.printStackTrace();
	 }
 %>
</body>
</html>