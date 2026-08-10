class Solution(object):
    def isValid(self, s):
        lih=[]
        dih={"(":")","{":"}","[":"]"}
        if s=="":return False
        for i in s:
            if i in "({[":
                lih.append(i)
            elif not lih or i!=dih[lih[-1]]:
                return False
            else:lih.pop()
        return not lih