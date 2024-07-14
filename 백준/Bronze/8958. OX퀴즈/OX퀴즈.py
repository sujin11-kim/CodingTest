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
            result += count
        elif answer == 'X':
            count = 0
            
    print(result)

