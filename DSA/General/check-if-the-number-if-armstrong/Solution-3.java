class Solution {
    public boolean isArmstrong(int n) {
        int original=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;

        }
        n=original;
        int last=0;
        while(n>0){
            last=last+(int)Math.pow(n%10,count);
            n=n/10;

        }
        return original==last;

    }
}