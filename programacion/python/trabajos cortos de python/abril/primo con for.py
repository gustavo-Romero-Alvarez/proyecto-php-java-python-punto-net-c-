#algoritmo imprime los numeros primos hasta 500
contador=0
sumador=0
dosfor=2


for primos in range (2,500):
	
	while sumador<=dosfor:
		sumador+=1						
		if dosfor%sumador==0 :
			contador+=1
		
		if sumador==dosfor:
			if contador==2:
				print "los numeros primos son ",dosfor
	contador=0
	sumador=0
	dosfor+=1												
				
