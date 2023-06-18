def solution(park, routes):
    location = []
    X_location = []
    row = len(park)-1
    column = len(park[0])-1

    for i, row_val in enumerate(park):
        for j, element in enumerate(row_val):
            if element == 'S':
                location = [i, j]
            elif element == 'X':
                X_location.append([i, j])
    current_location = []
    
    for i in routes:
        current_location = location[:]
    
        direction = i.split()
        if direction[0] == 'E':
            for i in range(int(direction[1])):
                location[1] += 1
                print(location)
                if location in X_location or location[1] > column:
                    location = current_location
                    break
        elif direction[0] == 'W':
            for i in range(int(direction[1])):
                location[1] -= 1
                print(location)
                if location in X_location or location[1] < 0:
                    location = current_location
                    break
        elif direction[0] == 'S':
            for i in range(int(direction[1])):
                location[0] += 1
                if location in X_location or location[0] > row:
                    location = current_location
                    break
        elif direction[0] == 'N':
            for i in range(int(direction[1])):
                location[0] -= 1
                if location in X_location or location[0] < 0:
                    location = current_location
                    break
    
    return location