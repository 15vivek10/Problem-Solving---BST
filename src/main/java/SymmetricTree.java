/*
Symmetric Tree
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(TreeNode leftroot, TreeNode rightroot){
        if(leftroot==null && rightroot!=null)
            return false;
        if(leftroot!=null && rightroot==null)
            return false;
        if(leftroot==null && rightroot==null)
            return true;
        return ((leftroot.val==rightroot.val) && isSymmetric(leftroot.left,rightroot.right)
               && isSymmetric(leftroot.right,rightroot.left));
    }
}