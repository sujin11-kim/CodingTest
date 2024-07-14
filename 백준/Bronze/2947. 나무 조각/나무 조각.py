import sys

array = list(map(int, sys.stdin.readline().split()))

while array != [1, 2, 3, 4, 5]:
    for i in range(1, 5):
        if array[i - 1] > array[i]:
            array[i-1], array[i] = array[i], array[i-1]
            print(*array)
        elif array == [1, 2, 3, 4, 5]:
            break
