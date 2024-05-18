n = int(input())
arr = list(map(int, input().split()))
max_num  = arr[0]
min_num = arr[0]

for i in arr[1:]:
    if i < min_num:
        min_num = i
    elif i > max_num:
        max_num = i

print(min_num, max_num)