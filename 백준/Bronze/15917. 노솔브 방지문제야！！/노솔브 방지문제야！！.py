import sys
input = sys.stdin.readline

n = int(input())
out = []
for _ in range(n):
    a = int(input())
    if a & (a - 1) == 0:
        out.append('1')
    else:
        out.append('0')

sys.stdout.write('\n'.join(out))