Proceso Ejercicio_05
	suma1<-0
	Dimension asignaturas(3,3)
escribir 'Ingrese sus notas';
Para x <- 1 hasta 3 hacer
	Para z <- 1 hasta 3 hacer	
		Leer asignaturas(x,z);
		suma1<-suma1+asignaturas(x,z)
		con1<-con1+1;
		
	FinPara
FinPara
escribir 'El promedio es ',suma1/con1;

FinProceso