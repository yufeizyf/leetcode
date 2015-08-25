public class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        if(judgeZero(nums)) return "0";
        
        String[] s = new String[nums.length];
        for(int i = 0; i < s.length; i++) {
        	s[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
        	sb.append(s[i]);
        }
        
        return sb.toString();
    }
    
    public boolean judgeZero(int[] nums) {
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
