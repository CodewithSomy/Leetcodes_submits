class Solution {
    public int minMoves(int[] nums) {
        int mx = 0, output = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        for (int y : nums) {
            output += mx - y;
        }
        return output;
    }
}