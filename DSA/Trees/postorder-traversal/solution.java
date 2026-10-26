/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
        List<Integer> ans=new ArrayList<>();
        rec(root,ans);
        return ans;
    }
    private void rec(TreeNode root,List<Integer> ans){
        if(root==null) return;
        rec(root.left,ans);
        rec(root.right,ans);
        ans.add(root.data);
    }
}