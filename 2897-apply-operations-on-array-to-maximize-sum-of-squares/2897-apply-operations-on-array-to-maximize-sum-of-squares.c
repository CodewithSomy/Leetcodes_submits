int maxSum(int* nums, int numsSize, int k) {
    long MOD=1000000007;
    int *bits=calloc(30,sizeof(int));

    for(int j=0;j<numsSize;j++){
        for(int i=0;i<30;i++){
            if(nums[j] & (1 << i))
                bits[i]+=1;
        }
    }

    long ans=0,num;
    for(int x=0;x<k;x++){
        num=0;
        for(int i=0;i<30;i++){
            if(bits[i]>0){
                num |= (1<<i);
                bits[i]-=1;
            }
        }
        if(num==0) 
            break;
        ans=(ans+num*num)%MOD;
    }

    return ans;
}