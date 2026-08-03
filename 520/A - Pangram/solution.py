n = int(input())
s = input().lower()  # convert to lowercase
 
letters = set(s)
 
if len(letters) == 26:
    print("YES")
else:
    print("NO")