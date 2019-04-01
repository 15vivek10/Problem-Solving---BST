/*
Binary Tree Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values.
*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        if(root==null)
            return al;
        inorderTraversal(root,al);
        return al;
    }
    public void inorderTraversal(TreeNode root, List<Integer> al){
        if(root==null)
            return;
        inorderTraversal(root.left,al);
        al.add(root.val);
        inorderTraversal(root.right,al);
    }
}