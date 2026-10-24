class Solution {
    public void pattern2(int n) {
        int i=1;
        while(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }

    }
}