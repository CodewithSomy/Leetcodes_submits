int compare(const void* a, const void* b) {
    return abs(*(const int*)b) - abs(*(const int*)a);
}

long long maxAlternatingSum(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), compare);
    
    long long tot=0;
    int mid=(numsSize+1)/2;
    for (int i=0;i<mid;i++){
        tot+=(long long)nums[i]*nums[i]; 
    }
    for (int i=mid;i<numsSize;i++){
        tot-=(long long)nums[i]*nums[i];
    }

    return tot;
}