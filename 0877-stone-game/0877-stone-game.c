bool stoneGame(int* piles, int pilesSize) {
    int n = pilesSize;
    int dp[n];
    for (int i = 0; i < n; i++) {
        dp[i]=piles[i];
    }
    for (int diff = 1; diff < n; diff++) {
        for (int left = 0; left < n - diff; left++) {
            int right = left + diff;
            dp[left] = fmax(piles[left] - dp[left + 1], piles[right] - dp[left]);
        }
    }
    return dp[0] >= 0;
}