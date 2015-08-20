public class Solution {
	public boolean isUgly(int num) {		
        int[] factor = new int[]{2, 3, 5};
        
        for (int i = 0; i < 3 && num > 0; i++) {
            while (num % factor[i] == 0) {
                num /= factor[i];
            }
        }
        
        return num == 1;
    }
}
