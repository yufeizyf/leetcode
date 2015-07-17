public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length == 0) return null;
    	
    	int[] output = new int[nums.length];
    	
    	output[0] = 1;
    	for(int i = 1; i < output.length; i++) {
    		output[i] = output[i-1] * nums[i-1];
    	}
    	
    	int right = 1;
    	int temp = 1;
    	for(int i = nums.length - 1; i >= 0; i--) {
    		temp = nums[i];
    		nums[i] = right;
    		right = temp * nums[i];
    	}
    	
    	for(int i = 0; i < output.length; i++) {
    		output[i] = nums[i] * output[i];
    	}
    	
    	return output;
    }
}
