class Solution {
    public int aggressiveCows(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=nums[n-1];
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(canweplace(nums,mid,k)){
                ans=mid;
                left=mid+1;
            }
            else{
                right =mid-1;

            }
        }
        return ans;
    
   
    }
    boolean canweplace(int[] nums,int min_d,int k){
        int cow_count=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=min_d){
                cow_count++;
                last=nums[i];
            }
            else{
                continue;
            }
        }
        return cow_count>=k;
    }
}

