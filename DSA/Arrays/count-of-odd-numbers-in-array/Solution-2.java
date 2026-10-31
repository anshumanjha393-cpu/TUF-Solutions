class Solution{
    public int countOdd(int[] arr, int n) {
        int count=arr.length;
        for(int num:arr){
            if(num%2==0){
                count--;
            }
        }
        return count;
       
    }
}