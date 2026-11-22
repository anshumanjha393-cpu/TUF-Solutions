class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
        int maxpile=0;
        for(int pile:nums){
            if(pile>maxpile){
                maxpile=pile;
            }
        }
        int left=1;
        int right=maxpile;
        int ans=maxpile;
        while(left<=right){
            int mid=(left+right)/2;
            long totalhrs=0;
            for(int i=0;i<nums.length;i++){
                totalhrs+=((long)nums[i]+mid-1)/mid;
                
            }
            if(totalhrs<=h){
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