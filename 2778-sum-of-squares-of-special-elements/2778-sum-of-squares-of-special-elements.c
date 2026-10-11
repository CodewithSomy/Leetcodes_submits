int sumOfSquares(int* nums, int numsSize) {
    int n = numsSize;
    int sum = 0;

    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) {
            sum += nums[i - 1] * nums[i - 1];
            if (i * i != n) {
                int pair = n / i;
                sum += nums[pair - 1] * nums[pair - 1];
            }
        }
    }
    return sum;
}
