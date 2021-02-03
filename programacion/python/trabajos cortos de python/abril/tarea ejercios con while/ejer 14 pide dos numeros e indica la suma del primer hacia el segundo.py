#ejercicio 14 pide dos numeros y suma los numeros que van del primer al segundo numero
numero1=0
numero2=0
menor=0
mayor=0
sumatoria=0

numero1=int(raw_input("ingrese numero 1:"))
numero2=int(raw_input("ingrese numero 2:"))

while numero1==numero2:
	print "ambos numeros son iguales reingresar nuevamente"
	numero1=int(raw_input("ingrese numero 1:"))
	numero2=int(raw_input("ingrese numero 2:"))
	
if numero1>numero2:
	menor=numero2
	mayor=numero1
	
if numero1<numero2:
	menor=numero1
	mayor=numero2		

while menor<=mayor:
	print menor
	sumatoria=sumatoria+menor
	print "la sumatoria es",sumatoria
	menor+=1
	
