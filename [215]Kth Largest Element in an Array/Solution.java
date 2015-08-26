public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        int pos = partition(nums, 0, nums.length-1);
        while((pos+1) != k) {
        	if((pos+1) > k) {
        		pos = partition(nums, 0, pos-1);
        	}
        	else {
        		pos = partition(nums, pos+1, nums.length-1);
        	}
        }
        return nums[pos];
    }
    
    public int partition(int[] nums, int begin, int end) {
    	int pivot = nums[begin];
    	
    	while(begin < end) {
    		while(begin < end && nums[end] <= pivot) end--;
    		nums[begin] = nums[end];
    		while(begin < end && nums[begin] >= pivot) begin++;
    		nums[end] = nums[begin];
    	}
    	nums[end] = pivot;
    	return end;
    }
}
