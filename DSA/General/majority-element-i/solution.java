class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=map.getOrDefault(nums[i],0)+1;
            if(count>max){
                max=count;
                ans=nums[i];
               
            }
             map.put(nums[i],count);
        }
        if(max>n/2){
            return ans;
        }
        return -1;
        
    }
}