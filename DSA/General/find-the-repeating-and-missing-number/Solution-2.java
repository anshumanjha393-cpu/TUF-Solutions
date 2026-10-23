class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int a=-1;
        int b=-1;
        int[] freq=new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                a=i;
            }
            if(freq[i]==0){
                b=i;
            }
        }
        return new int[]{a,b};

    }
}