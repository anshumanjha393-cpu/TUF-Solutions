class Solution {
    public int countOccurrences(int[] arr, int target) {
        // Your code goes here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet()){
            if(val==target){
                return map.get(val);
            }
        }
        return 0;
    }
}
