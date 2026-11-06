class Solution {
    public int secondMostFrequentElement(int[] nums) {
        int max=0;
        int sec_max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values()){
            if(freq>max){
                sec_max=max;
                max=freq;
            }
            else if(freq<max&&freq>sec_max){
                sec_max=freq;
            }
        }
        if(sec_max==0) return -1;
        int ans=Integer.MAX_VALUE;
        for(int num:map.keySet()){
            if(map.get(num)==sec_max){
                ans=Math.min(ans,num);
            }
        }
        return ans;

     
    }
}

