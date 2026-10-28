class Solution {
    public int findMin(ArrayList<Integer> nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            ans=Math.min(ans,nums.get(i));
        }
        return ans;

      
    }
}
