class Solution {

    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long numerator = Math.abs((long) dividend);
        long denominator = Math.abs((long) divisor);

        int ans = 0;

        while (numerator >= denominator) {

            int count = 0;

            while (numerator >= (denominator << (count + 1))) {
                count++;
            }

            ans += (1 << count);
            numerator -= (denominator << count);
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }

        return ans;
    }
}