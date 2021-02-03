#inicializacion
nombre=""
peso=0.0
altura=0.0
imc=0.0

nombre=raw_input ("ingrese nombre: ");
peso=float(raw_input("ingrese peso:"));

if peso <=0:
	print "peso no valido"
	peso=float(raw_input("ingrese peso:"));
	
	
altura=float(raw_input("ingrese altura:"));
if altura <=0:
	
	print "altura no valida"
	altura=float(raw_input("ingrese altura:"));
	
	
print "el nombre es:",nombre	


imc=peso/(altura**2)	

print "el imc es",imc

if imc <=16 :
	print "delgadez severa"
	
if imc >=16.01 and  imc <=16.99	:
	print "delgadez moderada"

if imc >=17  and imc <=18.49	:
	print "delgadez aceptable"

if imc >= 18.50 and imc <=24.99 :
	print "peso normal"

if imc >=25.00 and imc <=29.99:
	print "sobrepeso"
	
if imc >=30  and imc <=34.99:
	print "obeso tipo 1" 
	
if imc >=35  and imc <=40:
	print "obeso tipo 2" 
	
if imc >= 40:
	
	print "obeso tipo 3" 		
	
	
	
	
	
	
	
	
	
	
	
	
	
			
		
	
