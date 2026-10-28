class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return true;
            }
        }
        return false;
      
    }
}