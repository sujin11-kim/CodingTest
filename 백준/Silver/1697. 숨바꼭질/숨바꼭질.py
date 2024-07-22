import sys
input = sys.stdin.readline

from collections import deque

N, K = map(int, input().split())

queue = deque([(0, N)])
visited = set()
ans = 0

while queue:
    cnt, now = queue.popleft()

    if now == K:                            # 종료조건: K의 발견
        ans = cnt                           # BFS이므로 가장 먼저 탐색되는 곳이 최선임이 보장됨
        break

    elif now < 0 or now > 150000:           # 현재 위치가 범위를 벗어나는 경우 더이상 해당 위치에서 탐색하지 않음
        continue

    elif now in visited:                    # 이미 방문한 경우에도 더이상 해당 위치에서 탐색하지 않음
        continue

    else:
        visited.add(now)                    # 현재 위치를 방문지에 기록하고
        queue.append((cnt + 1, now - 1))    # 현 위치에서 갈 수 있는 곳들을 걸린 시간과 함께 튜플로 큐에 저장
        queue.append((cnt + 1, now + 1))
        queue.append((cnt + 1, now * 2))

print(ans)