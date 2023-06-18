def solution(keymap, targets):
    answer = []
    key_dict = {}
    
    for i, row in enumerate(keymap):
        for j, element in enumerate(row):
            if element in key_dict:
                if j < key_dict[element]:
                    key_dict[element] = j +1
            else:
                key_dict[element] = j +1
    
    for i, row in enumerate(targets):
        count = 0
        for element in row:
            if element in key_dict:
                count += key_dict[element]
            else:
                count = -1
                break
        answer.append(count)
        
    return answer