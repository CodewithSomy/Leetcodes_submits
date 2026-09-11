class Solution(object):
    def maximumDetonation(self, bombs):
        """
        :type bombs: List[List[int]]
        :rtype: int
        """
        n = len(bombs)
        g = [[] for _ in range(n)]
        for i in range(n - 1):
            x1, y1, r1 = bombs[i]
            for j in range(i + 1, n):
                x2, y2, r2 = bombs[j]
                dist = hypot(x1 - x2, y1 - y2)
                if dist <= r1:
                    g[i].append(j)
                if dist <= r2:
                    g[j].append(i)
        ans = 0
        for k in range(n):
            vis = {k}
            q = [k]
            for i in q:
                for j in g[i]:
                    if j not in vis:
                        vis.add(j)
                        q.append(j)
            if len(vis) == n:
                return n
            ans = max(ans, len(vis))
        return ans
        def can_detonate(i, j):
            bomb_i, bomb_j = bombs[i], bombs[j]
            return ((bomb_i[0] - bomb_j[0]) ** 2 +
                    (bomb_i[1] - bomb_j[1]) ** 2) <= bomb_i[2] ** 2
        
        def dfs(i):
            exploded.add(i)
            for j in range(len(bombs)):
                if  i == j:
                    continue
                if j not in exploded and can_detonate(i, j):
                    dfs(j)
        res = 0
        for i in range(len(bombs)):
            exploded = set()
            dfs(i)
            res = max(res, len(exploded))
        return res
        