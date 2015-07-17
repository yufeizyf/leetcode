public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length == 0) return null;
    	
    	int[] output = new int[nums.length];
    	
    	//Step1: make output[i] = nums[i] * nums[i-1] * ... * nums0 and set output[0] = 1. N is length of nums
    	output[0] = 1;
    	for(int i = 1; i < output.length; i++) {
    		output[i] = output[i-1] * nums[i-1];
    	}
    	
    	//Step2: make nums[i] = nums[i] * nums[i+1] * ... * numsN-1 and set nums[N] = 1
    	int right = 1;
    	int temp = 1;
    	for(int i = nums.length - 1; i >= 0; i--) {
    		temp = nums[i];
    		nums[i] = right;
    		right = temp * nums[i];
    	}
    	
    	//Step3: output[i] = output[i] * nums[i]
    	for(int i = 0; i < output.length; i++) {
    		output[i] = nums[i] * output[i];
    	}
    	
    	return output;
    }
}
