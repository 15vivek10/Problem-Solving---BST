/*
Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.
*/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        postorderTraversal(root,al);
        return al;
    }
    
    public void postorderTraversal(TreeNode root, List<Integer> al){
        if(root==null)
            return;
        postorderTraversal(root.left, al);
        postorderTraversal(root.right,al) ;
        al.add(root.val);
    }
}