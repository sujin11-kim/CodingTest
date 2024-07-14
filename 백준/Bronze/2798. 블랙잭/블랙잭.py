import itertools
import sys

N, card_num = map(int, sys.stdin.readline().split())
card_list = list(map(int, sys.stdin.readline().split()))

result = 0

for nums in itertools.combinations(card_list, 3):
    compare_num = sum(nums)
    if result < compare_num < card_num:
        result = compare_num
    elif compare_num == card_num:
        result = compare_num
        break

print(result)

