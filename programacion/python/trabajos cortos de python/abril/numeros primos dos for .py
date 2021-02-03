#numeros primos del 1 al 100 con dos for
c=0
dosenaumento=2
d=0
contador=0
for i in range (0,500):
	
	for j in range (0,dosenaumento):
		d=d+1
		if dosenaumento%d==0:
			
			contador+=1
		
	if contador==2:
		print dosenaumento
				
	dosenaumento=dosenaumento+1
	contador=0
	d=0				

	
	
	

