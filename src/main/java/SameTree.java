/*
Same Tree
	Given two binary trees, write a function to check if they are the same or not.
	Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
*/
class Solution {
    static boolean result;
	public boolean isSameTree(TreeNode p, TreeNode q) {
        result = true;
        return inorder(p,q);
    }
    
    public boolean inorder(TreeNode p, TreeNode q){
    	if(p==null && q==null)
            return result;
        if(p==null || q==null){
            result = false;
        	return result;
        }
    	inorder(p.left,q.left);
    	if(p.val!=q.val)
    		result = false;
    	inorder(p.right,q.right);
    	return result;
    }
}