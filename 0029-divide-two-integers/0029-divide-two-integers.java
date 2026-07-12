class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long values
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        // Check from highest bit to lowest bit
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                result += 1L << i;
                a -= b << i;
            }
        }

        // Apply sign
        if (negative) {
            result = -result;
        }

        return (int) result;
    }
}