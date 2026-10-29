class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int count=0;
        for(int i=0;i<=nums.size()-2;i++){
            if(nums.get(i)<nums.get(i+1)){
                count++;
            }
            else if(nums.get(i)>nums.get(i+1)){
                break;
            }
        }
        return count+1;
    
    }
}