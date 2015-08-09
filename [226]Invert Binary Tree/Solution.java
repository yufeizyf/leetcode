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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        invert(root);
        
        return root;
    }
    
    public void invert(TreeNode root) {
    	if(root.left == null && root.right == null) return;
    	
    	TreeNode temp = root.left;
    	root.left = root.right;
    	root.right = temp;
    	
    	if(root.left != null) {
    		invert(root.left);
    	}
    	
    	if(root.right != null) {
    		invert(root.right);
    	}
    }
}
