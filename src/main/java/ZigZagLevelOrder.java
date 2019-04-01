/*Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).*/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>(); 
		levelOrder(root,1,result,false);
		return result;
	}
	
	public void levelOrder(TreeNode root, int level, List<List<Integer>> result, boolean order){
		if(root==null)
			return;
		if(level>result.size()){
			result.add(level-1,new ArrayList<>());
		}
		if(order){
			result.get(level-1).add(root.val);
		}else{
			result.get(level-1).add(0,root.val);
		}
		levelOrder(root.right,level+1,result,!order);
		levelOrder(root.left,level+1,result,!order);
	}
}