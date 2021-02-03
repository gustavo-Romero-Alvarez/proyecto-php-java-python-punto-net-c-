Proceso sin_titulo
	Dimension num(5,5);
	
	Para x Desde 1 Hasta 5 Hacer
		Para z Desde 1 Hasta 5 Hacer
			Escribir 'Ingrese una letra';
			leer num(x,z);
		FinPara
		
	FinPara
	Para h Desde 5 Hasta 1 Hacer
		Para g Desde 5 Hasta 1 Hacer
			Esperar 0.5 segundos
			Escribir num(h,g);
		FinPara
	
	FinPara
FinProceso
