class Solution {
    public int findMin(ArrayList<Integer> nums) {
        int left=0;
        int right=nums.size()-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums.get(mid)>nums.get(right)){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums.get(left);
      
    }
}
