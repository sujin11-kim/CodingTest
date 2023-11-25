def solution(t, p):
    answer = 0
    for i in range(len(t)-len(p)+1):
        t_num = int(t[i:i+len(p)])
        if t_num <= int(p):
            answer += 1
    return answer