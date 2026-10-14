class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (num * 9 < sum)
            return "";
        StringBuilder output = new StringBuilder("9".repeat(sum / 9));
        sum %= 9;
        if (sum > 0)
            output.append(sum);
        output.append("0".repeat(num - output.length()));
        return output.toString();
    }
}