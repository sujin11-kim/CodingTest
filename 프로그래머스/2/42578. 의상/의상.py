def solution(clothes):
    answer = 1
    clothes_dict = {}
    
    for cloth in clothes:
        cloth_type = cloth[1]
        if cloth_type in clothes_dict:
            clothes_dict[cloth_type] += 1
        else:
            clothes_dict[cloth_type] = 2
    
    for v in clothes_dict.values():
        answer *= v
    
    return answer - 1