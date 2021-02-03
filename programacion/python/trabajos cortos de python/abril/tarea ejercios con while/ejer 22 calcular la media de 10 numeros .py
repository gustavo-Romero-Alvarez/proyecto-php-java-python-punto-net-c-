#ejercicio 22 calcular la media de 10 numeros

i=1
numero=0
sumatoria=0
promedio=0
c=0

while i<=10:
	numero=float(raw_input("ingrese n"))
	
	sumatoria=sumatoria+numero
	print i
	i+=1
	
promedio=sumatoria/10
print "el promedio es",promedio
