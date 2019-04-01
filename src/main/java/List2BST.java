/*
Convert Sorted List to Binary Search Tree
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
*/
class Solution {
    ListNode head;
	public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        	return null;
        ListNode tempHead = head;
        this.head = head;
        int len = 0;
        while(tempHead!=null){
        	tempHead = tempHead.next;
        	len++;
        }
        return sortedListToBST(0,len-1);
    }
	
	public TreeNode sortedListToBST(int start, int end){
		if(start>end)
			return null;
		TreeNode left = sortedListToBST(start,(start+end)/2-1);
		TreeNode root = new TreeNode(head.val);
		head = head.next;
		root.left = left;
		root.right = sortedListToBST((start+end)/2+1,end);
		return root;
	}
}