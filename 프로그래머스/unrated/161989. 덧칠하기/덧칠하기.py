def solution(n, m, section):
    answer = 1
    min_val = min(section)
    for value in section:
        if min_val <= value <= min_val + m - 1:
            continue
        else:
            min_val = value
            answer += 1

    return answer