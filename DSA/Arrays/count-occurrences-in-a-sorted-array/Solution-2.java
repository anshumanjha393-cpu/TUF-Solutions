class Solution {
    public int countOccurrences(int[] nums, int target) {
        // Your code goes here
        int lb=lowerbound(nums,target);
        if(lb==nums.length||nums[lb]!=target) {return 0;}
        int ub=upperbound(nums,target);
        return ub-lb;
    }
    private int lowerbound(int[] nums,int target){
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
