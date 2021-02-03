#ejercicio 12 que solicite dos numeros y muestre los numeros pares que hayan
numero1=0
numero2=0
menor=0
mayor=0

numero1=int (raw_input("ingrese valor a:"))
numero2=int (raw_input("ingrese el valor de b:"))

while numero1==numero2:
	print "ambos numero son iguales reingresar numeros"
	numero1=int (raw_input("ingrese valor a:"))
	numero2=int (raw_input("ingrese el valor de b:"))

if numero1<numero2:
	menor=numero1
	mayor=numero2
	if menor%2!=0:
		menor=menor+1
	
if numero1>numero2:
	
	menor=numero2
	mayor=numero1
	if menor%2!=0:
		menor=menor+1
	
while menor<=mayor:
	print menor
	menor=menor+2	
