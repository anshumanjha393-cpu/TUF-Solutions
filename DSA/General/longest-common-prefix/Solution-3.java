class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        if(str.length==0) return "";
        int maxlen=str[0].length();
        for(int i=1;i<str.length;i++){
            String s=str[0];
            String t=str[i];
            int j=0;
            while(j<t.length()&&j<maxlen){
                if(s.charAt(j)==t.charAt(j)){
                    j++;
                }
                else{
                    break;
                }
            }
            maxlen=Math.min(maxlen,j);
            if(maxlen==0) return "";
        }
        return str[0].substring(0,maxlen);
    }
}