class Solution {
    public int search(int[] nums, int k) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                ans=i;
            }
        }
        return ans;
       
    }
}
