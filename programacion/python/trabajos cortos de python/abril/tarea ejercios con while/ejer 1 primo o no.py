#ejercicio 1 primo o no primo
numero=0
i=0
contador=0

numero=float(raw_input("ingrese numero:"))

while i<=numero:
	i+=1
	if numero%i==0:
		contador+=1
	
	
if contador==2:
	print "es primo", numero
else:print "no es primo"	
