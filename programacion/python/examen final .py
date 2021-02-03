import os
import subprocess

#sistema de gestion de distribucion de huevos
usuario=""
contra=""
#contrap12
signopeso="$"
guion="-"
seleccion=""
separafechas="/"
nombredia="Dia:"
nombremes="Mes:"
nombreanio="Anio:"
#variables de huevos opciona a principal
gallina=0
pato=0
codorniz=0
avestruz=0
#nombres
gallinaa="gallina "
patoo="pato "
codornizz="codorniz "
avestruzz="avestruz "
#variables de despacho 

correlativoid=""
listacorrelativo=[]

rut=0
listarut=[]

guiondelrut=0
listaguiondelrut=[]

nombreorazo=""
listanombreorazon=[]

listahuevoescogido=[]
listapreciohuevoescogido=[]

convenio=""
listaconvenio=[]

calle=""
listacalle=[]

numero=0
listanumero=[]

dia=0
listadia=[]
mes=0
listames=[]
anio=0
listaanio=[]

cantidaddehuevos=0
listacantidadehuevos=[]
#cuenta los depachos realizados
despachorealizado=0
#menu d opcion b
buscarporrut=0
buscarporguion=0
guardaposiciondei=-1

#menu d opcion a
buscarpordia=0
buscarpormes=0
buscarporanio=0

calculaelpreciofinal=0
calculopreciosi=0
#gustavo romero alvarez
i=0

while True:
	
	usuario=raw_input("   Ingrese nombre de usuario: ")
	subprocess.call(["cmd.exe","/c","cls"])
	
	contra=raw_input("   Ingrese clave: ")
	
	if  usuario!="administrador inicial"or contra!="contra123":
		
		print "nombre de usuario o clave  incorrecto "
		print " "
		
	if usuario=="administrador inicial" and contra=="contra123":
		print "usuario y clave ingresados coreectamente" 
		break	

#accedido al sistema

