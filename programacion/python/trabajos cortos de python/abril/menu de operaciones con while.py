#realizar un programa que muestre un menu con las operaciones
a=0
b=0
suma=0
resta=0
multi=0
divi=0
mod=0

entrada=0

while entrada !=6:
	
	print  "opcion 1 sumar"
	print  "opcion 2 restar "
	print  "opcion 3 multiplicar"
	print  "opcion 4 dividir"
	print  "opcion 5 el mod es"
	print  "opcion 6 salir" 
	entrada=int (raw_input("igrese entrada: "))
	if entrada==1:
		a=float (raw_input("ingrese valor de a: "))
		
		b=float (raw_input("ingrese valor de b: "))
		
		suma=a+b
		print "la suma de a y b es",suma
	
	if entrada==2:
		a=float(raw_input("ingrese el valor de a: "))
		b=float(raw_input("ingrese el valor de b: "))	
		resta=a-b
		
	if entrada==3:
		a=float(raw_input("ingrese el valor de a: "))
		b=float(raw_input("ingrese el valor de b: "))	
		multi=a*b
		print "el valor de a*b",multi	
	if entrada==4:
		a=float(raw_input("ingrese el valor de a :"))
		
		b=float(raw_input("ingrese el valor de b: "))
		while b==0:
			b=float(raw_input("ingrese el valor de b: "))
				
		divi=a/b
		print "el valor de a/b",divi	
	if entrada==5:
		a=float(raw_input("ingrese el valor de a :"))
		b=float(raw_input("ingrese el valor de b :"))	
		mod=a%b
		print "el mod es :",mod


