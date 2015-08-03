public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        
        if(nums == null || nums.length == 0) return result;
        
        int start = 0, end = 1;
        
        while(end < nums.length) {
        	if(nums[end] == nums[end-1] + 1) {
        		end++;
        	}
        	else {
        		result.add(generateRange(nums, start, end));
        		start = end;
        		end++;
        	}
        }

        result.add(generateRange(nums, start, end));
	    
        return result;
    }
    
    public String generateRange(int[] nums, int start, int end) {
    	StringBuilder sb = new StringBuilder();
		if(start != end - 1) {
    		sb.append(nums[start]);
    		sb.append("->");
    		sb.append(nums[end-1]);
		}
		else {
			sb.append(nums[start]);
		}
		return sb.toString();
    }
}
