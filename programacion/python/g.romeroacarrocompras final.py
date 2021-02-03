#listas donde se guardan el producto y precio
producto=["cepillo de dientes","pasta de zapato",]
preciop=[990,5580]
#variables que ordenan la boleta y el carro de comras
space=" "
i=0
seleccion=0
d=0
orden="."
esp=" "
e=0
opcion="  opcion "
#varaible de ingresos de productos
ingresno=""
ingresepre=0.0
signopeso="$"
punto=".-"
aumentoen1=1
#variables seleccion 2
selectlista=""
cantidadp=0
selectmenu=0
listacantidad=[]

total=0
sumatoria=0
acumulador=0
#variables del carro de compras
carropro=[]
carropre=[]
#traspasan valores
c=0
d=0
#fin
e=0
f=0
g=0
h=0
#variable cuenta caracteres de precio
uno=0
dos=0
#variable cuenta caracteres de cantidad
tres=0
cuatro=0
car="cantidad:"
#variables de seleccion opcion 3 eliminar priductos
eliminar=0
remolis=[]
elit=0
contadorelit=0
elimit=0
elimit=len(producto)
#variables seleccion 3 modificar productos
modificar=0
listamodi=[]
#variable que cuenta las ventas que se realizan
ventasrealizadas=0

while True:

	print  "        _______________________Seleccione una opcion______________________"
	print "        |                                                                 |" 
	print "        |opcion 1.-... ingresar producto                                  |"
	print "        |                                                                 |"
	print "        |opcin  2.-... realizar venta                                     |"
	print "        |                                                                 |"
	print "        |opcion 3.-... Borrar /Modificar Producto                         |"
	print "        |                                                                 |"
	print "        |opcion 4.-... salir                                              |"
	print "        |_________________________________________________________________|" 
	print " "                                                      
	
	while True:
		try:
			seleccion=int (raw_input("ingrese opcion:"))
			while seleccion <=0 or seleccion>4 :
				seleccion=int(raw_input("opcion no valida reigresar numero :"))
			else:
				break
		except ValueError:
			print "caracteres no validos"	
		
		
	
	if seleccion==1:
		print "                          menu 1 :Ingreso de Productos               "
		print " "
		print "________________________  lista de productos  ______________________ "
		print " "
		while i <len(producto):
			producto[i]
			d=len (producto[i])
			while d<=24:
				d+=1
				f+=1
			print aumentoen1,punto,producto[i],orden*f,signopeso,preciop[i]
			i+=1
			aumentoen1+=1
			f=0
	
		print " "
		
		ingresno=raw_input("   Ingrese Nombre del Producto :")
			
		producto.append(ingresno)
		while True:
			try:
				ingresepre=int(raw_input("   Ingrese Precio :"))
				break
			except ValueError:
				print "caracteres no validos"
		print " "		
		print "  producto y precio ingresado correctamente"		
		
		preciop.append(ingresepre)
		print "____________________________________________________________________"
		print " "
		print " "
	i=0
	
	aumentoen1=1
	
	if seleccion==2:
		if producto==[]:
			print "lista vacia ,para agregar productos opcion 1"
		if producto!=[]:
			
			print " "
			print "                    (Menu 2 :Realizar venta)                   "
			
			print "______________________________________________________________"
			print " "
			print "                     lista de productos                       "
			print ""  
			while i <len (producto):
				producto[i]
				d=len(producto[i])
				while d<=24:
					d+=1
					f+=1
				print aumentoen1,punto,producto[i],orden*f,signopeso,preciop[i]
				i+=1
				aumentoen1+=1
				f=0
			i=0
			aumentoen1=1
				
			print " "	
			print "                                                               "
				
			
			while True:
				print "                  seleccione una opcion                       "
				print " "
				print "  opcion 1-.........escoger producto"
				print " "
				print "  opcion 2-.........eliminar un producto del carro"
				print ""
				print "  opcion 3- ........salir e imprimir carro de compras"
				print " "
				selectlista=raw_input("seleccione una opcion: ")
				while selectlista !="1" and selectlista!="2" and selectlista!="3":
					selectlista=raw_input(" opcion no valida reingrese una opcion: ")
				if selectlista=="1":
					print " "
					
					
					
					#####muestra el carro
					print "___________________________lista de Productos___________________________"
					print ""
					while i <len (producto):
						
						producto[i]
						d=len(producto[i])
						while d<=24:
							
							d+=1
							f+=1
						print opcion,aumentoen1,punto,producto[i],orden*f,signopeso,preciop[i]
						i+=1
						aumentoen1+=1
						f=0
					i=0
					aumentoen1=1
					
					print " "
					#inicio validacion de datos
					while True:
						try:
							selectmenu=int (raw_input("   seleccione producto: "))
							while selectmenu<1 or selectmenu>len(producto):
								selectmenu=int(raw_input("opcion no valida reingrese opcion: "))
							else:
								break
						except ValueError:
							print "caracteres no validos"	
							
					#fin validacion de datos	
					selectmenu=selectmenu-1
					
					carropro.append(selectmenu)
					
					
					#inicio validacion de datos
					while True:
						try:
							cantidadp=int(raw_input("Ingrese Cantidad del producto: "))
							while cantidadp<=0:
								cantidadp=int(raw_input("cantidad no valida ingrese un numero mayor que 0:  "))
							else:
								break
						except ValueError:
							print " caracteres no validos"
					#fin  validacion de datos		
												
					listacantidad.append(cantidadp)
					
				if selectlista=="2" :
					if carropro==[]:
						print "  el carro de compras esta vacio"
						print "  para ingresar productos selecciona la opcion 1"
						print " "
						
					if carropro!=[]:
						#inicio carro de compras
						print "**********************************Carro de compras *********************************************"
						print " *************************************************************************************************"
						print "          Productos                    Precio unitario        cantidad            Total"
						print " "
						while i<len(carropro):
							carropro[i]
							c=carropro[i]
							listacantidad[i]
							d=listacantidad[i]
							
							e=len(producto[c])
							
							g=e
							#variables para sacar el total
							sumatoria=preciop[c]*d
							acumulador=acumulador+sumatoria
													#inicio de cuenta caracteres de precio
							variablecreada=str(preciop[c])
							uno=len (variablecreada)
							#inicio de cuenta caracteres de cantidad
							variablecreadados=str(d)
							tres=len(variablecreadados)
							while tres<=5:
								tres+=1
								cuatro+=1
							while uno<=12:
								uno+=1
								dos+=1
						
							while g<=24:
								g+=1
								f+=1
						
							print opcion,aumentoen1,punto,producto[c],orden*f,signopeso,preciop[c],space*dos,esp,car,d,space*cuatro,sumatoria
							dos=0
							cuatro=0
							i+=1
							aumentoen1+=1
							f=0
						print " "	
						print "Total de la compra............................................................",acumulador	
						#restableciendo los valores
						i=0	
						aumentoen1=1
						acumulador=0
						sumatoria=0
						g=0
						f=0
						dos=0
						cuatro=0
						#termino carro de compras
						
						canti=" cantidad :"
						selectmenu=int(raw_input("seleccione producto que desea eliminar: "))
						selectmenu=selectmenu-1
						print producto[selectmenu],signopeso,preciop[selectmenu],canti,listacantidad[selectmenu]
						print "eliminando..."
						carropro.pop(selectmenu)
						listacantidad.pop(selectmenu)
						
						
				
				
				if selectlista=="3":
					if carropro==[]:
						print "saliendo..."
						break
					if carropro!=[]:
						i=0
						print ""
						print "**********************************Boleta de venta *********************************************"
						print "   *****************************************************************************************"
						print "     Productos                  Precio unitario        cantidad      Total"
						print " "
						while i<len(carropro):
							carropro[i]
							c=carropro[i]
							listacantidad[i]
							d=listacantidad[i]
							
							e=len(producto[c])
							
							g=e
							#variables para sacar el total
							sumatoria=preciop[c]*d
							acumulador=acumulador+sumatoria
							#inicio de cuenta caracteres de precio
							variablecreada=str(preciop[c])
							uno=len (variablecreada)
							#inicio de cuenta caracteres de cantidad
							variablecreadados=str(d)
							tres=len(variablecreadados)
							while tres<=5:
								tres+=1
								cuatro+=1
							while uno<=12:
								uno+=1
								dos+=1
							
							while g<=24:
								g+=1
								f+=1
						
							print aumentoen1,punto,producto[c],orden*f,signopeso,preciop[c],space*dos,esp,car,d,space*cuatro,sumatoria
							cuatro=0
							dos=0
							i+=1
							aumentoen1+=1
							f=0
						print " "	
						print "Total de la compra...................................................",acumulador
						print ""
						print "    **********************************************************************************"
						print "       ****************************************************************************     "	
						#se restablecen los valores para poder usarlos nuevamente en el ciclo
						cuatro=0
						i=0	
						aumentoen1=1
						acumulador=0
						sumatoria=0
						g=0
						f=0
						uno=0
						#modificado recien
						carropro=[]
						listacantidad=[]
						d=0
						ventasrealizadas+=1
						print " "
						print " "
						break
						
	if seleccion==3:
		#inicio opcion 3
		if len(producto)!=0:
			
			print "------------------------------menu opcion 3----------------------------"
			print " " 
			print " "
			while True:
				print "     opcion 1........... modificar productos ,precios "
				print "     opcion 2 ...........eliminar productos"
				print "     opcion 3............salir "
				print""
				while True:
					try:
						selectmenu=int(raw_input("selecciona una opcion: "))
						while selectmenu <=0 or selectmenu>3 :
							selectmenu=int(raw_input("reingrese una opcion valida: "))
							
						else:
							break
					except ValueError:
						print "caracteres no validos"	
		
				#atento
				
						
				if selectmenu==1:
					if len(producto)!=0:
						
						print "-----------------------modificar producto y precio ------------------------------"
						print " "
						print "seleccione el producto que desea cambiar "
						while i<len (producto):
							producto[i]
							d=len(producto[i])
							while d<=24:
								d+=1
								f+=1
							print opcion,aumentoen1,punto,producto[i],orden*f,signopeso,preciop[i]
							i+=1
							aumentoen1+=1
							f=0	
						#restablecimiento de valores
						i=0
						aumentoen1=1
						f=0
						#------------------------------	
						print "--------------------------------------------------------------------------"
						# algoritmo que no permite ingresar caracteres evita que el programa se caiga al ingresar letras en una variable int
						while True:	
							try:
								modificar=int (raw_input("ingrese la opcion que desea cambiar:"))
								while modificar <1 or modificar>len(producto):
									modificar=int (raw_input("seleccione una opcion valida: "))
								else:
									break
							except ValueError:
								print "caracteres no validos"	
						#modificado
						
						
						modificar=modificar-1
							
						print producto[modificar],"  ",signopeso,preciop[modificar]	
							
						ingresno=raw_input("   ingrese nuevo nombre del producto: ")
						producto[modificar]=ingresno
						print " "
						#modificado recien
						while True:	
							
							try:
								ingresepre=int(raw_input("   ingrese nuevo precio:"))
								break
							except ValueError:
								print "caracteres no validos"	
						
						print "   producto y precio modificado"
						print " "
						preciop[modificar]=ingresepre
					else:
						selectmenu=3
							
					
				if selectmenu==2:
					if len(producto)!=0:
						
						print "--------------------------eliminar productos y precios --------------------------------------"
						#correccion
						while i<len (producto):
							
							producto[i]
							d=len(producto[i])
							while d<=24:
								d+=1
								f+=1
							print opcion,aumentoen1,punto,producto[i],orden*f,signopeso,preciop[i]
							i+=1
							aumentoen1+=1
							f=0
						print " "
						while True:
							try:
								eliminar=int(raw_input("   seleccione elemento que desea eliminar :"))
								while eliminar <1 or eliminar>len(producto):
								
									eliminar=int (raw_input("   seleccione una opcion valida: "))
								else:
									break
							except ValueError:
								print "caracteres no validos"	
						
						
						#brigido
						
						eliminar=eliminar-1
						
						print producto[eliminar],"  ",signopeso,preciop[eliminar]
						print "eliminando..."
						producto.pop(eliminar)
						preciop.pop(eliminar)
						elimit-=1
							
						aumentoen1=1
						
						i=0	
					else:
						selectmenu=3	
				if selectmenu==3:
					print "saliendo del menu opcion 3....."
					#restableciendo los valores
					i=0
					aumentoen1=1
					break
					
		if producto==[]:
			print " la lista de productos esta vacia para modificar o eliminar  "
			print " para agregar productos opcion 1 "	
			#fin opcion 3		
					
	if seleccion==4:
		print "ventas realizadas :",ventasrealizadas
		print "saliendo..."
		
		
		break				
						
		
				
#gustavo romero alvarez 		
		
			
			

		
	
		
			
				
		
		


