class Solution(object):
    def divide(self, dividend, divisor):
        if dividend==0:
            return 0
        if dividend==2147483648 and divisor==-1:
            return 2147483647

        negative=(dividend<0)^(divisor<0)
        absidend=abs(dividend)
        absisor=abs(divisor)
        quotient = 0
        for shift in range(31, -1, -1):
            if (absidend>>shift)>=absisor:
                absidend-=absisor<<shift
                quotient+=1<<shift
        result = -quotient if negative else quotient
        return max(-2147483648, min(2147483647, result))
