public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int expectSum = (nums.length)*(nums.length+1) / 2; 
        int realSum = 0;
        for(int i = 0; i < nums.length; i++) {
            realSum += nums[i];
        }
        
        return expectSum - realSum;
    }
}
