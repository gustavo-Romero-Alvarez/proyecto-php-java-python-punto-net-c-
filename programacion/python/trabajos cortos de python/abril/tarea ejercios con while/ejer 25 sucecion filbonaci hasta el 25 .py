#escribir los primeros 25 numeros de la sucesion filbonacio
numero=0
ultimo=1
penultimo=0
i=0
while i<=25:
	
	penultimo=ultimo
	ultimo=numero
	numero=ultimo+penultimo
	print "numero:",numero
	i+=1
