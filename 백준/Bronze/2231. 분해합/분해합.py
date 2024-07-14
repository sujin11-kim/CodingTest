import sys

N = int(input())
result = []

for num in range(1, N+1):
    sum_num = sum(int(s) for s in str(num))
    if N == num + sum_num:
        result.append(num)

print(min(result) if result else 0)
