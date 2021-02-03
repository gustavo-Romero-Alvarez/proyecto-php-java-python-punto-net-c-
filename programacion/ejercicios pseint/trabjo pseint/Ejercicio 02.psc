Proceso Ejercicio_02
	dimension letras(5,5)
	para i desde 1 hasta 5 hacer
	para j desde 1 hasta 5 hacer
		
			escribir  'Digite una letra en la fila ',i, ' de la columna ',j;
			leer letras(i,j)
			Borrar Pantalla
		FinPara
	FinPara
	
	
	
	para i desde 1 hasta 5 hacer
		Esperar 0.8 segundos
		escribir letras(i,i);
	finpara
	finproceso