Proceso sin_titulo
	
	
	
	escribir "ingrese numero de prestamos"
	leer p
	escribir "ingrese valor del prestamo"
	leer vp
	escribir "ingresar fecha de pago"
	leer fp
	
	
	dimension cuotas(6)

	escribir  "ingrese numero de fechas a pagar" 
	para  i<-1 hasta 6 hacer
		escribir 'fechas'
		leer cuotas(i)
		si fechas()i>6 entonces
			escribir "ingrese un  cuota menor o igual a 6"
			
			
		FinSi
	
	FinPara
	
	para i < -1 hasta 6 hacer
		escribir "las fechas son",i ,cuotas(i)
	FinPara
	
	escribir "ingrese fecha de autorizacion del prestamo"
	leer fap
	
	escribir "fecha tentativa de entrega del prestamo"
	leer ftp
	
	
	
	
	
	
FinProceso
