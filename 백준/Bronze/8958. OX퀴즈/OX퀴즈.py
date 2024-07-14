import sys

N = int(input())
count = 0
result = 0

for _ in range(N):
    count = 0
    result = 0
    answers = sys.stdin.readline().rstrip()
    for answer in answers:
        if answer == 'O':
            count += 1
        elif answer == 'X':
            for i in range(1, count+1):
                result += i
            count = 0
    if count != 0:
        for i in range(1, count + 1):
            result += i
    print(result)

