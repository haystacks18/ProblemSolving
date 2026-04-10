a, b = map(int, input().split())

l1 = [a]
k = a
while True:
    s_k = str(k)

    now = 0
    for i in map(int, list(s_k)):
        now += i**b
        # print(i, now)

    if now in l1:
        ans = l1.index(now)
        break
    l1.append(now)
    k = now

print(ans)
