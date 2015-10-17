<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="calculator_server.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator Web Service</title>
</head>
<body>
<h2>Calculator Web Service</h2>
<%
	 try{
		 CalculatorService service=new CalculatorService();
		 Calculator port = service.getCalculatorPort();
		 out.println("Los resultado de las operaciones son: \nSuma:"+port.sumar(4, 4)+"\nResta:"+port.restar(14,10)+"\nMultiplicacion:"+port.multiplicar(4, 4));
	 }catch (Exception e){
	 	e.printStackTrace();
	 }
 %>
</body>
</html>