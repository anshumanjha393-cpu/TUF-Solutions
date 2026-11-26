class Solution {
    public int findPages(int[] nums, int m) {
        if(m>nums.length) return -1;
        int left=0;
        int sum=0;
        for(int num:nums){
            if(num>left){
                left=num;
            }
            sum+=num;
        }
        int right=sum;
        int ans=right;
        while(left<=right){
            int mid=(left+right)/2;
            if(canallocate(nums,mid,m)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
   
    }
    boolean canallocate(int[] nums,int max_distance,int m){
        int total=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(total+nums[i]>max_distance){
                count++;
                total=nums[i];
            }
            else{
                total+=nums[i];
            }
        }
        return count<=m;

    }
}