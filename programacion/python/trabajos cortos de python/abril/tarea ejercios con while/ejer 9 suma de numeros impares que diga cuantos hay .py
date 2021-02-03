#ejercicio 9 que imprima la suma de todos los numeros impares  que van del 1 al 100 y que diga cuantos hay
i=1
acumulador=0
contador=0

while i <=100:
	acumulador=acumulador+i
	
	print i
	contador=contador+1
	i+=2
	

print "la suma de todos los numeros es",acumulador
print "el total de numeros que hay son",contador
