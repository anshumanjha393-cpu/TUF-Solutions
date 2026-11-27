class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int r_left=0;
        int r_right=mat.length-1;
        while(r_left<=r_right){
            int r_mid=(r_left+r_right)/2;
            int col=mat[0].length-1;
            if(mat[r_mid][0]==target||mat[r_mid][col]==target) return true;
            if(mat[r_mid][0]<=target&&mat[r_mid][col]>=target){
                int c_left=0;
                int c_right=mat[0].length-1;
                while(c_left<=c_right){
                    int c_mid=(c_left+c_right)/2;
                    if(mat[r_mid][c_mid]==target) return true;
                    if(mat[r_mid][c_mid]<target){
                        c_left=c_mid+1;
                    }
                    else{
                        c_right=c_mid-1;
                    }
                }
            }
            if(mat[r_mid][0]<target&&mat[r_mid][col]<target){
                r_left=r_mid+1;
            }
            else{
                r_right=r_mid-1;
            }
        }
        return false;


    }
}
