class Solution {
    public int floorSqrt(int n) {
        if(n==0||n==1) return n;
        long left=1;
        long right=n;
        long ans=1;

        while(left<=right){
            long mid=(left+right)/2;
            if(mid*mid<=n){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (int)ans;
      
    }
}