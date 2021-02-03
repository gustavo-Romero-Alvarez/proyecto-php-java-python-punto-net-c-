#notas con while
alumnos=""
nota1=0
nota2=0
nota3=0
continuar=""
promedio=0



print "escribir salir si desea salir  "
while (True) :

	
	alumnos=(raw_input("ingrese nombre del alumno: "))
	if alumnos=="salir":
		break
	
	nota1=float (raw_input("ingrese nota 1: "))
	while nota1<1 or nota1>7:
		nota1=float (raw_input("ingrese nota 1: "))
		
	nota2=float(raw_input("ingrese nota 2: "))
	while nota2<1 or nota2>7:
		nota2=float(raw_input("ingrese nota 2: "))
		
		
	nota3=float (raw_input("ingrese nota 3: "))
	while nota3<1 or nota3>7:
		nota3=float(raw_input("ingrese nota 3"))
	promedio=(nota1+nota2+nota3)/3
	
	print "alumno:",alumnos
	print "el promedio es:",promedio
	

		
	
