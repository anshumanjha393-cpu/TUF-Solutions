class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int max=0;
        int ans=Integer.MAX_VALUE;
        for(int val:map.keySet()){
            int freq=map.get(val);
            if(freq>max){
                max=freq;
                ans=val;
            }
           else  if(freq==max){
                ans=Math.min(ans,val);
            }


        }
        return ans;
     
    }
}