subprocess.call(["cmd.exe","/c","cls"])
while True:
	print ""
	print ""
	print "                               sistema de distribucion de huevos"
	print " "
	print " "
	print "      _____________________________________________________"
	print "      |                                                    |"
	print "      |  opcion  a.  Asignacion de precios de Huevos       |   "
	print "      |                                                    |   "
	print "      |  opcion  b.  Creacion de despachos                 |"
	print "      |                                                    | "
	print "      |  opcion  c   Listar huevos                         |"
	print "      |                                                    |"
	print "      |  opcion  d   Listar despachos                      |"
	print "      |                                                    |"
	print "      |____________________________________________________|"
	print " "
	seleccion=raw_input("ingrese una opcion: ")
	while seleccion !="a" and seleccion !="b" and seleccion!="c" and seleccion!="d":
		print "opcion no valida"
		
		seleccion=raw_input("ingrese una opcion: ")
		
		
	if seleccion=="a":
		subprocess.call(["cmd.exe","/c","cls"])
		
		
		def muestramenu():
			print " "
			print "----------------------presione (d) para devolverse en el menu-------------------------------"
			print "                 "
			print " "
	

		#variables de huevos opciona a principal
		
			
			#solo gallina
		while True:			
			try:
				muestramenu()
				gallina=(raw_input("     ingrese precio de los huevos de la gallina :"))
				gallina=int(gallina)
				while gallina <50:
					print "el precio de los huevos de la gallina debe ser mayor o igual a 50"
					gallina=int(raw_input("     precio no valido reingresar precio :"))
				else:
					print "precio ingresado correctamente"
					print ""	
					break
			except ValueError:
				print "caracteres no validos" 


		
		#solo pato	
		while True:			
			try:
				subprocess.call(["cmd.exe","/c","cls"])
				
				muestramenu()
				pato=raw_input("     ingrese precio de los huevos de pato:")
				if pato=="d":
					break
				pato=int(pato)
				while pato<150:
					muestramenu()
					subprocess.call(["cmd.exe","/c","cls"])
					print "el precio de los huevos de pato debe ser mayor o igual a 150"
					muestramenu()
					pato=int(raw_input("     precio no valido reingresar precio :"))
				else:
					print "precio ingresado correctamente"
					print ""	
					break
			except ValueError:
				print "caracteres no validos" 
		#fin solo pato



				
			

		while pato =="d":
			
			muestramenu()
			#inici
			while True:		
				try:
					gallina=(raw_input("     ingrese precio de los huevos de la gallina:"))
					gallina=int(gallina)
					while gallina <50:
						print "el precio de los huevos de la gallina debe ser mayor o igual a 50"
						gallina=int(raw_input("     precio no valido reingresar precio :"))
					else:
						print "precio ingresado correctamente"
						print ""	
						break
				except ValueError:
					print "caracteres no validos" 
				
			
			
			while True:			
				try:
					pato=raw_input("     ingrese precio de los huevos de pato:")
					if pato=="d":
						break
					pato=int(pato)
					while pato<150:
						print "el precio de los huevos de pato debe ser mayor o igual a 150"
						pato=int(raw_input("     precio no valido reingresar precio :"))
					else:
						print "precio ingresado correctamente"
						print ""	
						break
				except ValueError:
					print "caracteres no validos" 

			#fin pato 
		
		#solo codorniz

		while True:	
			try:
				subprocess.call(["cmd.exe","/c","cls"])
				muestramenu()
				codorniz=(raw_input("     ingrese precio de huevos de codorniz:"))
				if codorniz=="d":
					break
				codorniz=int(codorniz)	
				while codorniz <50:
					print "     el preciode huevos de codorniz debe ser mayor o igual a 50"
					codorniz=int(raw_input("reingrese un precio valido :"))
				else:
					print "precio ingresado correctamente"
					print ""	
					break
			except ValueError:
				print "caracteres no validos" 

	

		#fin solo codorniz

		while codorniz=="d":
			subprocess.call(["cmd.exe","/c","cls"])
			muestramenu()
			#inicio pato
			while True:			
				try:
					pato=raw_input("     ingrese precio de los huevos de pato:")
					if pato=="d":
						break
					pato=int(pato)
					while pato<150:
						print "el precio de los huevos de pato debe ser mayor o igual a 150"
						pato=int(raw_input("     precio no valido reingresar precio :"))
					else:
						print "precio ingresado correctamente"
						print ""	
						break
				except ValueError:
					print "caracteres no validos" 		
					
			#fin inicio
		
			while pato =="d":
				muestramenu()
				#inicio gallina
				while True:			
						try:
							gallina=(raw_input("     ingrese precio de los huevos de la gallina:"))
							gallina=int(gallina)
							while gallina <50:
								print "el precio de los huevos de la gallina debe ser mayor o igual a 50"
								gallina=int(raw_input("     precio no valido reingresar precio :"))
							else:
								print "precio ingresado correctamente"
								print ""	
								break
						except ValueError:
							print "caracteres no validos" 			
				
				#fin gallina
			
				muestramenu()
				#inicio pato
				while True:			
					try:
						pato=raw_input("     ingrese precio de los huevos de pato:")
						if pato=="d":
							break
						pato=int(pato)
						while pato<150:
							print "el precio de los huevos de pato debe ser mayor o igual a 150"
							pato=int(raw_input("     precio no valido reingresar precio :"))
						else:
							print "precio ingresado correctamente"
							print ""	
							break
					except ValueError:
						print "caracteres no validos" 		
							
				#fin inicio pato
				
			muestramenu()
			#inicio codorniz	
			while True:	
				try:
					codorniz=(raw_input("     ingrese precio de huevos de codorniz:"))
					if codorniz=="d":
						break
					codorniz=int(codorniz)	
					while codorniz <50:
						print "el preciode huevos de codorniz debe ser mayor o igual a 50"
						codorniz=int(raw_input("     reingrese un precio valido :"))
					else:
						print "precio ingresado correctamente"
						print ""	
						break
				except ValueError:
					print "caracteres no validos" 	
					
			#fin codorniz
			
			#avestruz
		muestramenu()
		#inicio avestruz sola
		while True:
			try:
				subprocess.call(["cmd.exe","/c","cls"])
				muestramenu()
				avestruz=(raw_input("     ingrese precio de huevos de avestruz:"))
				if avestruz=="d":
					break
				avestruz=int(avestruz)	
				while avestruz <800:
					print "   el precio de huevos de avestruz debe ser mayor o igual a 800"
					avestruz=int(raw_input("     reingrese precio :"))
				else:
					print "precio ingresado correctamente"
					print ""	
					break
			except ValueError:
				print "caracteres no validos" 
		#fin avestruz sola
		

		while avestruz=="d":
			muestramenu()
			#inicio  de codornyz
			while True:	
				try:
					codorniz=(raw_input("     ingrese precio de huevos de codorniz:"))
					if codorniz=="d":
						break
					codorniz=int(codorniz)	
					while codorniz <50:
						print "el preciode huevos de codorniz debe ser mayor o igual a 50"
						codorniz=int(raw_input("     reingrese un precio valido :"))
					else:
						print "precio ingresado correctamente"
						print ""	
						break
				except ValueError:
					print "caracteres no validos" 		
			
			#fin de codornyz
			
			while codorniz=="d":
				muestramenu()
				#inicio pato
				while True:			
					try:
						pato=raw_input("     ingrese precio de los huevos de pato:")
						if pato=="d":
							break
						pato=int(pato)
						while pato<150:
							print "el precio de los huevos de pato debe ser mayor o igual a 150"
							pato=int(raw_input("precio no valido reingresar precio :"))
						else:
							print "precio ingresado correctamente"
							print ""	
							break
					except ValueError:
						
						print "caracteres no validos" 		
				
				#fin pato
				subprocess.call(["cmd.exe","/c","cls"])
				
				while pato =="d":
					
					muestramenu()
					#inicio de gallina
					while True:			
							try:
								gallina=(raw_input("     ingrese precio de los huevos de la gallina:"))
								gallina=int(gallina)
								while gallina <50:
									print "el precio de los huevos de la gallina debe ser mayor o igual a 50"
									gallina=int(raw_input("     precio no valido reingresar precio :"))
								else:
									print "precio ingresado correctamente"
									print ""	
									break
							except ValueError:
								print "caracteres no validos" 			
									
					#fin menu de gallina
					subprocess.call(["cmd.exe","/c","cls"])
					muestramenu()
					#inicio menu pato
					while True:			
						try:
							pato=raw_input("     ingrese precio de los huevos de pato:")
							if pato=="d":
								break
							pato=int(pato)
							while pato<150:
								print "el precio de los huevos de pato debe ser mayor o igual a 150"
								pato=int(raw_input("     precio no valido reingresar precio :"))
							else:
								print "precio ingresado correctamente"
								print ""	
								break
						except ValueError:
							print "caracteres no validos" 			
								
								
					#fin menu de pato
					subprocess.call(["cmd.exe","/c","cls"])
				muestramenu()
				#inicio menu de codorniz	
				while True:	
					try:
						codorniz=(raw_input("     ingrese precio de huevos de codorniz:"))
						if codorniz=="d":
							break
						codorniz=int(codorniz)	
						while codorniz <50:
							print "el preciode huevos de codorniz debe ser mayor o igual a 50"
							codorniz=int(raw_input("reingrese un precio valido :"))
						else:
							print "precio ingresado correctamente"
							print ""	
							break
					except ValueError:
						print "caracteres no validos" 			
							
				
				#fin menu de codorniz
				subprocess.call(["cmd.exe","/c","cls"])	
			muestramenu()	
			#inicio avestruz
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					muestramenu()
					avestruz=(raw_input("   ingrese precio de huevos de avestruz:"))
					if avestruz=="d":
						break
					avestruz=int(avestruz)	
					while avestruz <800:
						print "   el precio de huevos de avestruz debe ser mayor o igual a 800"
						avestruz=int(raw_input("     reingrese precio :"))
					else:
						print "precio ingresado correctamente"
						break
						
				except ValueError:
					print "caracteres no validos"		

	
	#fin
				
	if  seleccion=="b":
		
		if gallina!=0 and pato!=0 and avestruz!=0 and codorniz!=0:
			print "           creacion de despacho"
			print " "
			subprocess.call(["cmd.exe","/c","cls"])
			correlativoid=raw_input("   ingrese id del del correlativo del despacho: ")
			listacorrelativo.append(correlativoid)
			print " "
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					rut=int(raw_input("   ingre su rut sin guion : "))
					while rut <1:
						subprocess.call(["cmd.exe","/c","cls"])
						rut=int(raw_input("   rut no valido reingre un rut valido :"))
					else:
						print "rut ingresado correctamente"	
						break
				except ValueError :
					print "caracteres no validos "	
			listarut.append(rut)		
					
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					guiondelrut=int(raw_input("   ingrese su digito verificador: "))
					while guiondelrut <1 or guiondelrut >100:
						guiondelrut=int(raw_input("   ingrese un digito verificado valido: "))
					else:
						break	
				
				except ValueError :
					print "caracteres no validos "	
			listaguiondelrut.append(guiondelrut)
			subprocess.call(["cmd.exe","/c","cls"])		
			
			nombreorazo=raw_input("   ingrese nombre o razon social: ")
			listanombreorazon.append(nombreorazo)
			print ""
			print "        seleccione un tipo  de huevo               "
			print " "
			print "opcion a :huevo de gallina   $",gallina
			print "opcion b :huevo de pato      $",pato
			print "opcion c : huevo de codorniz $",codorniz
			print "opcion d :huevo de avestruz  $",avestruz
			print ""
			
			seleccion=raw_input("ingrese una opcion: ")
			while seleccion !="a" and seleccion !="b" and seleccion!="c" and seleccion!="d":
				print "opcion no valida"
				seleccion=raw_input("ingrese una opcion")
			if seleccion=="a":
				print "escogido huevo de ", gallinaa,gallina
				listahuevoescogido.append(gallinaa)
				listapreciohuevoescogido.append(gallina)
				
			if seleccion=="b":
				print "huevo escogido de :",patoo,pato
				listahuevoescogido.append(patoo)
				listapreciohuevoescogido.append(pato)
			
			if seleccion=="c":
				print "huevo escogido de :",codornizz,codorniz
				listahuevoescogido.append(codornizz)
				listapreciohuevoescogido.append(codorniz)	
			
			if seleccion=="d":
				print "huevo escogido de :",avestruzz,avestruz
				listahuevoescogido.append(avestruzz)
				listapreciohuevoescogido.append(avestruz)
			
			
			convenio=raw_input("tiene convenio (si o no):")
			while convenio !="si" and convenio!="no":
				print "opcion no valida"
				convenio=raw_input("tiene convenio (si o no):")
			listaconvenio.append(convenio)	
			#inicio de direccion
			subprocess.call(["cmd.exe","/c","cls"])
			print "domicilio donde se realizara el despacho"
			calle=raw_input("ingrese nombre de la calle: ")	
			listacalle.append(calle)
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					numero=int(raw_input("ingrese numero de domicilio: "))
					break
				except ValueError:
					print "caracteres no validos"
			listanumero.append(numero)		
						
			print "ingrese fecha comprometida"	
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					dia=int(raw_input("  ingrese dia: "))
					while dia <1 or dia >31:
						print "  dia no validoa ingrese un digito de 1 al 31"
						dia=int(raw_input("  ingrese dia: "))
					else:
						print "dato ingresado correctamente"
						break	
				except ValueError:
					print "caracteres no validos" 	
			listadia.append(dia)			
					
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					mes=int(raw_input("  ingrese mes: "))
					while mes <1 or mes >12:
						print "  mes no validoa ingrese un digito del 1 al 12"
						mes=int(raw_input("  ingrese mes: "))
					else:
						print "dato ingresado correctamente"
						break	
				except ValueError:
					print "caracteres no validos" 
			listames.append(mes)				
					
			
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					anio=int(raw_input("  ingrese anio: "))
					while anio<2016 or anio >2018:
						print " anio no valido"
						anio=int(raw_input("  ingrese anio: "))
					else:
						print "dato ingresado correctamente"
						break	
				except ValueError:
					print "caracteres no validos" 
			listaanio.append(anio)		
					
			while True:
				try:
					subprocess.call(["cmd.exe","/c","cls"])
					cantidaddehuevos=int(raw_input("  ingrese cantidad de huevos a enviar: "))
					while cantidaddehuevos<50 or cantidaddehuevos>10000:
						print " cantidad de huevos no valida"
						cantidaddehuevos=int(raw_input("  ingrese cantidad de huevos a enviar: "))
					else:
						print "dato ingresado correctamente"
						break	
				except ValueError:
					print "caracteres no validos" 
			listacantidadehuevos.append(cantidaddehuevos)																		
					
			print "el registro se realizo correctamente"
			seleccion=""		
	

			
		else:
			print "   para generar un despacho se deben ingresar los precios de los huevos "
			print "   para ingresar precios de los huevos opcion a"
			print " "
			seleccion=""	
	#inicio menu c listar huevos		
	if seleccion=="c":
		
		print "     ---------------- listado de huevos---------------------------"
		print "    precio huevo de gallina :$",gallina
		print "    precio huevo de pato    :$",pato
		print "    precio huevo de codorniz:$",codorniz
		print "    precio huevo de avestruz:$",avestruz	
		print "    --------------------------------------------------------------"	

	if seleccion=="d":
		if rut!=0:
			print "                            menu d                   "
			print "opcion a :buscar por fecha comprometida"
			print "opcion b: buscar por rut "
			print "opcion c:listar todo"
			seleccion=raw_input("ingrese una opcion: ")
			while seleccion !="a" and seleccion !="b" and seleccion!="c" :
				print "opcion no valida"
				seleccion=raw_input("ingrese una opcion: ")	
				
				
			if seleccion=="a":
				print "--------------------buscar por fecha comprometida-------------------------"
				print " "
				while True:
					try:
						
						buscarpordia=int(raw_input("ingrese dia: "))
						while buscarpordia<1 or buscarpordia >31:
							print "dia del mes no valido"
							buscarpordia=int(raw_input("ingrese dia: "))
						else:
							print "dia ingresado correctamente"
							break
					except ValueError:
						print "caracteres no validos"
						
				while True:
					try:
						buscarpormes=int (raw_input("ingrese mes: "))
						while buscarpormes<0 or buscarpormes>12:
							print "mes no valido digite un numero del 1 al 12"
							buscarpormes=int (raw_input("ingrese mes: "))
						else:
							print "dato ingresado correctamente"
							break
					except ValueError:
						print "caracteres no validos"
						
				while True:
					try:
						buscarporanio=int(raw_input("ingrese anio: "))
						while buscarporanio<2016 or buscarporanio >2018:
							print "anio no valido"
							buscarporanio=int(raw_input("ingrese anio: "))
						else:
							print "dato ingresado correctamente"
							break
					except ValueError:
						print "caracteres no validos"
				#comienzo de validacion
				i=0
				while i<len(listadia):
					
					
					if listadia[i]==buscarpordia and listames[i]==buscarpormes	and listaanio[i]==buscarporanio:
						guardaposiciondei=i
						#comienzo
						guardaposiciondei=guardaposiciondei+1
						
						print"       despacho numero:",guardaposiciondei
						guardaposiciondei=guardaposiciondei-1
						print" "
						print "      ___________________________Despacho___________________________________________________"
						print " "
						print "      id del correlativo :",listacorrelativo[guardaposiciondei]
						print "      rut del cliente:",listarut[guardaposiciondei],guion,listaguiondelrut[guardaposiciondei]
						print "      nombre o razon social:",listanombreorazon[guardaposiciondei]
						print "      huevo escogido:",listahuevoescogido[guardaposiciondei],signopeso,listapreciohuevoescogido[guardaposiciondei]
						print "      convenio :",listaconvenio[guardaposiciondei]
						print "      calle:",listacalle[guardaposiciondei]
						print "      numero de domicilio:",listanumero[guardaposiciondei]
						print "      fecha de despacho:",nombredia,listadia[guardaposiciondei],separafechas,nombremes,listames[guardaposiciondei],separafechas,nombreanio,listaanio[guardaposiciondei]
						print "   "
						print  "cantidad de huevos:",listacantidadehuevos[guardaposiciondei]
						#inicio de calculo
						if listaconvenio[guardaposiciondei]=="no":
							calculaelpreciofinal=(listacantidadehuevos[guardaposiciondei])*(listapreciohuevoescogido[guardaposiciondei])
							print "      precio final de despacho",calculaelpreciofinal
						if listaconvenio[guardaposiciondei]=="si":
							calculaelpreciofinal=(listacantidadehuevos[guardaposiciondei])*(listapreciohuevoescogido[guardaposiciondei])
							calculopreciosi=calculaelpreciofinal-(calculaelpreciofinal*0.1)
						print "   precio final de despacho",calculopreciosi							
					
						print "       fin de despacho"
				
						print "       _______________________________________________________________________________________"
						#se restablece valor original 
						guardaposiciondei=-1					
															
					i+=1
					seleccion=""												
				
					

					
				
				
			if seleccion=="b":
				print "-------------------------------buscar por rut----------------------------"
				print " "	
				while True:
					
					try:
						buscarporrut=int(raw_input("ingrese rut sin digito verificador: "))
						while buscarporrut<1:
							print "digito invalido"
							buscarporrut=int(raw_input("ingrese rut :"))
						else:
							print "rut valido"
							break
					except ValueError:
						print "caracteres no validos"		
				
				while True:
					try:
						buscarporguion=int(raw_input("ingrese digito verificador :"))
						while  buscarporguion<1 or buscarporguion >100:
							print "digito verificador no valido"
							buscarporguion=int(raw_input("ingrese digito verificador :"))
						else:
							print "digito verificado valido"
							break
					except ValueError:
						print "caracteres no validos"
				#inicio del buscador
				i=0
				while i <len(listaguiondelrut):
					
				
					if 	listaguiondelrut[i]==buscarporguion and listarut[i]==buscarporrut:
						guardaposiciondei=i
						
						guardaposiciondei=guardaposiciondei+1
						
						print"       despacho numero:",guardaposiciondei
						guardaposiciondei=guardaposiciondei-1
						print" "
						print "      ___________________________Despacho___________________________________________________"
						print " "
						print "      id del correlativo :",listacorrelativo[guardaposiciondei]
						print "      rut del cliente:",listarut[guardaposiciondei],guion,listaguiondelrut[guardaposiciondei]
						print "      nombre o razon social:",listanombreorazon[guardaposiciondei]
						print "      huevo escogido:",listahuevoescogido[guardaposiciondei],signopeso,listapreciohuevoescogido[guardaposiciondei]
						print "      convenio :",listaconvenio[guardaposiciondei]
						print "      calle:",listacalle[guardaposiciondei]
						print "      numero de domicilio:",listanumero[guardaposiciondei]
						print "      fecha de despacho:",nombredia,listadia[guardaposiciondei],separafechas,nombremes,listames[guardaposiciondei],separafechas,nombreanio,listaanio[guardaposiciondei]
						print "       cantidad de huevos:",listacantidadehuevos[guardaposiciondei]
						if listaconvenio[guardaposiciondei]=="no":
							calculaelpreciofinal=(listacantidadehuevos[guardaposiciondei])*(listapreciohuevoescogido[guardaposiciondei])
							print "      precio final de despacho",calculaelpreciofinal
						if listaconvenio[guardaposiciondei]=="si":
							
							calculaelpreciofinal=(listacantidadehuevos[guardaposiciondei])*(listapreciohuevoescogido[guardaposiciondei])
							calculopreciosi=calculaelpreciofinal-(calculaelpreciofinal*0.1)
						print "   precio final de despacho",calculopreciosi	
			
						print "       fin de despacho"					
						print "       fin de despacho"
						print "       _______________________________________________________________________________________"
						#se restablece valor original 
						guardaposiciondei=-1
						
					i+=1
					seleccion=""	
											
			if seleccion=="c":
				
				
				while i<len(listacalle):
					
					despachorealizado=i+1
					print"       despacho numero:",despachorealizado
					print" "
					print "      ___________________________Despacho___________________________________________________"
					print " "
					print "      id del correlativo :",listacorrelativo[i]
					print "      rut del cliente:",listarut[i],guion,listaguiondelrut[i]
					print "      nombre o razon social:",listanombreorazon[i]
					print "      huevo escogido:",listahuevoescogido[i],signopeso,listapreciohuevoescogido[i]
					print "      convenio :",listaconvenio[i]
					print "      calle:",listacalle[i]
					print "      numero de domicilio:",listanumero[i]
					print "      fecha de despacho:",nombredia,listadia[i],separafechas,nombremes,listames[i],separafechas,nombreanio,listaanio[i]
					print "      cantidad de huevos:",listacantidadehuevos[i]
					#calculo de precio final
					if listaconvenio[i]=="no":
						calculaelpreciofinal=(listacantidadehuevos[i])*(listapreciohuevoescogido[i])
						print "      precio final de despacho",calculaelpreciofinal
					if listaconvenio[i]=="si":
						calculaelpreciofinal=(listacantidadehuevos[i])*(listapreciohuevoescogido[i])
						calculopreciosi=calculaelpreciofinal-(calculaelpreciofinal*0.1)
						print "   precio final de despacho",calculopreciosi	
					print "       fin de despacho"
					print "       _______________________________________________________________________________________"
					
				
					print"  "
					i+=1
				seleccion=""	
				#restableciendo i para volver a usarla
				i=0	
						
		else:
			seleccion=""
			print "no se ha creado un despacho "												
									
																												
				
