class Solution {
    public int floorSqrt(int n) {
        if(n==1||n==0) return n;
        long ans=1;
        for(long i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;

            }
            else{
                break;
            }
        }
        return (int)ans;
      
    }
}