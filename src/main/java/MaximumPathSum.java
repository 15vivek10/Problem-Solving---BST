/*
Binary Tree Maximum Path Sum
Given a non-empty binary tree, find the maximum path sum.
*/
class Solution {
    static int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxSum(root);
        return max;
    }
    
    public int maxSum(TreeNode root){
        if(root==null)
            return 0;
        int left = maxSum(root.left);
        int right = maxSum(root.right);
        max = Math.max(max,root.val+left+right);
        int current = root.val+Math.max(left,right);
        return current>0?current:0;
    }
}