class Member {
	int num;
	int count;
}

public class Solution {
    List<Integer> result = new ArrayList<Integer>();
    Member[] mems = new Member[2];
    
    public List<Integer> majorityElement(int[] nums) {
        
        if(nums == null || nums.length == 0) return result;
        
        init();
        
        for(int i = 0; i < nums.length; i++) {
        	judge(nums[i]);
        }
        
        for(int i = 0; i < mems.length; i++) {
        	if(mems[i].count != 0) {
	        	mems[i].count = 0;
	        	for(int j = 0; j < nums.length; j++) {
	        		if(nums[j] == mems[i].num) {
	        			mems[i].count++;
	        		}
	        	}
	        	if(mems[i].count > nums.length/3) {
	    			result.add(mems[i].num);
	    		}
        	}
        }
        
        return result;
    }
    
    public void init() {
    	for(int i = 0; i < 2; i++) {
        	mems[i] = new Member();
	}
    }
    
    public void judge(int num) {
    	boolean flag = true;
    	
    	int zeroPos = -1;
    	for(int i = 0; i < 2; i++) {
    		if(num == mems[i].num) {
    			mems[i].count++;
    			flag = false;
    			zeroPos = -1;
    			break;
    		}
    		else if(mems[i].count == 0) {
    			zeroPos = i;
    			flag = false;
    		}
    	}
    	if(flag == true) {
    		for(int i = 0; i < mems.length; i++) {
    			mems[i].count--;
    		}
    	}
    	else if(zeroPos != -1){
    		mems[zeroPos].num = num;
			mems[zeroPos].count = 1;
    	}
    }
}
