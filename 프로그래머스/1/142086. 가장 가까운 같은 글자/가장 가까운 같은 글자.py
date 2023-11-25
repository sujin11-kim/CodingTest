def solution(s):
    answer = [-1]
    dict = {s[0] : 0}
    s = s[1:]
    count = 0
    
    for word in s:
        count += 1
        if word in dict:
            answer.append(count - dict[word])
            dict[word] = count
        else:
            answer.append(-1)
            dict[word] = count
    
    return answer