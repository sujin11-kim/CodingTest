def solution(k, score):
    answer = []
    top_list = []
    
    for s in score:
        top_list.append(s)
        top_list.sort(reverse=True)  
        
        if len(top_list) < k:
            answer.append(top_list[-1])
        else:
            answer.append(top_list[k-1])
            
    return answer