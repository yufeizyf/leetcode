/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null || k <= 0) return 0;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current != null) {
        	TreeNode temp = current;
        	stack.push(temp);
        	current = current.left;
        }
        
        while(!stack.isEmpty()) {
        	TreeNode temp = stack.pop();
        	if(k == 1) {
        		return temp.val;
        	}
        	else { 
        		k--;
        	}    	
        	if(temp.right != null) {
        		TreeNode newCurrent = temp.right;
        		while(newCurrent != null) {
                	TreeNode newtemp = newCurrent;
                	stack.push(newtemp);
                	newCurrent = newCurrent.left;
                }
        	}
        }
        
        return 0;
    }
}
