public class MyAtoi {
    public int myAtoi(String s) {
        int ans = 0;
        int n = 1;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            n = -1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a >= '0' && a <= '9') {
                int digit = a - '0';

                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    return n == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            }
            else {
                break;
            }
        }

        return n * ans;
    }
}  