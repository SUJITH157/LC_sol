class Solution {

    int sign = 1;
    long ans = 0;
    int index = 0;

    public int myAtoi(String s) {

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {

            if (s.charAt(index) == '-') {
                sign = -1;
            }

            index++;
        }

        solve(s);

        return (int)(sign * ans);
    }

    public void solve(String s) {

        if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return;
        }

        int digit = s.charAt(index) - '0';

        ans = ans * 10 + digit;

        if (sign == 1 && ans > Integer.MAX_VALUE) {
            ans = Integer.MAX_VALUE;
            return;
        }

        if (sign == -1 && -ans < Integer.MIN_VALUE) {
            ans = -(long)Integer.MIN_VALUE;
            return;
        }

        index++;

        solve(s);
    }
}