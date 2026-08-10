#include <stddef.h>

int findPoisonedDuration(int *timeSeries, int n, int duration) {
    int ans = 0;
    int i;
    if (n == 0) {
        return 0;
    }
    for (i = 1; i < n; i++) {
        int gap = timeSeries[i] - timeSeries[i - 1];
        ans += (duration < gap) ? duration : gap;
    }
    ans += duration;
    return ans;
}