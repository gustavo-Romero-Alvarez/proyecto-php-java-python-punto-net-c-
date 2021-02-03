<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar usuario</title>
</head>
<%
	Usuario u = (Usuario)request.getAttribute("usuario");
%>
<form action="control_actualizar" method="post">
<body>
	<table id="usuario" align="right">
			<tr><td>Nombre:</td><td><input type="text" value="<%=session.getAttribute("nombre")%>" disabled="disabled"/></td></tr>
			<tr><td>Apellido:</td><td><input type="text" value="<%=session.getAttribute("apellido")%>" disabled="disabled"/></td></tr>
			<tr><td>Tipo:</td><td><input type="text" value="<%=session.getAttribute("tipo")%>" disabled="disabled"/></td></tr>
	</table>
	<table>
		<tr><td>Usuario: </td><td><input type="text" value="<%=u.getUsuario() %>" name="usuario" readonly="readonly"></td></tr>
		<tr><td>Contraseña: </td><td><input type="text" value="<%=u.getContrasenia()%>" name="contrasenia"></td></tr>
		<tr><td>Nombre: </td><td><input type="text" value="<%=u.getNombre()%>" name="nombre"></td></tr>
		<tr><td>Apellidos: </td><td><input type="text" value="<%=u.getApellidos()%>" name="apellidos"></td></tr>
		<tr><td>Tipo: </td><td><input type="text" value="<%=u.getTipo()%>" name="tipo"></td></tr>
		<tr><td><input type="submit" value="Aceptar"></td></tr>
	
	</table>
	<a href="home.jsp">Volver</a>
</body>
</form>
</html>