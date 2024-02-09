n = int(input())
p = list(map(int, input().split()))
p = sorted(p)

count = 0

for i in range(n):
  for j in range(i+1):
    count += p[j]

print(count)