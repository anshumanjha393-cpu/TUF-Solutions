class Solution {
    public void pattern4(int n) {
        int i=1;
        while(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            i++;
            System.out.println();
        }

    }
}