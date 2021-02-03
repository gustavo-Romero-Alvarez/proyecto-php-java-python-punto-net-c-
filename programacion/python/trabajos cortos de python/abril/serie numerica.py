#serie numerica
a=0
b=0
menor=0
mayor=0
a=0

a=int (raw_input("ingrese numero a:"))

b=int (raw_input("ingrese numero b:"))

while a==b:
	a=int (raw_input("ambos numeros son iguales:"))
	b=int (raw_input("ambos numeros son iguales:"))
	


if a<b:
	mayor=b
	
	menor=a
	
	
	
if b<a:
	mayor=a
	menor=b
	
	

print "menor",menor
print "mayor",mayor
while menor<=mayor:
	
	print "los numeros son",menor
	menor+=1
	
	
	

