import sys
from itertools import combinations

height_list = []
for _ in range(9):
    height_list.append(int(sys.stdin.readline()))

for com in combinations(height_list, 7):
    if sum(com) == 100:
        for height in sorted(com):
            print(height)
        break
