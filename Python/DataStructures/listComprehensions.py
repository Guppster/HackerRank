X = int(raw_input())
Y = int(raw_input())
Z = int(raw_input())
N = int(raw_input())
print([[i,j,k] for i in range(X+1) for j in range(Y+1) for k in range(Z+1) if sum([i,j,k]) != N])
