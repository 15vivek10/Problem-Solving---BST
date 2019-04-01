/*
Find Mode in Binary Search Tree
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
*/
class Solution {
    int max = 0;
        int cur = 0;
    Integer num=null;
    public int[] findMode(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        findmode(root, al);
        int[] res = new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i] = al.get(i);
        }
        return res;
    }
    public void findmode(TreeNode root, List<Integer> al){
        if(root==null)
            return;
        findmode(root.left,al);
        if(num==null || num<root.val){
            num = root.val;
            cur = 1;
        }else cur++;
        if(cur>max){
            max = cur;
            al.clear();
            al.add(num);
            
        }else if(cur==max && cur>0)
            al.add(num);
        findmode(root.right,al);
    }
}