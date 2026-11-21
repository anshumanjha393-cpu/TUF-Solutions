class Solution {
    public int primeUptoN(int n) {
        int[] prime=new int[n+1];
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==1){
                for(int j=2*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<prime.length;i++){
            if(prime[i]==1)count++;
        }
        return count;

    }
}