<%@page import="servlets.GestionDatos"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="control_buscar" method="get">
		
		<table>
	
		
			<tr>
				<td>dato del Usuario</td><td><input type="text" name="datousuario"></td>
			</tr>
			
			<tr>
				<td></td><td><input type="radio" name="tipo" value="usuario">buscar por usuario</td>
			</tr>
			<tr>
				<td><input type="submit" value="Aceptar"></td><td><input type="radio" name="tipo" value="apellido" checked="checked">buscar por apellido</td>
			</tr>
		</table>
		

	</form>
</body>
</html>