x = input()
n = int(input())

for i in range(len(x)):
    print (x[i], end='')
    if (i+1)%n==0:
        print('')
