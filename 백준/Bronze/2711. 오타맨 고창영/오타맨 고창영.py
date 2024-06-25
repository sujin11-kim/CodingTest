T = int(input())

for i in range(T):
    N, S = input().split()
    N = int(N)
    print(S[0:N-1]+S[N:])