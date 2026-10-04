class Solution(object):   
    def checkValidString(self, s):
        op_count=0
        cl_count=0
        n = len(s)
        
        for i in range(n):
            if s[i]=='(' or s[i]=='*':
                op_count+=1
            else:op_count-=1
            
            if s[n-1-i]==')' or s[n-1-i]=='*':
                cl_count+=1
            else:cl_count-=1
            
            if op_count< 0 or cl_count< 0:
                return False
                
        return True
