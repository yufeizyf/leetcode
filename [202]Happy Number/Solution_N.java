// This Solution with O(n) space 
public class Solution_N {
    public boolean isHappy(int n) {
        if(n <= 0) return false;
        
        HashSet<Integer> hset = new HashSet<Integer>();
        
        int result = 0;
        
        while(true) {
	        while(n != 0) {
	        	result += (n % 10) * (n % 10);
	        	n = n / 10;
	        }
	        
	        if(result == 1) {
        		return true;
        	}
        	else if(!hset.contains(result)) {
        		hset.add(result);
        		n = result;
        		result = 0;
        	}
        	else {
        		return false;
        	}
        }
    }
}
