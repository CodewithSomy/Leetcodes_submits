class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) return "";
        StringBuilder output=new StringBuilder();
        int ସଂଖ୍ୟା;
        for (int i=0;i<num;i++) {
            ସଂଖ୍ୟା=Math.min(sum,9);
            output.append(ସଂଖ୍ୟା);
            sum-=ସଂଖ୍ୟା;
        }
        return output.toString();
    }
}