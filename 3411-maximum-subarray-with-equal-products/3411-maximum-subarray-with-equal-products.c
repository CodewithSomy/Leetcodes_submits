int maxLength(int*nums,int numsSize){
    int mask[]={0,0,1,2,1,4,3,8,1,2,5};
    int ans=2,l=0,used=0;
    for(int r=0;r<numsSize;r++){
        int m=mask[nums[r]];
        while(l<r&&(used&m)){
            used^=mask[nums[l++]];
        }
        used|=m;
        if(r-l+1>ans)ans=r-l+1;
    }
    return ans;
}
