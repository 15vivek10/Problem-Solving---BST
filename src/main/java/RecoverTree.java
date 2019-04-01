/*
Recover Binary Search Tree
Two elements of a binary search tree (BST) are swapped by mistake.
*/
class Solution {
    static TreeNode prev;
	public void recoverTree(TreeNode root) {
	     List<TreeNode> al = new ArrayList<>();
	     prev = null;
	       recoverTree(root,al);
	        if(al.size()>1){
	            int val = al.get(0).val;
	            al.get(0).val = al.get(al.size()-1).val;
	            al.get(al.size()-1).val = val;
	        }
	    }
	    public void recoverTree(TreeNode root, List<TreeNode> al){
	        if(root==null)
	            return;
	        recoverTree(root.left,al);
			if(this.prev !=null && root.val<this.prev.val){
				al.add(prev);
	            al.add(root);
			}
	        prev = root;
	        recoverTree(root.right,al);
       }
}