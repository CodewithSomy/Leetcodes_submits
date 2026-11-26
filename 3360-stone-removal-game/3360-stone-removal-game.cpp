class Solution {
public:
    bool canAliceWin(int n) {
        int A=10;
        bool res=false;
        int j=n;
        while (j>=A) {
            j-=A;
            A--;
            res= !res;
        }
        return res;
    }
};