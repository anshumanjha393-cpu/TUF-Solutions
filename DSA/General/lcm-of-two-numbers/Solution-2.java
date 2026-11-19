class Solution {
    public int LCM(int n1, int n2) {
        int  ans=n1*n2;
        int hcf=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0&&n2%i==0){
                hcf=i;
            }
        }
        return ans/hcf;



    }
}