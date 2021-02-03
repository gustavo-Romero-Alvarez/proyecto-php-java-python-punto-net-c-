<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Sistema Planetario</title>
</head>
<body>
	<form action="control_Tipo" method="post">
	Ingrese tabla tipo (planeta)
	<table>
		<tr><td>Id_Tipo:</td><td><input type="text" name="id_tipo"></td></tr>
	
			<tr>
				<td></td><td><input type="radio" name="nombre" value="Los Planetas">Los planetas</td>
			</tr>
			<tr>
				<td><input type="submit" value="Aceptar"></td><td><input type="radio" name="nombre" value="Planetas enanos" checked="checked">Planetas Enanos</td>
			</tr>
		
	</table>
	</form>

</body>
</html>