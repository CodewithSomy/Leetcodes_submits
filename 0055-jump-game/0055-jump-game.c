#include <stdbool.h>

bool canJump(int *nums, int numsSize) {
    int goal = numsSize - 1;
    for (int j = numsSize - 2; j >= 0; j--) {
        if (j + nums[j] >= goal) {
            goal = j;
        }
    }
    return goal == 0;
}
