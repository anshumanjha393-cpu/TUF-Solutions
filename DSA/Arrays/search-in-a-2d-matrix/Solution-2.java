class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        for(int i=0;i<mat.length;i++){
            int left=0;
            int right=mat[0].length-1;
            if(mat[i][left]<=target&&mat[i][right]>=target){
                while(left<=right){
                    int mid=(left+right)/2;
                    if(mat[i][mid]==target){
                        return true;
                    }
                    if(mat[i][mid]<target){
                        left=mid+1;
                    }
                    else{
                        right=mid-1;
                    }
                }

            }
            else{
                continue;
            }

        }
        return false;

    }
}
