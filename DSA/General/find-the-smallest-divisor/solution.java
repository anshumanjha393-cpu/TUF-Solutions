class Solution {
    public int smallestDivisor(int[] nums, int limit) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int ans=max;
        int left=1;
        int right=max;
        while(left<=right){
            int mid=(left+right)/2;
            int total=0;
            for(int i=0;i<nums.length;i++){
                total=total+(nums[i]+mid-1)/mid;


            }
            if(total<=limit){
                ans =mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

       
    }
}