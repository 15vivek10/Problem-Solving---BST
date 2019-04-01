/*
Sum Root to Leaf Numbers
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
*/
class Solution {
    	public int sumNumbers(TreeNode root) {
        return sumNumbers(root,"", 0);
    }
	
	public int sumNumbers(TreeNode root, String temp, int sum){
		if(root==null){
			return sum;
		}
		if(root.left==null && root.right==null){
			temp = temp+root.val;
			sum = sum+Integer.valueOf(temp);
			return sum;
		}else{
			temp = temp+root.val;
			sum = sumNumbers(root.left,temp,sum);
			sum = sumNumbers(root.right,temp,sum);
		}
		return sum;
	}
}