/*
Convert Sorted Array to Binary Search Tree
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return sort(nums,0,nums.length);
    }
    
    public TreeNode sort(int[] nums,int start, int end){
        if(start==end)
            return null;
        if(start == end-1)
            return new TreeNode(nums[start]);
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sort(nums,start,mid);
        node.right = sort(nums,mid+1,end);
        return node;
       
    }
}