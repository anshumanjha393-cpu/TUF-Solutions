class Solution {
    public boolean isomorphicString(String s, String t) {
        //your code goes here
        int[] s_map=new int[26];
        int[] t_map=new int[26];
        Arrays.fill(s_map,-1);
        Arrays.fill(t_map,-1);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            int b=t.charAt(i)-'a';
            if(s_map[a]!=-1&&s_map[a]!=b){
                return false;
            }
            if(t_map[b]!=-1&&t_map[b]!=a){
                return false;
            }
                s_map[a]=b;
                t_map[b]=a;
            
        }
        return true;
    }
}