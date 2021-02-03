#crear una maquina dispensadora de dulces
dinero=0
chocolate1=120
papas_fritas2=350
alfajor3=250
seleccion=0
calculo=0

dinero=float (raw_input("ingrese dinero"))
while dinero >=1001 or dinero<=119:
	print "dinero no valido reingresar"
	dinero=float (raw_input("ingrese dinero"))


print "elegir producto"
print "chocolate=1"
print "papas fritas=2"
print "alfajor=3"
	
seleccion=int (raw_input("ingrese opcion valida"))
while seleccion <=0 or seleccion >=4:
	seleccion=int (raw_input("ingrese opcion valida"))
		 
if seleccion==1:		
	calculo=dinero-chocolate1
	print "su vuelto es",calculo
if seleccion==2:
	calculo=dinero-papas_fritas2
	print "su vuelto es ",calculo

if seleccion==3:
	calculo=dinero-alfajor3
	print "su vuelto es",calculo
			
	

	
	
	
	
	
	

		
	
	
	
	

