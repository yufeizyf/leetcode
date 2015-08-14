// This Solution with O(1) space
public class Solution_1 {
	 public boolean isHappy(int n) {
		 if(n <= 0) return false;
		 
		 int fast = getNextN(getNextN(n)), slow = getNextN(n);
		 
		 while(slow != 1) {
			 if(slow == fast) {
				return false; 
			 }
			 slow = getNextN(slow);
			 fast = getNextN(getNextN(fast));
		 }
		 
		 return true;
	 }
	 
	 public int getNextN(int n) {
		 int result = 0;
		
		 while(n != 0) {
        	result += (n % 10) * (n % 10);
        	n = n / 10;
	     }
		 
		 return result;
	 }
}
