class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target){
                            List<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}