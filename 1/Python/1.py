#numb = [1,-2,3,1]
numb = []

with open('input.txt', 'r') as f:
	for line in f:
		numb.append(int(line))

sum=0
sum_rec = []
for i in numb:
	sum = sum+ i
	sum_rec.append(sum)
print(sum)
		
#print(sum)

while True:
	for j in numb:
		sum = sum + j
		if sum in sum_rec:
			print(sum)
			break
#print(sum)
