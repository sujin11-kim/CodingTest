n = int(input())
s_len = 0

for i in range(n):
    s = input()
    s_len = len(s)
    print(s[0]+s[s_len-1])