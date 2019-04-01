/*Given inorder and postorder traversal of a tree, construct the binary tree.*/

class Solution {
    static int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0)
            return null;
        index = postorder.length-1;
        return buildTree(inorder,postorder,0,postorder.length-1);
    }
    public TreeNode buildTree(int[] inorder,int[] postorder, int start, int end){
        if(start>end)
            return null;
        TreeNode node = new TreeNode(postorder[index]);
        index--;
        if(start==end)
            return node;
        int ind = search(inorder,start,end,node.val);
        node.right = buildTree(inorder,postorder,ind+1,end);
        node.left = buildTree(inorder,postorder,start,ind-1);
        
        return node;
    }
    public int search(int[] inorder, int start,int end,int val){
        for(int i=start;i<=end;i++){
            if(inorder[i]==val)
                return i;
        } 
        return end;
    }
}
