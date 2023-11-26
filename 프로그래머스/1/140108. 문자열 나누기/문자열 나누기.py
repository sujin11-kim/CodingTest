def solution(s):
    answer = 0
    same_count = 0
    different_count = 0
    first_word = s[0]
    same_bool = False
    
    for compare_word in s:
        if same_bool == True:
            first_word = compare_word
            same_bool = False
            
        if first_word == compare_word:
            same_count += 1
        else:
            different_count += 1
        
        if same_count == different_count:
            answer += 1
            same_count = 0
            different_count = 0
            same_bool = True
        
    if different_count != 0 or same_count != 0:
        answer += 1
        
    return answer