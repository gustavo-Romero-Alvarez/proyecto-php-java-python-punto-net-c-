Proceso factura
	escribir "Ingrese precio:";
	leer precio;
	escribir "Ingrese nombre producto:";
	leer Nproducto;
	escribir "Ingrese numero de articulos:";
	leer  Narticulos;
	
	iva<- (precio*Narticulos)/100*19;
	pbruto <- (precio*Narticulos+iva)
	
	si pbruto >170000
		Entonces
		desrec<- (pbruto/100*20);
		pre<- (pbruto-desrec);
	
	FinSi
	
	Si pbruto >200000
		Entonces
		desrec<- (pbruto/100*30);
		pre<- (pbruto-desrec);
	FinSi
	
	si pbruto <10000
		Entonces
		desrec <-(pbruto/100*9);
		pre<- (pbruto+desrec);
		
	FinSi
	
	escribir "¿Paga con tarjeta?";
	escribir "seleccione 1 si paga con tarjeta";
	escribir "seleccione 2 si paga en efectivo";
	leer tarj_efect;
	
	Mientras tarj_efect >=3
		escribir "error ingreso, reintete de nuevo";
		leer tarj_efect;
	FinMientras
	
	
	si tarj_efect=1
		entonces
		rec2<- (pre/100*6);
		pref<- (pre+rec2);
		
	FinSi
	
	si tarj_efect=2
		Entonces
		descE<-(pre/100*10);
		pref<- (pre-descE);
	FinSi
	
	escribir "factura"
	Escribir "nombre del producto: " ,nproducto
	Escribir "precio: " ,precio
	Escribir "numero de articulos: " ,narticulos
	escribir "precio iva: " ,iva
	escribir "descuento o recargo: " ,desrec
	Escribir " Recargo con tarjeta: " ,rec2
	Escribir " Descuento efectivo: " ,descE
	escribir "Precio final: " ,pref;
	
	
	


FinProceso
