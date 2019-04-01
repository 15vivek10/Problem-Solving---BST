/*
 N-ary Tree Postorder Traversal
Given an n-ary tree, return the postorder traversal of its nodes' values.
*/
class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root!=null){
            for(Node node:root.children){
                postorder(node);
            }
            res.add(root.val);            
        }
        return res;
    }
}

