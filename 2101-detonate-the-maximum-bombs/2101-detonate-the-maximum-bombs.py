import math
class Solution(object):
    def maximumDetonation(self,bombs):
        Adj_dih = {str(x): set() for x in range(len(bombs))}
        isinrange=lambda a,b:math.pow((a[0]-b[0]),2)+math.pow((a[1]-b[1]),2)<=math.pow(a[2],2)
        for i, first_bomb in enumerate(bombs):
            for j, next_bomb in enumerate(bombs):
                if i == j:
                    continue
                if isinrange(first_bomb, next_bomb):
                    Adj_dih[str(i)].add(j)
        max_deh = 1
        for bomb in range(len(bombs)):
            lih = set()
            def dfs(node):
                if node not in lih:
                    lih.add(node)
                    for nebor in Adj_dih[str(node)]:
                        dfs(nebor)
            dfs(bomb)
            max_deh = max(max_deh, len(lih))
        return max_deh