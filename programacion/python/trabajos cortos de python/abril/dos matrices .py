#dos matrices for
matriz= [[],[],[]]

e=0

c=0

n=0

while n<=2:
	
	while e<=2:
		c=int (raw_input("ingrese numero"))
		matriz[n].append(c)
		print matriz[n]
		e+=1
		 
	e=0;
	n+=1
print matriz


