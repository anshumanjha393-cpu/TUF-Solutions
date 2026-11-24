class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // Your code goes here
        int left=0;
        int sum=0;
        for(int num:weights){
            if(left<num){
                left=num;
            }
            sum+=num;
        }
        int right=sum;
        while(left<=right){
            int mid=(left+right)/2;//capacity
            int total=0;
            int count=1;
            for(int i=0;i<weights.length;i++){
                if(total+weights[i]>mid){
                    count++;
                    total=weights[i];
                }
                else{
                    total+=weights[i];
                }
            }
            if(count>days){
                left=mid+1;
            }
            else{
                right=mid-1;
            }


        }
        return left;
    }
}