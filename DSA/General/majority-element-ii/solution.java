class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet()){
            if(map.get(val)>n/3){
                ans.add(val);
            }
        }
        return ans;
        
    }
}