class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=nums[n-1];
        int ans=0;
        while(left<=right){
            int mid =(left+right)/2;
            if(canplace(nums,mid,k)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
        
   
    }
    boolean canplace(int [] nums,int min_d,int k){
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
        if(cow_count>=k) return true;
        return false;
    }
}
