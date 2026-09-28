import itertools

class Solution(object):
    R = [(1,0),(-1,0),(0,1),(0,-1)]
    B = [(1,1),(1,-1),(-1,1),(-1,-1)]
    Dirs = {"rook":R,"bishop":B,"queen":R+B}

    def countCombinations(self, pieces, positions):
        positions=[tuple(p) for p in positions]
        all_times=[]
        
        for piece,start in zip(pieces,positions):
            times=[[start]*8]
            for dr,dc in self.Dirs[piece]:
                path=[]
                r,c=start
                while (1<=r+dr<=8)and(1<=c+dc<=8):
                    r+=dr
                    c+=dc
                    path.append((r,c))
                    
                    all_steps=[start]+path+[path[-1]]*(7-len(path))
                    times.append(all_steps)
                    
            all_times.append(times)
        total_valid = 0

        for combo in itertools.product(*all_times):
            if all(len(set(seconds)) == len(seconds) for seconds in zip(*combo)):
                total_valid += 1

        return total_valid
