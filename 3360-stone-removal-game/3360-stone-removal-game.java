class Solution {
    public boolean canAliceWin(int n) {
        int A=10;
        boolean res=false;
        int j=n;
        while (j>=A) {
            j-=A;
            A--;
            res= !res;
        }
        return res;
    }
}