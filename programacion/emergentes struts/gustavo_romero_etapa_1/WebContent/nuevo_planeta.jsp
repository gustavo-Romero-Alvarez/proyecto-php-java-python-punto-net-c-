<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Planeta</title>
</head>
<body>
	<form action="control_Planeta" method="post">
	Ingrese los datos del planeta
	<table>
		<tr><td>Id_Planeta:</td><td><input type="text" name="id_planeta"></td></tr>
		
		<tr><td>Id_estrella(fk):</td><td><input type="text" name="id_estrella"></td></tr>
		<tr><td>Id_tipo(fk):</td><td><input type="text" name="id_tipo"></td></tr>
		<tr><td>Nombre:</td><td><input type="text" name="nombre"></td></tr>
		<tr><td>Simbologia:</td><td><input type="text" name="simbologia"></td></tr>
		<tr><td>diametro_ecuatorial:</td><td><input type="text" name="diametro_ecuatorial"></td></tr>
		<tr><td>Masa:</td><td><input type="text" name="masa"></td></tr>
		<tr><td>Radio_Orbital:</td><td><input type="text" name="radio_orbital"></td></tr>
		<tr><td>Periodo_Orbital:</td><td><input type="text" name="periodo_orbital"></td></tr>
		<tr><td>Periodo_Rotacion:</td><td><input type="text" name="periodo_rotacion"></td></tr>
        <tr><td>Composicion_Atmosfera:</td><td><input type="text" name="composicion_atmosfera"></td></tr>
        <tr><td>Imagen:</td><td><input type="text" name="imagen"></td></tr>
		<tr><td><input type="submit" value="Aceptar"></td></tr>
	</table>
	</form>

</body>
</html>