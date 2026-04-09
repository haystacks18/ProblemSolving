r, c, n = map(int, input().split())

g1 = [list(map(lambda x: 0 if x=='O' else x, list(input()))) for _ in range(r)]

for gen in range(1, n+1):
    for i in range(r):
        for j in range(c):
            if g1[i][j] != '.':
                g1[i][j] += 1
    
    for i in range(r):
        for j in range(c):
            if g1[i][j] == 3:
                g1[i][j] = '.'
                for r_adj, c_adj in [[0,-1],[0,1],[-1,0],[1,0]]:
                    rr = i-r_adj
                    cc = j-c_adj
                    if 0<=rr<r and 0<=cc<c and g1[rr][cc] != 3:
                        g1[rr][cc] = '.'
    
    if gen%2 == 0:
        #set bombs
        for i in range(r):
            for j in range(c):
                if g1[i][j] == '.':
                    g1[i][j] = 0

    # for i in range(r):
    #     print(*g1[i], sep='')



g_ans = [list(map(lambda x: {0:'O', 1:'O', 2:'O', 'O':0, '.':'.'}[x], g1[i])) for i in range(r)]
for i in range(r):
    print(*g_ans[i], sep='')

    