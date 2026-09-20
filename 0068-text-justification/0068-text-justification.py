class Solution(object):
    def fullJustify(self,words,maxWidth):
        temp=[]
        ret=[]
        lenow=0
        i=0
        while i<len(words):
            if lenow+len(words[i])+len(temp)<=maxWidth:
                temp.append(words[i])
                lenow+=len(words[i])
                i+=1
            else:
                if len(temp)<2:
                    ret.append("".join(temp).ljust(maxWidth))
                else:
                    div,rem=divmod(maxWidth-lenow,len(temp)-1)
                    ret.append("".join([temp[j]+" "*(div+(j<rem))for j in range(len(temp)-1)]+[temp[-1]]))
                temp=[]
                lenow=0
        if temp:
            ret.append(" ".join(temp).ljust(maxWidth))
        return ret