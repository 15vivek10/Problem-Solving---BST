/*Given a binary tree, find its maximum depth.*/

class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }
    public int maxDepth(TreeNode root, int length){
        if(root==null)
            return length;
        int l1 = maxDepth(root.left,length+1);
        int l2 = maxDepth(root.right,length+1);
        if(l1>l2)
         return l1;
        else return l2;
    }
}