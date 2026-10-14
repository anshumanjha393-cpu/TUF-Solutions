class Solution {
    public int[] pascalTriangleII(int r) {
    List<Integer> res=new ArrayList<>();
    res.add(1);
    int ans=1;
    for(int i=1;i<r;i++){
        ans=ans*(r-i);
        ans=ans/i;
        res.add(ans);
    }
    int[] op=new int[res.size()];
    // int k=0;
    for(int k=0;k<op.length;k++){
        op[k]=res.get(k);
    }
    return op;


    }
}