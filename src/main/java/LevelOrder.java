/*Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).*/

class Solution {
   public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>(); 
		levelOrder(root,1,result);
		return result;
	}
	
	public void levelOrder(TreeNode root, int level, List<List<Integer>> result){
		if(root==null)
			return;
		if(level>result.size()){
			result.add(level-1,new ArrayList<>());
		}
		result.get(level-1).add(root.val);
		levelOrder(root.left,level+1,result);
		levelOrder(root.right,level+1,result);
	}
}