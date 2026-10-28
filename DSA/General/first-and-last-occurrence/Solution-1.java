class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerbound(nums,target);
        if(lb==nums.length||nums[lb]!=target) return new int[]{-1,-1};
        int ub=upperbound(nums,target);
        return new int[]{lb,ub-1};
    
    }private int lowerbound(int[] nums,int target){
        int ans=nums.length;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

    }
    private int upperbound(int[] nums,int target){
        int ans=nums.length;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}