class Solution {
    public static int findKthPositive(int[] nums, int k) {
        // Your code goes herein
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int missing=nums[mid]-(mid+1);
            if(missing<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return right+k+1;
    }
}