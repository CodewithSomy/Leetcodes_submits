class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        r=-1
        if(sum(gas)<sum(cost)):return r
        tank=0
        i=0
        while i<len(gas):
            for k in range(i,len(gas)):
                tank+=gas[k]-cost[k]
                if tank<0:
                    i=k+1
                    tank=0
                    break
            else:break
        return i