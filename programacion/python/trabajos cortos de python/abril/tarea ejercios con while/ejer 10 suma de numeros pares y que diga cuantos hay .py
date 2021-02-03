#ejercicio 10 que imprima la suma de todos los numeros pares y que diga cuantos hay
i=2
contador=0
acumulador=0

while i <=100:
	print i
	acumulador=acumulador+i
	print "el acumulador es",acumulador
	i+=2
	contador=contador+1
	
	
print "la suma de todos los numeros pares es ", acumulador
print "la cantidad de numeros que hay es",contador
