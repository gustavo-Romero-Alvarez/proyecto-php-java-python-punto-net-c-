Proceso Ejercicio_03
	
	cont<-0;
	cont2<-0;
	Dimension num(6,6)
	Para i Desde 1 Hasta 6 Con Paso 1 Hacer
		Para j Desde 1 Hasta 6 con paso 1 Hacer
			
	
		Escribir '                                                ';
		Escribir 'Digite el numero de la fila ',i,' en la columna ',j;
		Leer num(i,j);
		Borrar Pantalla
		div<-num(i,j)/2;
		res<-num(i,j) mod 2;
		
		si res=0 Entonces
			
			cont<-cont+1;
			Escribir 'El numero ',num(i,j),' es par';
			
		Sino
			cont2<-cont2+1;
			Escribir 'El numero ',num(i,j),' es impar';
		FinSi
		
		FinPara
		
		
	FinPara
	Escribir '                            ';
	Escribir 'Hay ',cont, ' numeros pares';
	Escribir 'Hay ',cont2, ' numeros impares';
FinProceso 
