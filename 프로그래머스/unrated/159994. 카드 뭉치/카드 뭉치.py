def solution(cards1, cards2, goal):
    card1_num, card2_num = 0, 0
    
    for word in goal:
        print("target", word)
        if card1_num < len(cards1) and word == cards1[card1_num]:
                card1_num += 1
        elif card2_num < len(cards2) and word == cards2[card2_num]:
                card2_num += 1
        else:
            return "No"
    
    return "Yes"