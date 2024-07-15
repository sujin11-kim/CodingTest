N = int(input())

meetings = [list(map(int, input().split())) for _ in range(N)]
meetings.sort(key=lambda x: (x[1], x[0]))
standard = 0
cnt = 0

for s, e in meetings:
    if s >= standard:
        cnt += 1
        standard = e

print(cnt)
