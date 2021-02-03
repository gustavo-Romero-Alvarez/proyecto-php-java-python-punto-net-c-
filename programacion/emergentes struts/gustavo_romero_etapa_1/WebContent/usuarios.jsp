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
<title>Listado de usuarios</title>
</head>
<body>
	<table id="usuario" align="right">
			<tr><td>Nombre:</td><td><input type="text" value="<%=session.getAttribute("nombre")%>" disabled="disabled"/></td></tr>
			<tr><td>Apellido:</td><td><input type="text" value="<%=session.getAttribute("apellido")%>" disabled="disabled"/></td></tr>
			<tr><td>Tipo:</td><td><input type="text" value="<%=session.getAttribute("tipo")%>" disabled="disabled"/></td></tr>
	</table>
<% 
	GestionDatos gd = new GestionDatos();
	ArrayList<Usuario> listado = gd.obtenerUsuarios();
	Iterator<Usuario> iterador = listado.iterator();
	Usuario u = new Usuario();
%>
Usuarios
<table border="1">
	<tr><td>Usuario</td><td>Contraseña</td><td>Nombre</td><td>Apellidos</td><td>Tipo</td></tr>
	<% 
		while(iterador.hasNext())
		{
			u = iterador.next();
			
	%>
	<tr><td><a href="control_lista?u=<%=u.getUsuario()%>"><%=u.getUsuario()%></a></td><td><%=u.getContrasenia()%></td><td><%=u.getNombre()%></td><td><%=u.getApellidos()%></td><td><%=u.getTipo()%></td></tr>
	<% 
		}	
	%>
</table>
<a href="home.jsp">Volver</a>
</body>
</html>






