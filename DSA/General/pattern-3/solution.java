class Solution {
    public void pattern3(int n) {
        int i=1;
        while(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            i++;
            System.out.println();
        }

    }
}