Proceso Promedio
	Dimension asignaturas(3,3)
escribir 'ingrese sus notas';
Para x <- 1 hasta 3 hacer
	Para z <- 1 hasta 3 hacer	
		Leer asignaturas(x,z);
	FinPara
FinPara
suma1<-0
Para x <- 1 hasta 3 hacer
	Para z <- 1 hasta 3 hacer
		
	FinPara
	suma1<-suma1+asignaturas(3,3)
	con1<-con1+1;
finpara
escribir 'el promedio es ',suma1/con1;
FinProceso