class Solution {
    public int[] divisors(int n) {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;

    }
}