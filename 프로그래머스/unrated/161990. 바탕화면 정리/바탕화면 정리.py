def solution(wallpaper):
    answer = []
    
    for i, row in enumerate(wallpaper):
        for j, element in enumerate(row):
            if element == '#':
                #print(i,j)
                if answer == []:
                    answer = [i, j, i+1, j+1]
                    print(answer)
                if i <= answer[0]:
                    answer[0] = i
                    print(answer)
                elif i >= answer[2]:
                    answer[2] = i+1
                    print(answer)
                    
                if j <= answer[1]:
                    answer[1] = j
                    print(answer)
                elif j >= answer[3]:
                    answer[3] = j+1
                    print(answer)
                
    return answer