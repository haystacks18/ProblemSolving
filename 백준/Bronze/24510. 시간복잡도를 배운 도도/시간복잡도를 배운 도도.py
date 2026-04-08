n = int(input())


ans = 0
for _ in range(n):
    line = input()
    linecnt = 0
    linecnt += line.count('for')
    linecnt += line.count('while')

    ans = max(ans, linecnt)
print(ans)
