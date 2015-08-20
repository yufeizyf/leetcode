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
	
	List<String> result = new ArrayList<String>();
	List<Integer> tempResult = new ArrayList<Integer>();
	
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return result;
        
        traverse(root);
        
        return result;
    }
    
    public void traverse(TreeNode root) {
    	tempResult.add(root.val);
    	
    	if(root.left == null && root.right == null) {
    		StringBuilder sb = new StringBuilder();
    		
    		sb.append(tempResult.get(0));
    		for(int i = 1; i < tempResult.size(); i++) {
    			sb.append("->");
    			sb.append(tempResult.get(i));
    		}
    		
    		result.add(sb.toString());
        	
    		tempResult.remove(tempResult.size()-1);
    		
    		return;
    	}
    
    	if(root.left != null) {
    		traverse(root.left);
    	}
    	
    	if(root.right != null) {
    		traverse(root.right);
    	}
    	
    	tempResult.remove(tempResult.size()-1);
    }
}
