class Solution {
    public void pattern5(int n) {
        int i=n;
        while(i>0){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            i--;
            System.out.println();

        }

    }
}