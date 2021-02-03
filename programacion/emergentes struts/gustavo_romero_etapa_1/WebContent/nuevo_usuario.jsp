<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear usuario</title>
</head>
<body>
	<form action="control_usuario" method="post"> 
		<table id="usuario" align="right">
			<tr><td>Nombre:</td><td><input type="text" value="<%=session.getAttribute("nombre")%>" disabled="disabled"/></td></tr>
			<tr><td>Apellido:</td><td><input type="text" value="<%=session.getAttribute("apellido")%>" disabled="disabled"/></td></tr>
			<tr><td>Tipo:</td><td><input type="text" value="<%=session.getAttribute("tipo") %>" disabled="disabled"/></td></tr>
		 </table>
	Ingrese los datos del usuario
	<table>
		<tr><td>Usuario:</td><td><input type="text" name="usuario"></td></tr>
		<tr><td>Contraseña:</td><td><input type="password" name="contrasenia"></td></tr>
		<tr><td>Nombre:</td><td><input type="text" name="nombre"></td></tr>
		<tr><td>Apellido:</td><td><input type="text" name="apellido"></td></tr>
		<tr><td>Tipo:</td>
			<td><select name="tipo">
					<option value="Administrador">Administrador</option>
					<option value="usuario">Usuario</option>
				</select>
			</td>
		</tr>
		<tr><td><input type="submit" value="Aceptar"></td></tr>
	</table>
	</form>
</body>
</html>