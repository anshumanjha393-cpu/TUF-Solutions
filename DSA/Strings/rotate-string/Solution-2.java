class Solution {   
    public boolean rotateString(String s, String goal) {
        //your code goes here
        if(s.length()!=goal.length()) return false;
        StringBuilder sb=new StringBuilder(s);
        int k=s.length();
        while(k>0){
            char temp=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
            if(sb.toString().equals(goal)){
                return true;
            }
            k--;
        }
        return false;
    }
}