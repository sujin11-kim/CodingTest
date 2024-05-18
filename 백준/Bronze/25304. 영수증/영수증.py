total_money = int(input())
n = int(input())

total = 0

for i in range(n):
    money, count = map(int, input().split())
    total += money * count
    
if total_money == total:
    print("Yes")
else:
    print("No")

