class Solution {
    public int GCD(int n1, int n2) {
        int length=Math.min(n1,n2);
        int ans=1;
        for(int i=1;i<=length;i++){
            if(n1%i==0&&n2%i==0){
                ans=Math.max(ans,i);
            }
        }
        return ans;

    }
}