#asterisco inverso y arreglo
ast="*"
es=" "
i=1
numero=0
x=0
c=1
numero=int (raw_input("ingrese numero"))
while i<=numero:
	x=c*es
	print x,numero*ast,x,numero*ast
	numero=numero-1
	c+=1

