n = int(input())

count = 0

while n >= 0 :
  if n % 5 == 0:
    count += n // 5
    print(count)
    break
  elif n < 3:
    print(-1)
    break
  n -= 3
  count += 1
