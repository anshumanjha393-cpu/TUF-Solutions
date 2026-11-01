class Solution {
    public void reverse(int[] nums, int n) {
        int left=0;
        int right=n-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
   
    }
}

