class Solution {
    public int longestConsecutive(int[] nums) {
        //this is just the test 
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1;
                int next=nums[i]+1;
                while(set.contains(next)){
                    count++;
                    next++;
                }max=Math.max(count,max);
            }
        }
        return max;

    }
}