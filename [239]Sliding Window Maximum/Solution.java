public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums == null || nums.length == 0 || k == 0) return new int[]{};
    	
    	int[] result = new int[nums.length-k+1];
    	
    	// 存数组元素的索引
    	Deque<Integer> queue = new LinkedList<Integer>();
    	int pos = 0;
    	
    	initQueue(queue, nums, k);
    	result[pos++] = nums[queue.peekFirst()];
    	
    	for(int i = k; i < nums.length; i++) {
    		//clear empty not in window
    		while(!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
    			queue.removeFirst();
    		}
    		
    		while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
    			queue.removeLast();
    		}
    		queue.addLast(i);

    		result[pos++] = nums[queue.peekFirst()];
    	}
    	
    	return result;
    }
    
    public void initQueue(Deque<Integer> queue, int[] nums, int k) {
    	for(int i = 0; i < k; i++) {
    		while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
    			queue.removeLast();
    		}
    		queue.addLast(i);
    	}
    }
}
