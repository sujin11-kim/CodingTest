import sys

array = list(map(int, sys.stdin.readline().split()))

while True:
    for i in range(1, 5):
        if array[i - 1] > array[i]:
            temp = array[i - 1]
            array[i - 1] = array[i]
            array[i] = temp
            print(*array)
            continue
        elif array == [1, 2, 3, 4, 5]:
            break
    if array == [1, 2, 3, 4, 5]:
        break
