
class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {
        if(m*k>nums.length) return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int day:nums){
            if(day>max)max=day;
            if(day<min)min=day;
        }
        int ans=max;
while(min<=max){
    int mid=(min+max)/2;
    if(possible(nums,mid,m,k)){
        ans=mid;
        max=mid-1;
    }
    else{
        min=mid+1;
    }
}
return ans;
     
    }
    boolean possible(int[] nums,int day,int m,int k){
        int cnt=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                cnt++;
            }
            else{
                total+=cnt/k;
                cnt=0;
            }
        }
        total+=cnt/k;
        if(total>=m) return true;
        return false;
            
    }
}


