class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int idx=0;
        // int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                idx=i+1;
                break;

            }


        }
        return idx;
    
    }
}