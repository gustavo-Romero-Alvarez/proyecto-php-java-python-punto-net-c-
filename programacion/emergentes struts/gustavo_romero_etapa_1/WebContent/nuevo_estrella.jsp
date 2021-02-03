<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear usuario</title>
</head>
<body>
	<form action="control_Estrella" method="post">
	Ingrese los datos de tabla Estrella
	<table>
		<tr><td>Id_estrella:</td><td><input type="text" name="id_estrella"></td></tr>		
		<tr><td>Nombre:</td><td><input type="text" name="nombre"></td></tr>
		<tr><td>Id_Sistema Planetario(fk):</td><td><input type="text" name="id_sistema_planetario"></td></tr>

		<tr><td><input type="submit" value="Aceptar"></td></tr>
	</table>
	</form>

</body>
</html>