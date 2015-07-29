public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        
        int num = n & (n-1);
        if(num == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
