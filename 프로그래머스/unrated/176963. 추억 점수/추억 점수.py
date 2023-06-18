def solution(name, yearning, photo):
    score_dict = {key:i for key, i in zip(name, yearning)}
    answer = []
    score = 0
    for i in photo:
        for j in i:
            if j in score_dict:
                score += score_dict[j]
        
        answer.append(score)  
        score = 0
        
    return answer