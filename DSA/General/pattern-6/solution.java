class Solution {
    public void pattern6(int n) {
        int i=n;
        while(i>0){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            i--;
            System.out.println();
        }

    }
}