Proceso eje1
	Dimension num(10,10);
	Para fila Desde 1 Hasta 10 Hacer
		Para columna Desde 1 Hasta 10 Hacer
			Escribir 'Ingrese un numero en la fila ', fila, ' de la columna ', columna;
			Leer num(fila,columna)
		FinPara
	FinPara
	Para fila Desde 1 Hasta 10 Hacer
		Para columna Desde 1 Hasta 10 Hacer
			Esperar 0.5 Segundos
			Escribir 'El numero en la fila ', fila, ' de la columna ', columna ' es:';
			suma<-suma+num(fila, columna);
			Escribir num(fila,columna);
		FinPara
	FinPara
FinProceso
