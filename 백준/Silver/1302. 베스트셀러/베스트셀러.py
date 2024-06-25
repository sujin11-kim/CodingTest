N = int(input())
book_dict = dict()

for _ in range(N):
    book_name = input()
    book_dict[book_name] = book_dict.get(book_name, 0) + 1

max_num = 0

for book_name, sell_num in book_dict.items():
    if sell_num > max_num:
        max_num = sell_num
        best_book = book_name
    if sell_num == max_num:
        if book_name < best_book:
            best_book = book_name

print(best_book)
