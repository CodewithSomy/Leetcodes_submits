class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int p1 = 0, p2 = 1, p3 = 0;
        int first = 0, second = 0;
        int total_fill = 0, fill = 0, spill = 0;

        while (p2 < height.length) {
            first = height[p1];
            second = height[p2];

            if (first > second) {
                fill += first - second;
                spill += first - second;
                p2++;
            } else {
                total_fill += fill;
                fill = 0;
                spill = 0;
                p1 = p2;
                p3 = p1;
                p2++;
            }
        }

        if (spill > 0) {
            fill = 0;
            p1 = height.length - 1;
            p2 = p1 - 1;

            while (p2 >= p3) {
                first = height[p1];
                second = height[p2];

                if (first > second) {
                    fill += first - second;
                    p2--;
                } else {
                    total_fill += fill;
                    fill = 0;
                    p1 = p2;
                    p2--;
                }
            }
        }

        return total_fill;
    }
}