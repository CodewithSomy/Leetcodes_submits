class Solution {
    static int binary(int[] nums, int target, int low, int high){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(target>nums[mid]){
            return binary(nums,target,mid+1,high);
        }else if(target<nums[mid]){
            return binary(nums,target,low,mid-1);
        }else return mid;

    }
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
}