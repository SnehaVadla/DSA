t = int(input())
for _ in range(t):
    n = input().strip()
    result = []
    length = len(n)
    for i, digit in enumerate(n):
        if digit != '0':
            zeros = length - i - 1
            result.append(int(digit + '0' * zeros))
    print(len(result))
    print(*result)