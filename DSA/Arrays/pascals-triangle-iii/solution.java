class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> list =new ArrayList<>();
       
        
        for(int i=1;i<=n;i++){
            List<Integer> ans=new ArrayList<>();
            ans.add(1);
            
            int prod=1;
            for(int j=1;j<i;j++){
                prod=prod*(i-j);
                prod=prod/j;
                ans.add(prod);

            }
            list.add(ans);

        }
        return list;

    }
}