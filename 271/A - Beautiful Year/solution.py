y = int(input())
 
while True:
    y += 1
    year_str = str(y)
    if len(set(year_str)) == len(year_str):
        print(y)
        break