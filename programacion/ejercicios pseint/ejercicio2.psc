Proceso sin_titulo
	//2.	Llenar una matriz de 5 x 5 con letras. Mostrar sólo los elementos de la diagonal principal.
	dimension trabajo(5,5)
	
	para i desde 1 hasta 5 hacer
		para j desde 1 hasta 5 hacer
		
			escribir  i "" j
			leer trabajo(i,j)
		FinPara
	FinPara
	
	
	
	para i desde 1 hasta 5 hacer
		escribir sin saltar trabajo(i,i);
	finpara
	finproceso