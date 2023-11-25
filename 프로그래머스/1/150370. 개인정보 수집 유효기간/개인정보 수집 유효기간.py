def solution(today, terms, privacies):
    answer = []
    
    year, month, day = map(int, today.split("."))
    today_num = year * 28 * 12 + month * 28 + day
    
    terms_dict = {}
    
    for i in range(len(terms)):
        terms_parts = terms[i].split(" ")
        terms_dict[terms_parts[0]] = int(terms_parts[1])

    
    for i in range(len(privacies)):
        date, p_terms = privacies[i].split(" ")
        p_year, p_month, p_day = map(int, date.split("."))
        privacy_num = p_year * 28 * 12 + p_month * 28 + p_day + terms_dict[p_terms] *28

        if today_num >= privacy_num:
            answer.append(i+1)
 
    return answer