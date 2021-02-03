#agregar la opcion crear menu eliminar elemento
e=""
lista=[]
a=0

while True :
	print "**********************************************"
	print "seleccione   ""1""    para agregar numeros"
	print "seleccione   ""2""    para eliminar numeros"
	print "seleccione   ""3""    para salir  "
	print "**************************************************"
	e=raw_input("")
	if e=="3":
		break
		
	if e=="1":
		
		a=(raw_input("ingrese elemento :"))

		lista.append(a);
	for elemento in lista :
		print elemento ,#la
			
	if e=="2":
		a=raw_input("que elemento desea remover: ")
		lista.remove(a)	


		
	
print "la lista ingresada es",lista	

		
		
