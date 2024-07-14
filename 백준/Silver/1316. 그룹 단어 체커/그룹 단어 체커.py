import sys

result = 0

for _ in range(int(sys.stdin.readline())):
    word = sys.stdin.readline().rstrip()
    visited = set(word[0])
    for i in range(1, len(word)):
        if word[i-1] != word[i] and word[i] in visited:
            break
        elif word[i] not in visited:
            visited.add(word[i])
    else:
        result += 1

print(result)