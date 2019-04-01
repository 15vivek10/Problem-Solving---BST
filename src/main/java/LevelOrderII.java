/*
Binary Tree Level Order Traversal II 
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
*/
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root,1,result);
        int size = result.size();
        for(int i=0;i<size/2;i++){
            List<Integer> temp = result.get(size-i-1);
            result.set(size-i-1,result.get(i));
            result.set(i,temp);
        }
        return result;
    }
    public void levelOrder(TreeNode root, int level, List<List<Integer>> result){
        if(root==null)
            return;
        if(level>result.size()){
            result.add(new ArrayList<>());
        }
        result.get(level-1).add(root.val);
        levelOrder(root.left,level+1,result);
        levelOrder(root.right,level+1,result);
    }
}