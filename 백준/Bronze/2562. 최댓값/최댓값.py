max_num = 0
count = 0

for i in range(9):
    n = int(input())
    if max_num < n:
        max_num = n
        count = i+1

print(max_num)
print(count)