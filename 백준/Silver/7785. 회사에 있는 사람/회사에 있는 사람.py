import sys

n = int(sys.stdin.readline())
company_dict = dict()

for i in range(n):
    name, status = sys.stdin.readline().split()
    company_dict[name] = status

enter_list = [key for key, value in company_dict.items() if value == 'enter']
enter_list.sort(reverse=True)

for name in enter_list:
    print(name)

