class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine whether answer is negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to safely handle Integer.MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        while (a >= b) {

            long temp = b;
            long multiple = 1;

            // Keep doubling divisor
            while (a >= (temp + temp)) {
                temp += temp;
                multiple += multiple;
            }

            // Subtract largest possible multiple
            a -= temp;
            quotient += multiple;
        }

        if (negative) {
            quotient = -quotient;
        }

        // 32-bit integer limits
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }
}