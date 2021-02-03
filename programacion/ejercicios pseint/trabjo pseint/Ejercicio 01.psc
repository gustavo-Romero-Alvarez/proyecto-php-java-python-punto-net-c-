Proceso Ejercicio_01
	Dimension num(10,10);
	Para fila Desde 1 Hasta 10 Hacer
		Para columna Desde 1 Hasta 10 Hacer
			Escribir 'Ingrese un numero en la fila ', fila, ' de la columna ', columna;
			Leer num(fila,columna)
			Borrar Pantalla
		FinPara
	FinPara
	Para fila Desde 1 Hasta 10 Hacer
		Para columna Desde 1 Hasta 10 Hacer
			Esperar 0.8 Segundos
			Borrar Pantalla
			Escribir 'El numero en la fila ', fila, ' de la columna ', columna ' es: ',num(fila,columna);
			suma<-suma+num(fila, columna);
		FinPara
	FinPara
FinProceso
