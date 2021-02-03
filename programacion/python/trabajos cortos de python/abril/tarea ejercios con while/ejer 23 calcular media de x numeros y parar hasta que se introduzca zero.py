#ejercicio 23 calcular media de x numero se dejaran de ingresar numeros hasta que sea iwual a zero
numero=1348784783748,45
i=1
promedio=0
sumatoria=0
contador=0

print "para salir presione 0"
while numero!=0:
	numero=float(raw_input("ingresar numeros"))
	contador=contador+1
	sumatoria=sumatoria+numero

contador=contador-1
promedio=sumatoria/contador
print "el promedio de los numeros ingresados es",promedio
