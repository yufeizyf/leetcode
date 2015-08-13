public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        char[] number = Integer.toBinaryString(n).toCharArray();
        char[] numBits = new char[32];
        
        int pos = 0;
        for(int i = 0; i < 32-number.length; i++) {
        	numBits[i] = '0';
        	pos++;
        }
        for(int i = 0; i < number.length; i++) {
        	numBits[pos++] = number[i];
        }
        
        int begin = 0, end = numBits.length-1;
        while(begin <= end) {
        	char temp = numBits[begin];
        	numBits[begin] = numBits[end];
        	numBits[end] = temp;
        	begin++;
        	end--;
        }
        
        return Integer.parseUnsignedInt(new String(numBits), 2); 
    }
}
