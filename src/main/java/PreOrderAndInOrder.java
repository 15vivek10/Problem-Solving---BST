/*Given preorder and inorder traversal of a tree, construct the binary tree.*/
class Solution {
    static int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        index = 0;
        return buildTree(preorder,inorder,0,inorder.length-1);
    }
    
    public TreeNode buildTree(int[] preorder,int[] inorder, int start,int end){
        if(start>end)
            return null;
        
        TreeNode node = new TreeNode(preorder[index]);
        index++;
        if(start==end)
            return node;
        int ind = search(inorder,start,end,node.val);
        node.left = buildTree(preorder,inorder,start,ind-1);
        node.right = buildTree(preorder,inorder,ind+1,end);
        return node;
    }
    public int search(int[] inorder,int start, int end, int val){
        for(int i=start;i<=end;i++){
            if(inorder[i]==val)
                return i;
        }
        return end;
    }
}