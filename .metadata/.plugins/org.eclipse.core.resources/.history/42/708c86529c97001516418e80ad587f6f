<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="lib.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cliente web para multas web</title>
</head>
<body>
<h2>Multas Web</h2>
 <%
 	Boolean resultConsultaM = false;
 	String resultPropietarioM = "";
 	String resultDetalleM = "";
 	try{
 		ConsultaMultaImpService serviceConsulta=new ConsultaMultaImpService();
 		PropietarioMultaImpService servicePropietario = new PropietarioMultaImpService();
 		DetalleMultaImpService serviceDetalle = new DetalleMultaImpService();
 		ConsultaMultaImp portConsulta = serviceConsulta.getConsultaMultaImpPort();
 		PropietarioMultaImp portPropietario = servicePropietario.getPropietarioMultaImpPort();
 		DetalleMultaImp portDetalle = serviceDetalle.getDetalleMultaImpPort();
 		resultConsultaM = portConsulta.consultaMulta("ZNL538");
 		resultPropietarioM = portPropietario.propietarioMulta("Mayo", "CFN150"); 
 		resultDetalleM = portDetalle.detalleMulta("1144340675", "Abril");
 	}catch (Exception e){
 		e.printStackTrace();
 	}
 %>
 <p>A continuación se presentan los resultados de las consultas realizadas mediante web service por este cliente web</p>
 <h3>Consulta Multa:</h3>
 <b>Entrada:</b> ZNL538 <br/>
 <b>Resultado:</b> <%= resultConsultaM %>
 
 <h3>Propietario Multa</h3>
 <b>Entrada:</b> Mayo,CFN150 <br/>
 <b>Resultado:</b> <%= resultPropietarioM %>
 
 <h3>Detalle Multa</h3>
 <b>Entrada:</b> 1144340675, Abril <br/>
 <b>Resultado:</b> <%= resultDetalleM %>
 
</body>
</html>