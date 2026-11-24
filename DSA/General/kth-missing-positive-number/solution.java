class Solution {
    public static int findKthPositive(int[] nums, int k) {
        // Your code goes here
        int size=nums[nums.length-1];
        int[] present=new int[size+1];
        Arrays.fill(present,0);
        present[0]=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            present[val]=1;
        }
        int cnt=0;
        
        for(int i=1;i<present.length;i++){
            if(present[i]==0){
                cnt++;
                if(cnt==k){
                    return i;
                }
            }
        
            else{
                continue;
            }

            
        }
        return size+(k-cnt);
    }
}