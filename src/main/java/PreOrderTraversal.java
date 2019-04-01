/*
Binary Tree Preorder Traversal
Given a binary tree, return the preorder traversal of its nodes' values.
*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
            preorderTraversal(root,al);
        return al;
    }
    
    public void preorderTraversal(TreeNode root, List<Integer> al){
        if(root==null)
            return;
        al.add(root.val);
        preorderTraversal(root.left,al);
        preorderTraversal(root.right,al);
    }
}