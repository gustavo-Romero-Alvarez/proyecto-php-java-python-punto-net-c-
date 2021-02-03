<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
	<table id="usuario" align="right">
			<tr><td>Nombre:</td><td><input type="text" value="<%=session.getAttribute("nombre")%>" disabled="disabled"/></td></tr>
			<tr><td>Apellido:</td><td><input type="text" value="<%=session.getAttribute("apellido")%>" disabled="disabled"/></td></tr>
			<tr><td>Tipo:</td><td><input type="text" value="<%=session.getAttribute("tipo")%>" disabled="disabled"/></td></tr>
	</table>
	Acciones:
	<table>
		<tr><td><a href="nuevo_usuario.jsp">Crear usuario</a></td></tr>
		<tr><td><a href="usuarios.jsp">Lista de usuarios</a></td></tr>
		<tr><td><a href="usuarios2.jsp">Eliminar Usuario</a></td></tr>
		<tr><td><a href="buscarUsuarios.jsp">Busqueda de Usuarios</a></td></tr>
	</table>
</body>
</html>