N = int(input())
number_list = [int(input()) for _ in range(N)]
max_height = number_list[-1]

numbers = 1

for i in range(N-2, -1, -1):
    if max_height < number_list[i]:
        max_height = number_list[i]
        numbers += 1

print(numbers)