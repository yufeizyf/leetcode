public class Solution {
    public int mySqrt(int x) {
    	if(x < 0) return 0;
    	
        double s1 = 0, s2 = 2;
        
        while(Math.abs(s1-s2) > 0.0000001) {
        	s1 = s2;
        	s2 = 0.5 * (s1 + x / s1);
        }
        
        return (int)s1;
    }
}
