
numero=0
i=1
acu=1
resultado=0

numero=int (raw_input("igrese numero: "))

while acu<numero:
	if numero%2!=0:
		numero=numero-1
	
	acu=i*2
	i=i+1
	resultado=acu+resultado
	print acu

	
print "el resultado es",resultado	
	
	
	

	

	
	

	
	
		

	
	
	
	
	 
