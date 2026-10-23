class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int a=-1;
        int b=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int value:map.keySet()){
            if(map.get(value)>1){
                a=value;
            }
        }
        boolean[] present=new boolean[nums.length+1];
        present[0]=true;
        for(int i=1;i<=n;i++){
            int val=nums[i-1];
            present[val]=true;

            
        }
        for(int i=1;i<=n;i++){
            if(present[i]==false){
                b=i;
            }
        }
        return new int[]{a,b};


    }
}