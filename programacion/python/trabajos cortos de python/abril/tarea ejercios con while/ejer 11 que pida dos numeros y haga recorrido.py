#ejercicio numero 11 que pida dos numeros y haga recorrido
numero1=0
numero2=0
mayor=0
menor=0

numero1=int(raw_input("ingrese primer valor"))
numero2=int(raw_input ("ingrese segundo valor"))

while numero1==numero2:
	print "ambos numeros son iguales reingresar numeros"
	numero1=int(raw_input("ingrese primer valor"))
	
	numero2=int(raw_input ("ingrese segundo valor"))
	
if numero1<numero2:
	mayor=numero2
	menor=numero1	
	
if numero1>numero2:
	menor=numero2
	mayor=numero1	

while menor <=mayor:
	print menor
	menor=menor+1
