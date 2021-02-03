Proceso Ejercicio_06
	Dimension num(5,5);
	
	Para x Desde 1 Hasta 5 Hacer
		Para z Desde 1 Hasta 5 Hacer
			Escribir 'Ingrese una letra en la fila ',x,' de la columna ',z;
			leer num(x,z);
			Borrar Pantalla
		FinPara
		
	FinPara
	Para h Desde 1 Hasta 5 Hacer
		Para g Desde 1 Hasta 5 Hacer
			Esperar 0.5 segundos
			Escribir num(g,h);
		FinPara
	
	FinPara
FinProceso
