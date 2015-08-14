public class Solution {

	public int divide(int dividend, int divisor) {

        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;//溢出

        if (divisor == Integer.MIN_VALUE) return (dividend == Integer.MIN_VALUE) ? 1 : 0;



        

        boolean positive = true;

        if((dividend>0 && divisor<0) || (dividend<0 && divisor>0)) {

        	positive = false;

        }

        

        long ldividend = Math.abs((long)dividend);

        long ldivisor = Math.abs((long)divisor);

        long tempDivisor = ldivisor;

        int result = 0; 

        int count = 1;



        while(ldividend >= ldivisor) {

        	ldividend -= tempDivisor;

        	result += count;

        	tempDivisor = tempDivisor << 1;

        	if(ldividend < tempDivisor) {

        		tempDivisor = ldivisor;

        		count = 1;

        	}

        	else {

        		count = count << 1;

        	}

        }

        

        result = positive==true?result:0-result;

        

        return result;

    }

}
