n, k = map(int, input().split())
array = []
count = 0

for i in range(n):
    array.append(int(input()))

array.sort(reverse=True)

for coin in array:
  if k < coin:
    continue
  count += k // coin
  k %= coin
print(count)

