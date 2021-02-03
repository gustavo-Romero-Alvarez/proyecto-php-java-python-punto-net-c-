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
<title>resultado 2</title>
</head>
<body>

		
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

	    String datousuario=request.getParameter("datousuario");
		String tipo=request.getParameter("tipo");
		String sinresultado="0";
		while(iterador.hasNext())
		{
			u = iterador.next();
		if (tipo.equals("usuario"))	
		{
			if(datousuario.equals(u.getUsuario()))	
			{
				%>
				<tr><td><a href="control_lista2?u=<%=u.getUsuario()%>"><%=u.getUsuario()%></a></td><td><%=u.getContrasenia()%></td><td><%=u.getNombre()%></td><td><%=u.getApellidos()%></td><td><%=u.getTipo()%></td></tr>
				<% 
				
			}
			else
			{
				sinresultado="1";
				
			}
		}
		else
		{
			if(datousuario.equals(u.getApellidos()))	
			{
				%>
				<tr><td><a href="control_lista2?u=<%=u.getUsuario()%>"><%=u.getUsuario()%></a></td><td><%=u.getContrasenia()%></td><td><%=u.getNombre()%></td><td><%=u.getApellidos()%></td><td><%=u.getTipo()%></td></tr>
				<% 
				
			}
			else
			{
				sinresultado="1";
				
			}
			
		}

		}	
	%>
	
	
</table>
<a href="home.jsp">Volver</a>
</body>
</html>