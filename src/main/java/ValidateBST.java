/*
Validate Binary Search Tree
Given a binary tree, determine if it is a valid binary search tree (BST).
*/
class Solution {
    
    	static Integer val;
	public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        val= null;
        return isValidBST(root, true,val);
    }
    public boolean isValidBST(TreeNode root, boolean valid, Integer val){
        if(root == null || valid==false)
            return valid;
        valid = isValidBST(root.left,valid,this.val);
        if(this.val==null)
            this.val = root.val;
        else if(root.val<=this.val){
            valid = false; 
            return valid;
        }
        this.val = root.val;
        valid = isValidBST(root.right,valid,this.val);
        return valid;
    }
}